class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 int xmax=nums[i]^nums[j];
                if(xmax>max && Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    max=xmax;
                }
            }
        }
        return max;
    }
}