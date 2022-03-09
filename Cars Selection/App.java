package com.cars.assignment.CarsComp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
	
//	public static int selectOption(Object arr){
//		Iterator<String> itr1 =((ArrayList<String>) arr).iterator();
//        int i=0;
//		while (itr1.hasNext())  
//		{
//		System.out.println("Choose" +i+". "+itr1.next());  
//	      
//		  i++;
//		}
//		Scanner sc = new Scanner(System.in);
//		
//		return sc.nextInt();
//		
//	}
	public static void main(String[] args) {
		try {
			
		HashMap<String,Object> map=new HashMap();
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("NavyBlue");
		colors.add("White");
		colors.add("Orange");
		
		ArrayList<String> tyres = new ArrayList<String>();
		tyres.add("HERO");
		tyres.add("MRF");
		tyres.add("CEAT");
		
		ArrayList<String> seats = new ArrayList<String>();
		seats.add("BRITAX");
		seats.add("GRACO");
		seats.add("SAFETYLEON");

		ArrayList<String> brand = new ArrayList<String>();
		brand.add("tata");
		brand.add("hyundai");
		brand.add("honda");
        
		
		map.put("Brand", brand);
		map.put("Color", colors);
		map.put("Tyre", tyres);
		map.put("Seat", seats);
        
        
     
	

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		

       // int i=0;
		
//		System.out.println("Welcome to Venkata Raja Showroom \nEnter your car brand name : ");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		boolean isAvailable = brand.contains(str.toLowerCase());
//		Iterator<String> itr = brand.iterator(); 
//		if(!isAvailable) {
//			System.out.println("Sorry! "+str+" brand is not available.\nPlease choose an option from the below brands :");
//		}
//		
//
//		for(Map.Entry m : map.entrySet()){ 
//			int i=1;
//			 if(isAvailable && m.getKey()=="Brand") {
//					continue;	
//				}
//			System.out.println("Please choose the option for the "+m.getKey());
//	           // System.out.println(+" "+m.getValue());    
//			Iterator<String> itr1 =((ArrayList<String>) m.getValue()).iterator();
//			while (itr1.hasNext())  
//			{
//			System.out.println(i+". "+itr1.next());  
//		      
//			  i++;
//			}
//			
//			
//	    }  
//		
			
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Venkata Raja Showroom");
		
		Color color = (Color) context.getBean("color");
		Tyre tyre = (Tyre) context.getBean("tyre");
		Seat seat = (Seat) context.getBean("seat");

		System.out.println("Select Car: ");
		for (int i = 0; i < brand.size(); i++) {
			System.out.println((i+1) + " " + brand.get(i).toUpperCase());
		}
		
		int cn = sc.nextInt();
		
		
		
		System.out.println("Select Color: ");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println((i+1) + " " + colors.get(i));
		}
		
		int c = sc.nextInt();
		color.setColor(colors.get(c));

		System.out.println("Select Tyre: ");
		for (int i = 0; i < tyres.size(); i++) {
			System.out.println((i+1) + " " + tyres.get(i));
		}
		
		int t = sc.nextInt();
		tyre.setTyre(tyres.get(t));

		System.out.println("Select Seat: ");
		for (int i = 0; i < seats.size(); i++) {
			System.out.println((i+1) + " " + seats.get(i));
		}
		
		int s = sc.nextInt();
		seat.setSeat(seats.get(s));

		System.out.println("*-----You have selected-----*");
		Cars cr = (Cars) context.getBean(brand.get(cn));

		cr.feature();
	

	}
		catch(Exception e){
			System.out.println("There is an issue from server");
		}
		finally {
			System.out.println("Thank you. Please visit again");
		}
	}

}
