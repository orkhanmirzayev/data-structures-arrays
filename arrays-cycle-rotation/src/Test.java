public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int last = arr[arr.length-1];
        int[] temp=new int[arr.length];
        int tempValue =0;
        int tempIndex=0;
        for (int i = 0; i <arr.length-1;i++){
            tempIndex=i;
            tempValue=arr[i];
            temp[tempIndex+1]=tempValue;
        }
        temp[0]=last;

        for (int i = 0; i <temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
