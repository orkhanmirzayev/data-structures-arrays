public class Main {

    private static void findSumPairs(int num, int[] arr) {

        //1,2,3,4,5,6,7,8,9,10

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] > num) {
                end--;
            } else if (arr[start] + arr[end] < num) {
                start++;
            } else {
                System.out.println("" + start + "," + end + "");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
