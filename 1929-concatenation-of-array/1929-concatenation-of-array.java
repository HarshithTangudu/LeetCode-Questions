class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans =new int[2*nums.length];
        int i=0;
        while(i<2*nums.length){
            int n=nums.length;
            ans[i]=nums[i%n];
            i++;
        }
        return ans;
        
    }
}