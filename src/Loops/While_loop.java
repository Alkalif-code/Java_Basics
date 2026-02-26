import java.util.Scanner;
public class While_loop{
    public static void main(String[] args){
     int i=1;   
     Scanner scan=new Scanner(System.in);   
     int a = scan.nextInt();

     while(i<=a){          // condition is true loop run . it exit when the condition become false 
        if(i%2==0){        // checking odd or even
        System.out.println(i);}
        i++;               // iterations
     }
    }
}