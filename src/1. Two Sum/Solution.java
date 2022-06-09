import java.util.*;
class Solution {
    public static int[] twoSum(int[] a, int target) {
        int b[]=new int[2];
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
            if((a[i]+a[j])==target)
            {
                b[0]=i;
                b[1]=j;
                break;
            }
            else
            {
                continue;
            }
        	}
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int x[]=twoSum(a,target);
        for(int i=0;i<2;i++)
            System.out.print(x+" ");
    }
}