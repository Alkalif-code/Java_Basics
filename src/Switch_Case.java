import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args){

        System.out.println("1- Check balance");
        System.out.println("2- Deposite");
        System.out.println("3- Withdraw");

        int balance= 20000;
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();

        switch(a){
            case 1:                                            // checking case 
                System.out.println(balance);
                break;                                         //break use to exit that statement
            case 2:
                System.out.println("Enter your Amount");
                int b=scan.nextInt();
                System.out.println("Deposited ! Now your balance is " + (balance + b) );
                break;
            case 3:
                System.out.println("Enter your Amount");
                int c=scan.nextInt();
                if(c<=balance){
                    System.out.println("Withdrawed");
                    System.out.println("Your New Balance is " + (balance-c));
                }
                else{
                    System.out.println("You amount is insufficient");
                }
                break;

            default:                                         // Either none of the case match default will execute
                System.out.println("Invalid Number");
        }
        
    }
}