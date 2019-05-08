package leo.com.testlib.ALeetcode.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
class ContainsDuplicate {
    public static void main(String[] args) {

    }

    /**
     * 解题思路
     * 先对数据排序。
     * 遍历数组，判断前一个数据是否跟后一个数据相同
     *
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    /**
     * 利用HashSet不允许重复的特性
     * 遍历数据填入HashSet中，
     * 最后判断hashset的长度是否跟数组一致。
     */
    public boolean containsDuplicate2(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }
        HashSet<Integer> data = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            data.add(nums[i]);
        }
        return data.size() != nums.length;
    }
}