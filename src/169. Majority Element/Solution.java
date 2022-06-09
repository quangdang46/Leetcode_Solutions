// import java.util.*;
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map= new HashMap<Integer,Integer>();
//         for(int num:nums) {
//             if(map.containsKey(num)) {
//                 map.put(num,map.get(num)+1);
//                 if(map.get(num)>(nums.length/2)) return num;
//             }else{
//                 map.put(num,1);
//             }
//         }
//         for(int num:map.keySet()){
//             if(map.get(num)>(nums.length/2)) return num;
//         }
//         return 0;
//     }
// }


class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}