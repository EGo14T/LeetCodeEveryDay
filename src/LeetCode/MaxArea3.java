package LeetCode;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/11/28 14:30
 * Description: 双指针法
 *
 * 左右两个指针， 维护一个maxArea，当左指针指向的数字小于右指针指向的数字时， maxArea = height[左] * （右指针-左指针） 然后左指针右移；
 */
public class MaxArea3 {
    public class Solution {
        public int maxArea(int[] height) {
            int maxarea = 0, l = 0, r = height.length - 1;
            while (l < r) {
                maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] < height[r])
                    l++;
                else
                    r--;
            }
            return maxarea;
        }
    }
}
