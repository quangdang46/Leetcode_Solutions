class Solution {
    public double average(int[] salary) {
        double sum=0,min=Long.MAX_VALUE,max=0;
        for(int tmp :salary ){
            sum=sum+tmp;
            if(tmp > max) max=tmp;
            if(tmp < min) min=tmp;
        }
        return (double)(sum- min - max) /  (salary.length -2 );
    }
}