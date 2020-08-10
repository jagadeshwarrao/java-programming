import java.io.*;
import java.util.*;
class GlobalMaximum {
    public static boolean check(int a[], int n, int m, int d)
    {
        int last_pos = a[0];
        int  count = 1;
        for(int i=0;i<n;i++){
            if(a[i] - last_pos >= d){
                count ++;
                last_pos = a[i];
            }
            if(count == m){
                return true;
            }
        }
        return false;
    }
    public static long fun(int a[],int n,int m,int lo,int hi)
    {
        long ans=0;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(check(a,n,m,mid))
            {
                ans = mid;
                lo = mid+1;
            }
            else
                hi = mid-1;
        }
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
       // String[] inp=br.readLine().split(" ");
        
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        int m=Integer.parseInt(br.readLine());
        System.out.println(fun(a,n,m,1,1000000000));
      }
}