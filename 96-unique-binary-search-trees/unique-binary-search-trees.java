class Solution {
    public int numTrees(int n) {
   int[] arr = new int[n +1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2;i<=n;i++){
            for (int j=1;j<=i;j++) {
                int left=j-1;
                int right =i-j;
                arr[i]+= arr[left]*arr[right];
            }
        }
        return arr[n];
    }
}