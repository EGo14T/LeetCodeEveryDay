import org.junit.Test;

/**
 * Create By EGo1ST
 * Date ：Created in 2019/9/14 12:49
 * Description：
 */
public class FindMedianSortedArraysFindSmall7 {
    public double findMedianSortArrays(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (getKth(nums1,0,m-1,nums2,0,n-1,left)+getKth(nums1,0,m-1,nums2,0,n-1,right))*0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k){
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //让len1永远比len2小
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        //一个数组被排除到空，返回另一个数组的当前第K值
        if (len1 == 0) return nums2[start2 + k - 1];
        //如果k=1 返回两个数组中 第一个数字小的那个数，就是我们要找的第K小的数
        if (k == 1)return Math.min(nums1[start1],nums2[start2]);
        //如果k/2 比 当前数组长度长，则直接取 数组长度
        int i = start1 + Math.min(len1, k/2)-1;
        int j = start2 + Math.min(len2, k/2)-1;

        //排除小的数
        if (nums1[i] > nums2[j]){
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        }
        else{
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }


    }

    @Test
    public void test(){
        //int[] nums1 = new int[]{1,2};
        //int[] nums2 = new int[]{3,4};
        //double a = findMedianSortArrays(nums1,nums2);
        //System.out.println(a);
        String s = "abacdca";  //s.len = 7
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                System.out.println("no");;
            }
        }
    }
}
