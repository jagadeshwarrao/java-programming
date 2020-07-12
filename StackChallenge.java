import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackChallenge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int t=s.nextInt();
            int r=0;
            int[] a={0,0,0,0,0,0,0,0,0,0};
            while(t>0){
                a[t%10]=a[t%10]+1;
                t=t/10;
            }
            for(int j=0;j<10;j++){
                if(a[j]>0){
                    r=r+j;
                }
            }
            System.out.println(r);
        }
    }
}