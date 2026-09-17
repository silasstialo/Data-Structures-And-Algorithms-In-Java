
public class ArrayReverser {

    // Note: Requires object types like Integer[], String[], Object[] rather than primitives like int[].
    public static <T> void reverse(T[] array){
        int left = 0;
        int right = array.length - 1;

        while(right > left){
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left += 1;
            right -= 1;
        }
    }
}