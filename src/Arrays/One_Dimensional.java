public class One_Dimensional{
    public static void main(String[] args){
        int nums[]=new int[5];         //creation of array and mentioning size and type
        nums[0]= 7;                    //assigning values to by index number
        nums[1]= 8;
        nums[2]= 9;
        nums[3]= 10;
        nums[4]= 11;
      
        System.out.println(nums[3]);    // printing particular stored value by calling index number

       for(int i=0;i<5;i++){           // using for loop to print all values
            System.out.println(nums[i]);
       }
    }
}