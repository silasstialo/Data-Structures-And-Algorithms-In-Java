public class selectionSort {
    public static void main(String[] args) {
        int[] elements = {23, 68, 92, 51, 14, 7, 39, 62, 10, 74, 56,
                83, 11, 90, 31, 64, 33, 17, 46, 29};
        sortSelection(elements);
        for (int element : elements){
            System.out.println(element);
        }
    }

    public static void sortSelection(int[] array){
        int length = array.length;
        for(int i = 0 ; i < length - 1 ; i++){
            int min = i;
            for(int j = i + 1 ; j < length ; j++){
                if(array[j] < array[min]){
                    min = j;
                }}
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
