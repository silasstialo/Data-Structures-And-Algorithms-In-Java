public class bubbleSort {
    public static void main(String[] args) {
        int[] elements = {23, 68, 92, 51, 14, 7, 39, 62, 10, 74, 56,
                83, 11, 90, 31, 64, 33, 17, 46, 29};
        sortBubble(elements);
        System.out.println("after sorting...");
        for(int i: elements){
            System.out.println(i + " ");
        }
    }

    public static void sortBubble(int[] array){
        int length = array.length;
        for(int i = 0; i < length ; i++){
            for(int j = 0 ; j < length - i - 1  ; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
