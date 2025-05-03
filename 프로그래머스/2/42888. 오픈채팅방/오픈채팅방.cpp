#include <string>
#include <vector>
#include <sstream>
#include <unordered_map>

using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
    unordered_map<string, string> uidToNickname;
    vector<pair<string, string>> logs; 

    for (const string& line : record) {
        stringstream ss(line);
        string action, uid, nickname;
        ss >> action >> uid;

        if (action == "Enter" || action == "Change") {
            ss >> nickname;
            uidToNickname[uid] = nickname; 
        }

        if (action == "Enter" || action == "Leave") {
            logs.push_back({action, uid}); 
        }
    }

    for (const auto& [action, uid] : logs) {
        string nickname = uidToNickname[uid];
        if (action == "Enter") {
            answer.push_back(nickname + "님이 들어왔습니다.");
        } else if (action == "Leave") {
            answer.push_back(nickname + "님이 나갔습니다.");
        }
    }

    return answer;
}
