class Solution {
    public int subtractProductAndSum(int n) {
        int res1=0;
        int res2=1;
        while(n!=0){
            int rem=n%10;
            res1+=rem;
            res2*=rem;
            n/=10;
        }
        return res2-res1;
    }
}