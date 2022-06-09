class Solution {
    public int largestAltitude(int[] gain) {
        int maxValue=0;
        int[] prefix= new int[gain.length+1];
        int i=0,j=1;
        while(i<gain.length) {
            
            prefix[j]=prefix[j-1]+gain[i];
            if(prefix[j]>maxValue)
                maxValue=prefix[j];
            i++;
            j++;
        }
        return maxValue;
        
    }
}