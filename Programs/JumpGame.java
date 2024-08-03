public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(canJump(arr));
    }
    public static int canJump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int n = nums.length - 1;
        int totalJumps = 0;
        int coverage = 0;
        int lastIndex = 0;
        for(int i = 0 ; i < n ; i++){
            coverage = Math.max(coverage,i + nums[i]);   // To check all the elements of that window
            if(i == lastIndex){
                lastIndex = coverage;
                totalJumps++;
                if(lastIndex >= n){
                    return totalJumps;
                }
            }
        }
        return -1;
    }
}