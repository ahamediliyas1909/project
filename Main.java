import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int pin=1909;
        int balance=10000;
        int creditamount=0;
        int withdrawal=0;
       // String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Atm pin");
       int password=sc.nextInt();
        if(password==pin){
           // System.out.println("Enter your name");
         //   name=sc.next();
            System.out.println("Welcome");
            while(true){
                System.out.println("Press 1 to check account balance");
                System.out.println("Press 2 to credit amount to your account");
                System.out.println("Press 3 to withdrawal amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to Exit");
                int opt=sc.nextInt();
                switch(opt)
                {
                    case 1:
                    System.out.println("Your account balance is"+balance);
                    break;
                    case 2:
                    System.out.println("How much amount you want to add your account");
                    creditamount=sc.nextInt();
                    System.out.println("Amount added Succeessfully");
                    balance=balance+creditamount;
                    break;
                    case 3:
                    System.out.println("Enter amount you want to withdrawal");
                    withdrawal=sc.nextInt();
                    if(withdrawal>balance){
                        System.out.println("Insufficient balance");
                    }
                    else{
                        System.out.println("Amount withdrawal Successfully");
                        balance=balance+withdrawal;
                    }
                        break;
                        case 4:
                        System.out.println("Welcome to tha Atm");
                        System.out.println("Your Account balance"+balance);
                        System.out.println("Your credited amount"+creditamount);
                        System.out.println("Your withdrawal amount"+withdrawal);
                        System.out.println("Thank you for coming");
                        break;
                        case 5:
                        System.out.println("Thank you");
                        break;
                        default:
                        System.out.println("Thank you");
                        break;
                }
                            }
                                    }
                                    else{
                                        System.out.println("Incorrect pin number");
                                    }
    }
}