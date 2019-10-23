import java.util.*;

public class C0003 {
    public static int lengthOfLongestSubstring(String s) {
        // 快速锁定最大的最常子串
        int len = distinctSize(s);

        // 遍历子串的合法性
        while(len>0){
            for(int i=0; i<s.length() - len + 1; i++){
                if(distinctSize(s.substring(i, i+len)) == len){
                    return len;
                }
            }
            len -= 1;
        }

        return len;
    }

    public static int distinctSize(String s){
        return new HashSet<>(Arrays.asList(s.split(""))).size();
    }

    public static void main(String[] args) {
        String a = "abcdeb";
        System.out.println(distinctSize(a));
        System.out.println(lengthOfLongestSubstring("abcdea"));
    }
}
