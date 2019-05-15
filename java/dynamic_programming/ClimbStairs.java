package leo.com.testlib.ALeetcode.dynamic_programming;

public class ClimbStairs {

    /**
     * 动态方程
     * f(n) = f(n-1)+f(n-2)
     *
     * 时间复杂度 O(n) 空间复杂度O(n)
     */
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        int[] a = new int[n+1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    /**
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     */
    public int climbStairs2(int n){
        if (n == 0) {
            return 0;
        }
        int[] a = new int[3];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        a[1]=1;
        a[2]=1;
        for(int i=2;i<=n;i++){
            a[0]=a[1];
            a[1]=a[2];
            a[2]=a[0]+a[1];
        }
        return a[2];
    }
}
