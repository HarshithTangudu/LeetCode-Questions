class Solution {
    public int maxProduct(int[] nums) {
        int max_product=Integer.MIN_VALUE;
        int start=1;
        int end=1;
        int i=0;
        while(i<nums.length){
            if(start==0) start=1;
            if(end==0) end=1;
            
            start*=nums[i];
            int j=nums.length-i-1;
            end*=nums[j];
            max_product=Math.max(start,Math.max(max_product,end));
            i++;
        }
        return max_product;
        
    }
}