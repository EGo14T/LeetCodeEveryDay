package LeetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/30 08:31
 * Description:
 *
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 *
 * 思路： 这道题的意思是， 在这所有数组中找出一个序列，比当前序列数字大的那个序列返回，若没有，则返回最小的那个序列
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            if (i == 0) {
                Arrays.sort(nums);
                return;
            } else {
                if (nums[i] > nums[i - 1]) {
                    Arrays.sort(nums, i, len);
                    for (int j = i; j <len; j++) {
                        if (nums[j] > nums[i - 1]) {
                            int temp = nums[j];
                            nums[j] = nums[i - 1];
                            nums[i - 1] = temp;
                            return;
                        }
                    }
                }
            }
        }
    }

    @Test
    public void test(){
        int[] nums = {1,3,2,1};
        //nextPermutation(nums);
        Arrays.sort(nums,1,3);
        for (int i:nums
             ) {
            System.out.println(i);
        }
    }
}
