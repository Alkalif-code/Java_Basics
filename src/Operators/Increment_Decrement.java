public class Increment_Decrement{
    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int c =  30;
        int d = 40;

        int result= a++;   // post increment here first fetch the value and increment 
        int result2 =++b;  // pre increment here first increment the store the value.

        int result3= c--;   // post decrement here first fetch the value and increment
        int result4 =--d;  // pre decrement here first increment the store the value.

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}