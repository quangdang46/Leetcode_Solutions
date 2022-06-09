// class Solution {
//     public int[] plusOne(int[] digits) {
//         int n=digits.length;
//         int carry=1;
//         int i=n-1;
//         while(i>=0 && carry>0){
//             int sum=digits[i]+carry;
//             digits[i]=sum%10;
//             carry=sum/10;
//             i--;
//         }
//         if(carry>0){
//             int[] res=new int[n+1];
//             res[0]=carry;
//             for(int j=1;j<=n;j++){
//                 res[j]=digits[j-1];
//             }
//             return res;
//         }
//         return digits;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else
                digits[i] = 0;
        }
        int[] number = new int[n + 1];
        number[0] = 1;

        return number;
    }

}