public class insertionSort {
    public static void main(String[] args) {
        int[] elements = {23, 68, 92, 51, 14, 7, 39, 62, 10, 74, 56,
                83, 11, 90, 31, 64, 33, 17, 46, 29};
        sortInsertion(elements);
        for (int element : elements){
            System.out.println(element);
        }
    }

    public static void sortInsertion(int[] array){
        int length = array.length;
        for(int i = 1; i < length; i++){
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = temp;
        }
    }
}
