public class Main {

    private static int findMissingNumber(int[] arr) {
        //1,2,3,5
        int x1 = arr[0];
        int x2 = 1;
        for (int i = 1; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
        }

        for (int i = 2; i <= arr[arr.length - 1]; i++) {
            x2 = x2 ^ i;
        }

        return x1 ^ x2;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
