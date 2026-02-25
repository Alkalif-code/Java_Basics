public class Function_Parameters{

    public void area(int height,int width){        // 3, here two parameters is reciving the value form object

        System.out.println("area of Rectangle " + height*width);         //4, here it calculate it . then print 
    }

    public static void main(String[] args){
        Function_Parameters obj=new Function_Parameters();    // 1.obj created for calling func
        obj.area(10,20);           // 2,here to value passed to fuction
    }
}