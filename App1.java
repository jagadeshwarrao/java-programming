import java.io.File;
import java.io.FileWriter;
import java.util.*;
import Home.Home;
class App1
{
public static void main(String args[])
{
Home home=new Home();
            double[] arr=new double[3];
            try
            {
        File fileObj = new File("file.txt");
        Scanner Reader = new Scanner(fileObj);
string material=Reader.nextLine();
int area=Reader.nextLine();
boolean automated=Reader.nextLine();
Reader.close();
            }
            catch(Exception e)
            {
             System.out.println("No file");
            }
            try
            {
              FileWriter Writer = new FileWriter("C:/Users/sai70/java/output.txt");
         Writer.write("Construction cost of the house is:"+house.constructionCost(material,area,automated));
         Writer.close();
            }
            catch(Exception e)
            {
             System.out.println("no file");
            }
}
}

