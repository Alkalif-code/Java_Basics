public class Functions{
    
    public void ferrari(){                                        // creation of function
        System.out.println("Welcome to Ferrari");
    }
    public void BMW(){
        System.out.println("Hi this is BMW");
    }

    public static void main(String[] args){

        Functions obj=new Functions();                  // creating object then only we can call function.
        obj.ferrari();
        obj.BMW(); 
    }
}