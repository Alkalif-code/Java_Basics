public class Logical_Operators{
    public static void main(String[] args){
        
        int mark1 = 130;
        int mark2 = 80;
        
        int pass_mark= 35;
        int max_mark= 200;

        int total =mark1 + mark2;

        boolean result = total > pass_mark && total <= max_mark;    // both condition needvalid
        boolean result2 = total > pass_mark || total <= max_mark;   // any one is need to valid


        System.out.println(result);
        System.out.println(result2);
        System.out.println(!result2);      //here not operator used 
        
    }
}