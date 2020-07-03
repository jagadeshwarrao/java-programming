public class Home 
{
public int HomeConstructionCost(String material,int area,String standard,int choice)
 {
if(standard.equals("automated home") && material.equals("high standard"))
  {
   return area*2500;
  }
switch (choice) 
        { 
        case 1: 
            material.equals("high standard");
            return area*1800; 
             
        case 2: 
            material.equals("above standard"); 
            return area*1500;
        case 3: 
            material.equals("standard"); 
            return area*1200;
              
        default: 
            return 0; 
             
        }
 }
} 
