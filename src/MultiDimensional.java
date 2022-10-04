import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int[][] numbers = new int[3][3];

         // taking inputs
        for(int row = 0; row < numbers.length;row++){

             for(int column = 0;column < numbers[row].length;column++){
                 numbers[row][column]= scanner.nextInt();
           }


        }
      //  System.out.println(Arrays.deepToString(numbers));

        // enhanced for loop
        for(int[] a : numbers){
            System.out.println(Arrays.toString(a));
        }
    }
}
