public class IF_ElseIF_Statement{
    public static void main(String[] args){

        int mark1=90;
        int mark2=93;
        int mark3 =90;
        int average =(mark1 + mark2 + mark3)/3;


        if(average > 35 && average < 50)             //checked this condition not satisfied
        {
            System.out.println("Your average mark is "+ average + " You need to study hard");
        }
        else if( average >= 50 && average < 80)     //checked this condition not satisfied
        {
            System.out.println("Your average mark is " + average + " keep doing");
        }
        else if (average >=80 && average <= 100)     //checked this condition satisfied !!
        {
            System.out.println("Your average mark is " + average + " Excellent");
        }
        else{
            System.out.println("Your average mark is " + average + " Fail");  // this is ommited
        }
    }
}