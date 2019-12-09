package LeetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/9 8:51
 * Description:
 *
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 *
 *
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if(nums==null||nums.length<4){
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j<len-1;j++){
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                int L = j+1;
                int R = len-1;

                while (L<R){
                    int sum = nums[i] + nums[j] + nums[L] + nums[R];
                    if (sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j],nums[L],nums[R]));
                        while (L<R-1 && nums[L]==nums[L+1]) L++;
                        while (R<len-1 && nums[R]==nums[R+1]) R--;
                        L++;
                        R--;
                    }
                    else if(sum<target) L++;
                    else if(sum>target) R--;
                }
            }

        }
        return ans;
    }

    @Test
    public void test(){
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums,0));
    }
}
