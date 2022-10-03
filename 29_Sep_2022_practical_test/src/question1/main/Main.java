package question1.main;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your name");
            String name = sc.nextLine().trim();
            String nArray[] = name.split(" ");
            
            if (nArray.length != 2) {
                System.out.println("InvalidNameException");
            }
            String uName = name.toUpperCase();
            System.out.println("You have entered "+uName);
            for (int i = 0; i < uName.length(); i++) {
                
            	  if (uName.charAt(i) == ' ') {
                      continue;
                  }
                if (name.charAt(i) >=
                        'A' && uName.charAt(i) <= 'Z') {
                    continue;
                } else {
                   System.out.println("InvalidNameException");
                   
                   
                }
            }

            System.out.println(name + " is a valid name");
            System.out.println(" to enter another name enter-1: " );
            System.out.println(" to exit from programme enter-2: " );
            int menu = sc.nextInt();
            
            if(menu==2){
            	System.out.println("Program get Terminated");
                break;
            }
           
            
        }
    }
}