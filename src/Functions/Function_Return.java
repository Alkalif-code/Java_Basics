public class Function_Return{

    int sum(int a , int b){    // 2. we need to specfiy what type of value is returing like int or string.if nothing return we can put void
        int c=a+b;
        return c;             //3. returning a value
    }
    int mul(int a, int b){
        int c=a*b;
        return c;
    }

    public static void main(String[] args){

        Function_Return obj=new Function_Return();

        int Addition = obj.sum(8,8);       //  1.calling function with paramerter, storing returned value
        int Multiplication = obj.mul(8,8);
        
        System.out.println(Addition);
        System.out.println(Multiplication);

    }
}