public class For_loop{
    public static void main(String[] args){
        int count = 0;
        for(int i = 1; i<=100; i++){        // Here initialized, condition, incremented
            if(i%5==0){                     //Only divisible by 5 will enter into this set
                System.out.println(i);
                count++;                   //So how many number entered into this set is calculted                  
            }
        }
        System.out.println(count);
    }
}
