N = int(input())

list = []

for _ in range(N):
    start, end = map(int, input().split())
    list.append([start, end])

list.sort(key=lambda x: (x[1], x[0]))

meetings = []

last_end = 0
count = 0

for start, end in list:
    if start >= last_end:
        count += 1
        last_end = end  

print(count)