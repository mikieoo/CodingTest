def solution(n, computers):
    visited = set()

    def dfs(node):
        visited.add(node)
        for neighbor in range(n):
            if computers[node][neighbor] == 1 and neighbor not in visited:
                dfs(neighbor)

    answer = 0
    for i in range(n):
        if i not in visited:
            dfs(i)
            answer += 1

    return answer