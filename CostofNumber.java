import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CostofNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String s1=s.next();
        String s2=s.next();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(String.valueOf(s1.charAt(i*2)));
            b[i]=Integer.parseInt(String.valueOf(s2.charAt(i*2)));
        }
        int i=n-1;
        int j=n-1;
        String k="";
        while(i>-1 && j>-1){
            if(a[i]>b[j]){
                k=k+a[i];
                i--;
            }
            else{
                k=k+b[j];
                j--;
            }
        }
        if(i==-1 && j>-1){
            for(int h=j;h>-1;h--){
                k=k+b[h];
            }
        }
        else if(j==-1 && i>-1){
            for(int h=i;h>-1;h--){
                k=k+a[h];
            }
        }
    System.out.println(k);
        
    }
}