package com.startravels.main;
import com.startravels.model.Bus;
import com.startravels.service.BusService;
import com.startravels.view.BusView;
import com.startravels.dao.BusDAO;
import java.util.Scanner;
 
public class Main {
	static Scanner sc =new Scanner(System.in);
	public static boolean displaySubMenu() {
		do {
		System.out.println("1. Add Bus");
		System.out.println("2. Display All Bus");
		System.out.println("Please Enter Your choices");
		int subMenuChoices=sc.nextInt();
		sc.nextLine();
		switch (subMenuChoices) {
		case 1:
			System.out.println("Bus added Successfully");
			 break;
		case 2:
			System.out.println();
			//BusView b1;
			BusView.addBus();
			 break;
		case 3:	
			System.exit(0);break;
			default:
				System.out.println("Not a valid input1");break;
		}
		}while(true);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		do {
			System.out.println("1. Start application");
			System.out.println("2. Stop application");
			System.out.println("Enter your choices 1 or 2");
			int mainMenuChoice = sc.nextInt();
			sc.nextLine();
			
			switch(mainMenuChoice) {
			case 1:
				System.out.println("sub menu");
				System.out.println(displaySubMenu()); break;
			case 2:
				System.exit(0);break;
				default: 
					System.out.println("You did not provide a valid input");
			}
			
		}while (true);
		
		
		
				
	} 
	

}
