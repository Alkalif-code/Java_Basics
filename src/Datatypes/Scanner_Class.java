import java.util.Scanner;                        //Must import for user input
public class Scanner_Class{
    
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);    //creating object to access Scanner funtion

        int age = scan.nextInt();             //Storing user input in Variable.
        scan.nextLine();              // we use this new line statement before we get input for string only.
        String name =scan.nextLine();
        double height =scan.nextDouble();
        char Section =scan.next().charAt(0);


        System.out.println("Student age : " + age);
        System.out.println("Student Name : " + name);
        System.out.println("Student Height : " + height);
        System.out.println("Student Section : " + Section);
    }
}