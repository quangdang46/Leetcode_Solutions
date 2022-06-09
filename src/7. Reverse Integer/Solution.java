class Solution {
    public int reverse(int x) {
        long result = (long)x;
        String s = Long.toString(Math.abs((long)x));
        long tmp=Long.parseLong(new StringBuilder(s).reverse().toString());
        if(tmp>Integer.MAX_VALUE||tmp<Integer.MIN_VALUE)
            return 0;
        return result< 0 ? -(int)tmp : (int)tmp;
    }
}



// class Solution {
//     public int reverse(int x) {
//         long res=0;
//         while(x!=0){
//             res=res*10+x%10;
//             x=x/10;
//         }
//         return res>Integer.MAX_VALUE|| res<Integer.MIN_VALUE ? 0: (int) res;
        
//     }
// }