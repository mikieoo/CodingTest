from collections import deque

def solution(numbers, target):
    queue = deque()
    queue.append((0, 0, "")) 
    answer = 0

    while queue:
        index, total, ops = queue.popleft()

        if index == len(numbers):
            if total == target:
                answer += 1
        else:
            num = numbers[index]
            queue.append((index + 1, total + num, ops + f"+{num} "))
            queue.append((index + 1, total - num, ops + f"-{num} "))

    return answer