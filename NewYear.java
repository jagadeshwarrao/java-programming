import java.util.*;
public class NewYear {
public static void main(String args[])
{
int totals=0;
int totalc=0;
int sweets=0;
int chocis=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter range of the gift");
int range=s.nextInt();
System.out.println("enter upper limit");
int u=s.nextInt();
System.out.println("enter lower limit");
int l=s.nextInt();
List<String> n=new ArrayList<String>();
for(int i=0;i<range;i++)
{
Scanner sw=new Scanner(System.in);
int m=sw.gift();
if(m==1)
{
Abc a=new Abc();
if(a.Weight()>=l && a.Weight()<=u)
{
if(n.contains("Abc")==false)
{
n.add("Abc");
}
totals=totals+a.gift();
}
else
{
System.out.println("Abc not possible,Please choose other than this");

}
}
if(m==2)
{
Xyz a=new Xyz();
if(a.Weight()>=l && a.Weight()<=u)
{
if(n.contains("Xyz")==false)
{
n.add("Xyz");
}
totals=totals+a.gift();
}
else
{
System.out.println("Xyz not possible,Please choose other than this");

}
}
sweets++;
Chocos cw=new Chocos();
int x=cw.gift();
if(x==1)
{
   Dairymilk a=new Dairymilk();
if(a.Weight()>=l && a.Weight()<=u)
{
if(n.contains("Dairymilk")==false)
{
n.add("Dairymilk");
}
totalc=totalc+a.gift();
}
else
{
System.out.println("Dairymilk not possible,Please choose other than this");

}
}
if(x==2)
{
Fivestar a=new Fivestar();
if(a.Weight()>=l && a.Weight()<=u)
{
if(n.contains("Fivestar")==false)
{
n.add("Fivestar");
}
totalc=totalc+a.gift();
}
else
{
System.out.println("Fivestar not possible,Please choose other than this");

}
}
chocis++;
}
int k=(chocis*totalc+sweets*totals);
System.out.println("Total number of sweets="+sweets);
System.out.println("Total number of candies="+chocis);
System.out.println("Weight of box="+k);
System.out.println("number of candies are");
for(int i=0;i<n.size();i++)
{
System.out.println(n.get(i)+" ");
}


}
}


