public class Main {

    public static void main(String[] args)
    {
        int[] arr ={1,2,3,4,5,6,7};
        int d = 2;
        int index = 0;
        for(int i =0; i< arr.length;i++){
            if(arr[i]==d){
                index = i;
            }
        }
        int[] temp = new int[arr.length];
        int arrIndex = index+1;
        int tempIndex = 0;
        for (int i=0;i<arr.length-arrIndex;i++){
            temp[tempIndex]=arr[++index];
            tempIndex++;
        }

        int arrInIndex = 0;
        for (int i = arr.length-(arrIndex); i <arr.length;++i){
            temp[i]=arr[arrInIndex++];
        }
    }
}
