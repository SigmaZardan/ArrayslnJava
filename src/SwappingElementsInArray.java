import java.util.Arrays;

public class SwappingElementsInArray {



    public static void main(String[] args){

        int[] arr = {12,32,4,34,5,56,6,5,25,45,45};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));



    }


    static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex]= temp;
    }


}
