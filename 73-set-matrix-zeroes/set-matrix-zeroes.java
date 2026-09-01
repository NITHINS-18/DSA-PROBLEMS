class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[]rc=new boolean[n];
        boolean[]cc=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rc[i]=true;
                    cc[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rc[i] || cc[j]){
                    matrix[i][j]=0;
                }
            }
        }
        return ;
    }
}