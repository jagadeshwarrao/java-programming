package com.home.construction;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class App5
{
  	
        
public static void main(String args[])
{
            Logger logger=Logger.getLogger(App5.class.getName());
            logger.log(Level.INFO,"lets estimate the home construction cost");
            Home2 home=new Home2();
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


       
