public class Functions_Overloading{

    double area(double a, double b, double c){         // same function name but,3 parameters
        return (a+b)/c;
    }
    int area(int a,int b){                             // same function name ,but 2 parameters
        return a*b;

    }
    double area(double r){                              // same function name but 1 parameters
        return Math.PI*(Math.sqrt(r));                 // Math class using
    }

    public static void main(String[] args){
        Functions_Overloading obj=new Functions_Overloading();
        double Triangle = obj.area(2,5,2);                  //same function called but  passing 3 parameters
        int Rectangle=obj.area(10,5);                       //same function called but passing 2 parameters
        double Circle =obj.area(1);                         //same function called but passing 1 parameters

        System.out.println(Triangle);
        System.out.println(Rectangle);
        System.out.println(Circle);
    }
}