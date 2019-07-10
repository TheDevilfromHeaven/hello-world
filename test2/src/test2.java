public class test2 {
    static class Solution {
        boolean isPalindrome(int x) {
            /*
             * 尝试了几次，卡在了判断数字长度为奇数上，看了官方解法
             * 首先官方对负数与最后一位带0的统统都归为非回数
             */
            if(x < 0 || (x % 10 == 0 && x != 0)){
                System.out.println("不是回数");
                return false;
            }
            /*然后通过while循环判断是否已到达了中位*/
            int revertedNumber = 0;
            while(x > revertedNumber){
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }
            /*当数字长度为奇数时，去除位于中位的数字，因为这个数字不影响回数*/
            if(x == revertedNumber || x == revertedNumber / 10){
                System.out.println("是回数");
                return true;
            }else {
                System.out.println("不是回数");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(121);
    }
}
