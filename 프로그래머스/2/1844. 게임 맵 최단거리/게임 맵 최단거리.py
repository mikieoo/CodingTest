from collections import deque

def solution(maps):
    q = deque()
    q.append((0, 0, 1)) 

    visited = set()
    visited.add((0, 0))

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    while q:
        x, y, dist = q.popleft()

        if x == len(maps) - 1 and y == len(maps[0]) - 1:
            return dist

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]):
                if maps[nx][ny] == 1 and (nx, ny) not in visited:
                    visited.add((nx, ny))
                    q.append((nx, ny, dist + 1))

    return -1 