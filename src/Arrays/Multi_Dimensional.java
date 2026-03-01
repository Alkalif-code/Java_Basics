public class Multi_Dimensional{
    public static void main(String[] args){

        int marks[][]= new int[3][4];                 // array is creation on 4 array inside 3 big array

        marks[0][0]=2;
        marks[0][1]=4;
        marks[0][2]=6;                                // storing value by index of base and inner array index
        marks[0][3]=8;

        marks[1][0]=1;
        marks[1][1]=3;
        marks[1][2]=5;
        marks[1][3]=7;

        marks[2][0]=4;
        marks[2][1]=3;
        marks[2][2]=2;
        marks[2][3]=1;

        for(int i=0;i<3;i++){                       //printing all using for loop 

            for(int j=0;j<4;j++){                   // using nested because array inside new array so we need to print value is stored

                System.out.print(marks[i][j]);
            }
            System.out.println();                   //just for next line
        }
        
    }
}