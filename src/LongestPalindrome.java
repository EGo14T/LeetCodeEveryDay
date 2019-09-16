import org.junit.Test;

/**
 * Create By EGo1ST
 * Date ：Created in 2019/9/14 17:44
 * Description：
 */
public class LongestPalindrome {

    public boolean isPalindromic(String s){
        int len = s.length();
        for (int i = 0;i<len/2; i++)
        if (s.charAt(i)!= s.charAt(len - i -1)){
            return false;
        }
        return true;
    }



    public String longestPalindrome(String s) {
        int max = 0;
        String longest = "";
        int len = s.length();

        for (int i = 0; i < len; i++){
            for (int j = i+1; j<=len; j++){
                String subs = s.substring(i, j);
                if (isPalindromic(subs) && subs.length()>max){
                    longest = s.substring(i,j);
                    max = Math.max(max,subs.length());
                }

            }
        }
        return longest;
    }


    @Test
    public void test(){
        String s = "abacdca";  //s.len = 7
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                System.out.println("no");;
            }
        }
    }


    @Test
    public void test2(){
        String s = "abacdca";
        String longest = longestPalindrome(s);
        System.out.println(longest);
    }

    @Test
    public void test3(){
        String s = "asdasdfasda";
        for (int i = 0; i<s.length(); i++){
            for (int j = i+1; j <= s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
