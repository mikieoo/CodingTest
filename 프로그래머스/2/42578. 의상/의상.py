def solution(clothes):
    dir = {}
    answer = 1

    for a, b in clothes:
        if b not in dir:
            dir[b] = [a]
        else:
            dir[b].append(a)

    for key in dir:
      answer *= (len(dir[key]) + 1)
    
    return answer - 1