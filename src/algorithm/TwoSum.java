package algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int[] test_nums = new int[] {1, 2, 3, 5, 7, 9};
        int test_target = 12;
        try{
            int[] result = twoSum(test_nums, test_target);
            int i = 0;
            for ( int index: result ) {
                if(i==0){
                    System.out.print(test_target + "=");
                }
                System.out.print(test_nums[index]);
                if(i<result.length-1){
                    System.out.print("+");
                }
                i++;
            }
        } catch (Exception e){
            System.out.println(e.getMessage()+" Please enter an another target number!");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length ; i++) {
            int target_number = target - nums[i];
            if (map.containsKey(target_number)) {
                System.out.println("index results:" + map.get(target_number) +';'+ i);
                return new int[] {map.get(target_number), i};
            }
            map.put(nums[i], i);
        }
        throw  new IllegalArgumentException("No two sum solution");
    }

}
