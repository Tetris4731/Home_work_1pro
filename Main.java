import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        String[] arr = new String[]{"Hello", "Wuddi", "Hola"};
        ArrayList<String> al = arrayToList( arr );
        System.out.println( al );

        Box<Apple> box1 = new Box<>();
    }

    public static <T> ArrayList<T> arrayToList( T[] arr ) {
        return new ArrayList<>( Arrays.asList( arr ) );
    }
    public static void swap(Object[] arr, int i, int j){
        Object obj = arr[i];
        arr[i]=arr[j];
        arr[j] = obj;
    }


}
