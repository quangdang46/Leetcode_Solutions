// class Solution {
//     public int romanToInt(String s) {
//         HashMap<String,Integer> map = new HashMap<String,Integer>();
//         map.put("I",1);
//         map.put("V",5);
//         map.put("X",10);
//         map.put("L",50);
//         map.put("C",100);
//         map.put("D",500);
//         map.put("M",1000);
//         map.put("IV",4);
//         map.put("IX",9);
//         map.put("XL",40);
//         map.put("XC",90);
//         map.put("CD",400);
//         map.put("CM",900);
//         int sum = 0;
//         for(int i = 0; i < s.length(); i++){
//             if(i+1 < s.length() && map.containsKey(s.substring(i,i+2))){
//                 sum += map.get(s.substring(i,i+2));
//                 i++;
//             }
//             else{
//                 sum += map.get(s.substring(i,i+1));
//             }
//         }
//         return sum;
//     }
// }


class Solution 
{
    public int romanToInt(String S) 
    {
        int ans = 0, num = 0;
        
        for (int i = S.length()-1; i >= 0; i--) 
        {
            switch(S.charAt(i)) 
            {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}