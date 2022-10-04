import java.util.Arrays;
import java.util.Scanner;

public class FirstArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];

        // taking inputs for the numbers

        for(int i = 0 ; i < arr.length;i++){
            arr[i] = scanner.nextInt();
        }


        // another way is
        System.out.println(Arrays.toString(arr));


        /// taking string arrays and printing them
        String[] names = new String[4];

        for(int i = 0; i < names.length;i++){

            names[i] = scanner.next();
        }

        System.out.println(Arrays.toString(names));




    }
}
