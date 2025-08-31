class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        
        while( i<nums.length){
            if(nums[i]==0){
                break;
                
            }
            i++;
        }
        int j=i+1;
        while(j<nums.length && i<nums.length){
            if(nums[j]!=0){
                int k=nums[j];
                nums[j]=nums[i];
                nums[i]=k;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        
    }
}