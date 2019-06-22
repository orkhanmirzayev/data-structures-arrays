public class Main {

    public static void main(String[] args) {
        System.out.println(findLeaderElements(new int[]{15,16,3,2,6,1,4}));
    }

    private static String findLeaderElements(int[] arr) {
        int maxLeaderFromRight = arr[arr.length - 1];
        String elements="";
        for (int i = arr.length-2; i >=0; i--) {
            if(maxLeaderFromRight < arr[i]){
                maxLeaderFromRight=arr[i];
                elements+=maxLeaderFromRight+" ";
            }
        }
        return elements;
    }
}
