package leo.com.testlib.ALeetcode.strings;

/**
 * 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 * <p>
 * <p>
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class FirstUniqueChar {
    public static void main(String[] args) {

    }

    /**
     * 解题思路
     * 循环遍历'a'-'z'固定26个字母。
     * 通过对indexOf和lastIndexOf判断是否存在重复的数据
     */
    public static int firstuniqueChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int index;
        int lastIndex;
        int result = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            index = s.indexOf(i);
            lastIndex = s.lastIndexOf(i);
            if (index != -1 && index == lastIndex && result > index) {
                result = index;
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

}
