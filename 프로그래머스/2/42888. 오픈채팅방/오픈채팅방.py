def solution(record):
  uid_to_nick = {}
  actions = []

  for rec in record:
      parts = rec.split()
      if parts[0] == "Enter":
          uid_to_nick[parts[1]] = parts[2]
          actions.append((parts[0], parts[1]))
      elif parts[0] == "Leave":
          actions.append((parts[0], parts[1]))
      elif parts[0] == "Change":
          uid_to_nick[parts[1]] = parts[2]

  result = []
  for action, uid in actions:
      nickname = uid_to_nick[uid]
      if action == "Enter":
          result.append(f"{nickname}님이 들어왔습니다.")
      elif action == "Leave":
          result.append(f"{nickname}님이 나갔습니다.")

  return result