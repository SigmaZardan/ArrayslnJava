import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){

            ArrayList<Integer> list = new ArrayList<>(10);
            // we can add any items we like in a list
           for(int i = 0;i < 100; i++){

               list.add(i);
           }


           list.set(4,234);
            System.out.println(list);



    }
}
