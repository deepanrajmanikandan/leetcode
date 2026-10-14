class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length-1;
        Boolean increasing= true;
        Boolean decreasing = true;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1]){
                increasing =false;
            }
            if(nums[i] < nums[i+1]){
                decreasing = false;
            }

        }
        return increasing || decreasing;
    }
}