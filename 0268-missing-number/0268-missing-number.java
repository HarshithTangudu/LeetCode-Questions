class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int result=n*(n+1)/2;
        int i=0;
        while(i<n){
            result-=nums[i];
            i++;
        }
        return result;
    }
}