class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store=new HashMap<>();
        int i=0;
        int[] result=new int[2];
        while(i<nums.length){
            if(store.containsKey(target-nums[i])){
                result[0]=store.get(target-nums[i]);
                result[1]=i;
                break;
            }
            else{
                store.put(nums[i],i);
            }
            i++;
        }
        return result;
        
    }
}