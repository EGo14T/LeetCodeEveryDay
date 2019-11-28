package LeetCode;

import org.junit.Test;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/11/28 11:12
 * Description: 暴力解法
 */
public class MaxArea {
    public int maxArea(int[] height) {

        int max1 = 0;
        int max2 = 0;
        int area ;

        int[] reheight = new int[height.length];
        for (int i =0; i<height.length; i++){
            reheight[i] = height[height.length-1-i];
        }


        for (int i = 0; i< height.length; i++){
            for (int j = height.length-1 ; j > 0 ; j-- ){
                if (height[i] <= height[j]){
                    area = height[i] * (j-i);
                    max1 = Math.max(area, max1);
                }
            }
        }

        for (int i = 0; i< reheight.length; i++){
            for (int j = reheight.length-1 ; j > 0 ; j-- ){
                if (reheight[i] <= reheight[j]){
                    area = reheight[i] * (j-i);
                    max2 = Math.max(area, max2);
                }
            }
        }
        return Math.max(max1,max2);
    }

    @Test
    public void test(){
        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));



    }
}
