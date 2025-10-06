class Solution {
    public int doit(int[][] img,int i,int j){
        int[][] directions={{1,0},{0,1},{-1,0},{0,-1},{-1,1},{1,-1},{1,1},{-1,-1},{0,0}};
        int sum=0;
        int no=0;
        int it=0;
        while(it<9){
            int x=i+directions[it][0];
            int y=j+directions[it][1];
            if(y>=0 && y<img[0].length && x>=0 && x<img.length){
                no++;
                sum+=img[x][y];
            }
            it++;
        }
        return sum/no;



    }
    public int[][] imageSmoother(int[][] img) {
        int i=0;
        int[][] result=new int[img.length][img[0].length];
        while(i<img.length){
            int j=0;
            while(j<img[0].length){
                result[i][j]=doit(img,i,j);
                j++;

            }
            i++;
        }
        return result;

        
    }
}