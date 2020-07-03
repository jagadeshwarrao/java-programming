import java.util.*;
import java.io.IOException;
public class Client2
{
   public static void main(String args[]) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        streamWriter.write("enter time");
        float time = scanner.nextFloat();
	streamWriter.write("enter rate");
        float rate = scanner.nextFloat();
        float interest = simpleInterest(amount, rate, time);
        
    }
 
    public static float simpleInterest(float principle, float rate, float time)
    {
        float interest = (principle*rate*time)/100;
        return interest;
    }
   
}
