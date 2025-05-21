public class binarySearch {
    public static void main(String[] args) {
        int[] input = {5, 6, 8, 9, 11, 13, 17};
        int searchTerm = 55;
        int result = searchBinary(input, searchTerm);
        if (result != -1){
            System.out.printf("binary search iterative results : %d \n", result);
        }
        else {
            System.out.println("results not found");
        }


        int result2 = binarySearchRecursive(input, searchTerm, 0, input.length - 1);
        if (result2 != -1){
            System.out.printf("binary search recursive results : %d", result2);
        }
        else {
            System.out.println("results not found");
        }
    }


    public static int searchBinary(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target){
                return mid;
            }

            else if (array[mid] > target) {
                end = mid - 1;
            }

            else if (array[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static int binarySearchRecursive(int[] array, int target, int left, int right){
        if(left < right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                return binarySearchRecursive(array, target, mid + 1, right);
            } else {
                return binarySearchRecursive(array, target, left, mid - 1);
            }
        }
        return -1;
    }
}
