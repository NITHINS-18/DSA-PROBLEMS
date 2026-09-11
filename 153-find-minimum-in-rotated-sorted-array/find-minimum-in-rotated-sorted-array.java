class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+((r-l)>>1);
            if(nums[mid]<=nums[r])
            {
                r=mid;
            }else
            {
                l=mid+1;
            }
        }
        return nums[l];
    }
}