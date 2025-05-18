def solution(tickets):
    tickets.sort() 
    
    visited = [False] * len(tickets)
    answer = []

    def dfs(current, path):
        if len(path) == len(tickets) + 1:
            answer.append(path)
            return
        
        for i in range(len(tickets)):
            a, b = tickets[i]
            if not visited[i] and a == current:
                visited[i] = True
                dfs(b, path + [b])
                visited[i] = False

    dfs('ICN', ['ICN'])

    return answer[0]