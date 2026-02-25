import java.util.Scanner;
public class Scanner_Class{
    
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);

        int age = scan.nextInt();       
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