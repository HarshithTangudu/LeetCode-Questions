class Solution {
    public int maxDepth(String s) {
        int i=0;
        int result=0;
        int max_result=Integer.MIN_VALUE;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                result++;
            }
            else if(s.charAt(i)==')'){
                result--;
            }
            max_result=Math.max(max_result,result);
            i++;
        }
        return max_result;
        
    }
}