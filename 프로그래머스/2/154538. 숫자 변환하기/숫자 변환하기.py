from collections import deque

def solution(x, y, n):
    q = deque()
    q.append((x, 0))  

    visited = set() 
    visited.add(x)

    while q:
        num, count = q.popleft()

        if num == y:
            return count

        for next_num in (num + n, num * 2, num * 3):
            if next_num <= y and next_num not in visited:
                visited.add(next_num)
                q.append((next_num, count + 1))

    return -1