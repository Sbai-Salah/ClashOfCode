import java.util.*;

public class evenDifference {
    
    static int calculateSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 1; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i) - arr.get(i-1));
        }
        return sum;
    }
    
    // static int longestEvenSumSubsequence(int[] nums) {
    //     int n = nums.length;
    //     int maxLen = 0;
        
    //     // Generate all subsequences
    //     for (int mask = 1; mask < (1 << n); mask++) {
    //         ArrayList<Integer> subsequence = new ArrayList<>();
    //         for (int i = 0; i < n; i++) {
    //             if ((mask & (1 << i)) != 0) {
    //                 subsequence.add(nums[i]);
    //             }
    //         }
            
    //         // Sort the subsequence
    //         Collections.sort(subsequence);
            
    //         int sum = calculateSum(subsequence);
    //         if (sum % 2 == 0) {
    //             maxLen = Math.max(maxLen, subsequence.size());
    //         }
    //     }
        
    //     return maxLen;
    // }
    static int longestEvenSumSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 0;
    
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize to 1, as each element itself is a valid subsequence
            for (int j = 0; j < i; j++) {
                if (Math.abs(nums[i] - nums[j]) % 2 == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
    
        return maxLen;
    }
    
    
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 7};
        int result = longestEvenSumSubsequence(nums);
        System.out.println("The length of the longest subsequence with even sum of differences: " + result);
    }
}
