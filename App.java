import java.util.Scanner;

import javax.print.attribute.HashPrintRequestAttributeSet;

public class App {

   
    
    

    // Greeting the user
    public static void greeting(){
    System.out.println(" ... ... ... Loading AREA-51 internal database ... ... ...\n");
    System.out.println(" ... ... ... Loading ... ... ...\n");
    System.out.println(" ... ... ... Loading ... ... ...\n");
    System.out.println("In order to gain access, you must confirm your identity.\n");
    System.out.println("We'll start with your name.\n");
    System.out.println("Please enter your name.");
            }

    // Asking the user to repeat their name
    public static String name(){
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Searching for " + name + " ..... \n");
    System.out.println("Searching for " + name + " ..... Please wait.\n");
    return name;
    }        
            
 
    public static void repeatName(){
        String user = name();
        System.out.println("Name not found.\n");
        System.out.println("Please re-enter name.");
        Scanner scanner = new Scanner(System.in);
        String repeatedName = scanner.nextLine(); 
        
        if(repeatedName.equalsIgnoreCase(user)){
        System.out.println("Welcome " + user + ". Just a few more tests to gain access... \n");
        } else {System.out.println("Access Denied!");
                System.out.println("Please re-enter name");
                String repeatedName2 = scanner.nextLine();
                if (repeatedName2.equalsIgnoreCase(user)){
                    System.out.println("Welcome " + user + ". Just a few more tests to gain access... \n");
                }    
    }
}

//Guessing the user's age
    public static void userAge() {
        System.out.println("We must confirm your age.\n");
        System.out.println("Please enter the last 2 digits of your badge number. \n\n(Same as the last 2 digits of your birth year.) \n\nex: birth year 1980 enter 80.");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year >= 60 && year <=99){
        System.out.println("So you are " + (2022 - (year + 1900)));} 
        else {System.out.println("So you are " + (2022 - (year + 2000)));}
    }

//Counting to any number that the user wants
public static void userNum() {
    
    System.out.println("Next we must setup your 2 digit pin.\n");
    System.out.println("Please think of a 2-digit pin number between 10 and 50. Then select what range your pin is between: ");
    System.out.println("A: 10 - 20");
    System.out.println("B: 21 - 30");
    System.out.println("C: 31 - 40");
    System.out.println("D: 41 - 50");
    Scanner scanner = new Scanner(System.in);
    String pinRange = scanner.nextLine();
    int numRangeStart, numRangeEnd, i, userPin;

    if (pinRange.equalsIgnoreCase("A")){
    System.out.println("Your pin will be between 10-20");
    numRangeStart = 10;
    numRangeEnd = 20;        } 
    else if (pinRange.equalsIgnoreCase("B")){
        System.out.println("Your pin will be between 21-30");
        numRangeStart = 21;
        numRangeEnd = 30;}
    else if (pinRange.equalsIgnoreCase("C")){
            System.out.println("Your pin will be between 31-40");
            numRangeStart = 31;
            numRangeEnd = 40;}
    else {System.out.println("Your pin will be between 41-50");
     numRangeStart = 41;
     numRangeEnd = 50;}  

     while(numRangeStart < numRangeEnd){
         System.out.println("Will your pin be " + numRangeStart + "? Please enter [yes] to confirm.");
         String userNumInput = scanner.nextLine();
          if(userNumInput.equalsIgnoreCase("yes")){
            userPin = numRangeStart;
         System.out.println("Great! Your PIN is " + userPin);
            break;
            
         } else{
             numRangeStart++;
         }
         
     }

    

}


 //Testing the user's "programming knowledge"
 public static void progTest() {
    
    System.out.println("Last Test. Please answer the following question:\n");
    System.out.println("What is the size of int variable?");
    System.out.println("A: 8 bit");
    System.out.println("B: 16 bit");
    System.out.println("C: 32 bit");
    System.out.println("D: 64 bit");
    Scanner scanner = new Scanner(System.in);
    
    

    while(true){
        String userAnsw = scanner.nextLine();
         if(userAnsw.equalsIgnoreCase("c")){
            System.out.println("Great Job!");
            break;
            
         } else{
            System.out.println("Sorry. Please try again.");
         }
         
     }

    

}

    public static void main(String[] args) throws Exception {
        greeting();
        repeatName();
        userAge();
        userNum();
        progTest();
        System.out.println("Welcome to Area-51. Proceed at your own risk.");
        
        
        
    }
}
