import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        // reversing array using the swap function
        // what can be the logic behind it
        // think for a while
        int[] arr = {12,32,4,34,5,56,6,5,25,45,45};
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index2] = arr[index1];
        arr[index2]= temp;
    }


}
