class Solution {
    public:
        string interpret(string command) {
            string result;
            for (int i = 0; i < size(command);) {
                if (command[i] == 'G') {
                    result += 'G', ++i;
                } else if (command[i + 1] == ')') {
                    result += 'o', i += 2;
                } else {
                    result += "al", i += 4;
                }
            }
            return result;
        }
};

class Solution {
public:
    string interpret(string &command) {
        vector<char> stk;
        string outputs;
        for (char &c: command) {
            if (c == 'G') { outputs.push_back(c); }
            else if (c == ')') {
                if (stk.back() == '(') {
                    outputs.push_back('o');
                }
                else {
                    outputs.push_back('a');
                    outputs.push_back('l');
                    stk.pop_back(); // pop a
                    stk.pop_back(); // pop l
                }
                stk.pop_back(); // pop (
            }
            else { stk.push_back(c); }
        }
        return outputs;
    }
};