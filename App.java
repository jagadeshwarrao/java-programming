import java.io.*;
import java.util.*;
import java.util.Scanner;
class NewYear
{
   Scanner ss=new Scanner(System.in);
   int weight=ss.nextInt();
   int no_of_chocos=ss.nextInt();
   int candie_price=ss.nextInt();
   String name_of_choco=ss.nextLine();
   
}
class Chocos extends NewYear
{
}
public class App
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of gifts");
        int n=s.nextInt();
        NewYearGift N[]=new NewYearGift[n];
        int total=0;
        for(int i=0;i<n;i++)
        {
          total=total+N[i].weight;
        }
        System.out.println("total weight of gifts="+total);
        System.out.print("candies Range");
        System.out.println("enter the upper and lower limits of the range");
        int u=s.nextInt();
        int l=s.nextInt();
        for(int i=0;i<n;i++)
        {
          if(N[i].candie_price<=u && N[i].candie_price>=u)
          {
            System.out.println(N[i].name_of_choco);
          }
        }
    }
   
}
