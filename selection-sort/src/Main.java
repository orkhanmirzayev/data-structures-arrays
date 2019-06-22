public class Main {

    private static int[] selectionSort(int[] arr) {
        int currentMinimum = arr[0];
        //2,8,5,3,9,4,1
        for (int j = 0; j < arr.length; j++) {
            currentMinimum = arr[j];
            for (int i = 0; i < arr.length; i++) {
                if (currentMinimum < arr[i]) {
                    currentMinimum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = currentMinimum;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
