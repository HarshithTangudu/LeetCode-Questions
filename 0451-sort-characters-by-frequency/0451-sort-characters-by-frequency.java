class Solution {
    public String frequencySort(String s) {
        int[] store=new int[128];
        ArrayList<Character> store2 =new ArrayList<>();
        int char_c=0;
        int i=0;
        while(i<s.length()){
            int d=(int)s.charAt(i);
            store[d]++;
            
            if(!store2.contains(s.charAt(i))) store2.add(s.charAt(i));
            i++;
            
        }
        char_c=store2.size();
        StringBuilder sb=new StringBuilder();
        while(char_c>0){
            int c=0;
            char a;
            int j=0;
            int max_ind=0;
            int max_val =Integer.MIN_VALUE;
            while(j<128){
                if(store[j]>max_val){
                    max_ind=j;
                    max_val=store[j];
                }
                j++;;
            }
            c=max_val;
            a=(char)max_ind;
            sb.append(String.valueOf(a).repeat(c));
            store[max_ind]=0;
            char_c--;
        }
        return sb.toString();



        
    }
}