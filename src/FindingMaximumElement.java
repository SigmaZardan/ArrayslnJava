public class FindingMaximumElement {

    public static void main(String[] args){

        // finding the maximum element in the array
        int[] arr = {23,234,2,4,54,45,6,7,8,456,2342,5675,234};

      int answer =  findingMaximum(arr);
      System.out.println(answer);




      int answer2 = findingMaxElementInRange(arr, 2,  6);
      System.out.println(answer2);
    }

    static int findingMaximum(int[] arr){

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max) {

                max = arr[i];
            }
        }
        return max;
    }

    // finding maximum element in a range
    static int findingMaxElementInRange( int[] arr , int firstIndex, int lastIndex){

        if(firstIndex > lastIndex){
            return -1;

        }
        if(arr.length == 0){
            return -1;
        }

         int max = arr[firstIndex];
         for(int i = firstIndex+1; i < lastIndex ; i++){

             if (arr[i] > max) {

                 max = arr[i];
             }
         }

        return max;

    }
}
