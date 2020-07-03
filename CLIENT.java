import java.util .*;
class CLIENT
{
    public static void main (String args[ ])
   {
    double pr, rate, t;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    pr=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    sim(pr,t,rate);
    com(pr,t,rate);
   }
    public double sim(pr,t,rate)
   {
    int simple=(pr * t * rate)/100;
    return simple;
    }
    public double com(pr,t,rate)
   {
    int compund=pr * Math.pow(1.0+rate/100.0,t) - pr;
    return compund;
    }

}