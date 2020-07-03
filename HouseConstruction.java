package costestimation;
import java.util.*;
public class HouseConstruction
{
public void area(double area)
{
Scanner a=new Scanner(System.in);
double squarefeet=area/10.76;
double spendmoney;
//"1.Standard Material 2.Above Standard Materials 3.High Standard Material 4.High Standard Material & Fully Automated*
int type=a.nextInt();
switch(type)
    {
   case 1:spendmoney=1200*squarefeet;
        break;
   case 2:spendmoney=1500*squarefeet;
        break;
   case 3:spendmoney=1800*squarefeet;
        break;
   case 4:spendmoney=2500*squarefeet;
        break;
   default :
       return;
   }

}
}

