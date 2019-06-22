public class Main {

        public static void main(String[] args) {
            rotateArray(2,new int[]{3,2,4,7,9,11});

        }

        private static int[] rotateArray(int step, int[] arr){
            int n1 = arr.length-step;
            int n2 = step;
            int j= 0;
            int[] arrTemp = new int[arr.length];
            for(int i = n1-1; i>=0;i--){
                arrTemp[j]=arr[i];
                j++;
            }

            for(int i = arr.length-1; i>=n1;i--){
                arrTemp[j]=arr[i];
                j++;
            }

            int k =0;
            int temp =0;
            for (int i = arrTemp.length-1;i>=k;i--){
                temp=arrTemp[k];
                arrTemp[k]=arrTemp[i];
                arrTemp[i]=temp;
                k++;
            }

            return arrTemp;
        }

}
