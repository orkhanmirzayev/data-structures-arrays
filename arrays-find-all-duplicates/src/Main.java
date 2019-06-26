import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
        findDuplicates(new int[]{4,3,2,7,8,2,3,1});
        System.out.println("Hello World!");
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
    //Solution:1 Using Set
    private static List<Integer> findAllDuplicates(int[] arr){
        //4,3,2,7,8,2,3,1
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
         if(set.add(arr[i]))
             set.add(arr[i]);
         else
             list.add(arr[i]);
        }



        return list;
    }
}
