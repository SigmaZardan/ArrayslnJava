public class FindingElement {
    public static void main(String[] args){
        int[] arr = {12,32,4,34,5,56,6,5,25,45,45};
        boolean answer = findingElement(arr, 12);
        System.out.println(answer);
    }
    static boolean findingElement(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){

            if (arr[i] == element) {

                return true;
            }


        }
        return false;


    }
}
