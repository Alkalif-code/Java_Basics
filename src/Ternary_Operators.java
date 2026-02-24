public class Ternary_Operators{
    public static void main(String[] args){

        int age = 21;
        int age2= 17;

        String result = age>=18? "Eligible":"Not Eligible";  // two condition in single line.
        String result2 = age2>=18? "Eligible":"Not Eligible";

        System.out.println(result);
        System.out.println(result2);
    }
}