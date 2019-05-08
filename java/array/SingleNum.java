package leo.com.testlib.ALeetcode.array;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
class SingleNum {
    public static void main(String[] args) {
        singleNum(new int[]{2,2,1});
    }

    /**
     * 解题思路：
     * 关键点通过异或运算符的特性来处理。
     * 异或的特点是：a^b = 1  a^a=0
     * 十进制的数进行异或运算时，会先转换成二进制再计算。
     */
    public static int singleNum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}