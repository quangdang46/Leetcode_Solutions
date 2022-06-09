class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        int p[2]={0};
        int diff=0;
        for(int i=0; i<s1.size(); i++){
            if (s1[i] ==s2[i]) continue;
            if (diff < 2) p[diff] = i;
            diff++;
        }
        
        return (diff==0) || ( (diff == 2) && s1[p[0]] == s2[p[1]] && s1[p[1]] == s2[p[0]]);
    }
};