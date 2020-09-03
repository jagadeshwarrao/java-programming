import java.io.*;
import java.util.*;
class RSF{
	public static int findSingleRSF(int input1){
		int temp=input1;
		int a=0,b=0;
		int r=0;
		String s=Integer.toString(temp);
		while(temp>9){
                                   r=0;
		for(int i=0;i<s.length()-1;i++){
                                                     String s1=""+s.charAt(i);
                                                     String s2=""+s.charAt(i+1);
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			r=(r*10)+Math.abs(a-b);
		}
			s=Integer.toString(r);
			temp=r;
		}
		return r;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(findSingleRSF(n));
	}
}