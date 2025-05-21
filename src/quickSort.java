public class quickSort {
    public static void main(String[] args) {
        int[] elements = {23, 68, 92, 51, 14, 7, 39, 62, 10, 74, 56,
                83, 11, 90, 31, 64, 33, 17, 46, 29};
        System.out.println("Before sorting : ");
        for (int element : elements){
            System.out.print(element + " ");
        }


        sortQuick(elements, 0, elements.length - 1);
        System.out.println("\nAfter sorting : ");
        for (int element : elements){
            System.out.print(element + " ");
        }

    }

    public static void sortQuick(int[] array, int low, int high){
        if(low < high){
            //partition the array
            int pivot = partition(array, low, high);

            //sort each partition recursively
            sortQuick(array, low, pivot - 1);
            sortQuick(array, pivot + 1, high);
        }
    }


    private static int partition(int[] array, int start, int end){
        int i = start - 1;
        int pivot = array[end];
        for(int j = start; j < end; j ++){
            if(array[j] < pivot){
                i ++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //make sure the pivot is in the right position
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        //return the pivot
        return i + 1;
    }


}