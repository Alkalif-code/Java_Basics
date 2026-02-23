public class Arithmetic_Operators{
    public static void main(String[] args){
        String name = "Alkalif";
        int Tamil = 85;
        int English = 90;
        int Mathematics = 97;
        int Science = 85;
        int History = 80;

        
        
        int Total_Marks = (Tamil + English + Mathematics + Science + History);  // using addition 
        int Average =Total_Marks / 5;                                           // division
        double Percentage = ((double)Total_Marks/500) * 100;                    // here total marks is int so we type casted into double

        System.out.println("Name of the Student " + name );
        System.out.println("Total Marks = " + Total_Marks + " /500");
        System.out.println("Average is = " + Average);
        System.out.println("Percentage = " + Percentage + " %");

    }
}