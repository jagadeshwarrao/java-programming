package com.home.construction;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import org.apache.log4j.Logger;
class App2
{
public static void main(String args[])
{
App2 home=new App2();
            String material="",automated="";
            int area1=0;
            try
            {
        File fileObj = new File("src/main/java/file.txt");
        Scanner Reader = new Scanner(fileObj);
        material=Reader.nextLine();
        String area=Reader.nextLine();
        area1=Integer.parseInt(area);
        automated=Reader.nextLine();
        Reader.close();
            }
            catch(Exception e)
            {
             System.out.println("No file");
            }
            try
            {
              FileWriter Writer = new FileWriter("src/main/java/output.txt");
         Writer.write("Construction cost of the house is:"+home.HomeConstructionCost(material,area1,automated));
         Writer.close();
            }
            catch(Exception e)
            {
             System.out.println("no file");
            }
}
}


       
