package LeetCode;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/11/28 14:25
 * Description: 暴力解法2
 *
 * 盛水量 = 最矮线段的高 * 长度
 */
public class MaxArea2 {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
    }
}
