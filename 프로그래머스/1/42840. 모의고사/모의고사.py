def solution(answers):
  answer = []

  one = [1,2,3,4,5]
  two = [2,1,2,3,2,4,2,5]
  three = [3,3,1,1,2,2,4,4,5,5]

  score1 = 0
  score2 = 0
  score3 = 0

  idx1 = 0
  idx2 = 0
  idx3 = 0

  for i in range(len(answers)):
      if answers[i] == one[idx1]:
          score1 += 1
      if answers[i] == two[idx2]:
          score2 += 1
      if answers[i] == three[idx3]:
          score3 += 1

      idx1 += 1
      idx2 += 1
      idx3 += 1

      if idx1 == len(one):
          idx1 = 0
      if idx2 == len(two):
          idx2 = 0
      if idx3 == len(three):
          idx3 = 0

  max_score = max(score1, score2, score3)
  if score1 == max_score:
    answer.append(1)
  if score2 == max_score:
    answer.append(2)
  if score3 == max_score:
    answer.append(3)

  return answer