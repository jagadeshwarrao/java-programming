import java.util.*;
class Candies
{
 int candy_count,c_weight;
 Candies(int c)
 {
  c_weight=2;
  candy_count=c;
 }
 int Candies_weight()
 {
  return c_weight*candy_count;
 }
}
class Sweets
{
 int sweets_count,s_weight;
 Sweets(int s)
 {
  s_weight=5;
  sweets_count=s;
 }
 int sweets_weight()
 {
  return s_weight*sweets_count;
 }
}
public class Main2
{
 public static void main(String args[])
 {
  Candies c=new Candies(3);
  Candies c1=new Candies(5);
  Candies c2=new Candies(6);
  Sweets s=new Sweets(6);
  Sweets s1=new Sweets(8);
  Sweets s2=new Sweets(4);
  int x[]=new int[3];
  x[0]=c.Candies_weight()+s.sweets_weight();
  x[1]=c1.Candies_weight()+s1.sweets_weight();
  x[2]=c2.Candies_weight()+s2.sweets_weight();
  Arrays.sort(x);
  for(int i=0;i<3;i++){
   System.out.println(x[i]);
 }
}
}

