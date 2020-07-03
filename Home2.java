package com.home.construction;

public class Home2 
{
	public int HomeConstructionCost(String material,int area,String standard)
	 {
	if(standard.equals("automated home") && material.equals("high standard"))
	  {
	   return area*2500;
	  }
	int choice;
	 if(material.equals("high standard"))
	 {
		 choice = 1;
	 }
	 else if(material.equals("above standard"))
	 {
		 choice = 2;
	 }
	 else if(material.equals("standard"))
	 {
		 choice = 3;
	 }
	 else
	 {
		choice = 0; 
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
