
package atmmachine;

import java.util.Scanner;

public class ATMMachine {

    
    public static void main(String[] args) {
       
        int blance = 20000,withdraw,deposite,num;
         Scanner sc = new Scanner(System.in);
        while(true){
    
      System.out.println("Welcome to ATM machine");
      System.out.println("1.withdraw");
      System.out.println("2.deposite");
      System.out.println("3.Check blance");
      System.out.println("4.Exit");
      num = sc.nextInt();
      switch(num){
          case 1:
              System.out.println("Enter amount to be withdraw");
              withdraw = sc.nextInt();
              if(blance>=withdraw){
              System.out.println("Blance amount is: "+blance);
              System.out.println("Collect your money");
              }else{
              System.out.println("You don't collect money");
              }
              System.out.println(" ");
              break;
          case 2:
              System.out.println("Enter amount to deposite");
              deposite = sc.nextInt();
              blance = blance+deposite;
             System.out.println("Blance amount is: "+blance);
             System.out.println("Blance added successfully");
             System.out.println(" ");
              break;
          case 3:
               System.out.println(" your Blance amount is: "+blance);
               System.out.println(" ");
               break;
               
          case 4:
              System.exit(0);
              System.out.println(" ");
              
        }
     
      
      }
      
     
    
    
      }
    
    }

  

