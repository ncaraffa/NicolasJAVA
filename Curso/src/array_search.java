public class array_search {
    public static void main(String[] args) {

        int[] numbers = {1, 9, 2, 7, 3, 5, 8};
        int target = 4;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: "+i);
                isFound = true;
                break;
            }
            if (!isFound) {
                System.out.println("Element not found in the array");
            }
        }



    }
}
