from collections import deque

n = int(input())
m = int(input())
computers = [list(map(int, input().split())) for _ in range(m)]

graph = [[] for _ in range(n + 1)]
for a, b in computers:
    graph[a].append(b)
    graph[b].append(a)

for g in graph:
    g.sort()

def bfs(n, m, computers):
  q = deque()
  q.append(1)
  visited = set([1])

  count = 0
  while q:
    node = q.popleft()

    for neighbor in graph[node]:
        if neighbor not in visited:
          visited.add(neighbor)
          q.append(neighbor)
          count += 1

  return count

print(bfs(n, m, computers))