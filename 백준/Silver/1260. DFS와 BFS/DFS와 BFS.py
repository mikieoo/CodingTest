from collections import deque

n, m, v = map(int, input().split())
edges = [list(map(int, input().split())) for _ in range(m)]

graph = [[] for _ in range(n + 1)]
for a, b in edges:
    graph[a].append(b)
    graph[b].append(a)

for g in graph:
    g.sort()

def dfs(vertex, visited):
    visited.add(vertex)
    print(vertex, end=' ')
    for neighbor in graph[vertex]:
        if neighbor not in visited:
            dfs(neighbor, visited)

def bfs(start):
    visited = set()
    q = deque([start])
    visited.add(start)

    while q:
        vertex = q.popleft()
        print(vertex, end=' ')
        for neighbor in graph[vertex]:
            if neighbor not in visited:
                visited.add(neighbor)
                q.append(neighbor)

visited_dfs = set()
dfs(v, visited_dfs)
print()
bfs(v)