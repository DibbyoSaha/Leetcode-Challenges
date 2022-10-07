class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums.length==1){
                if(nums[0]>=target){
                    return 0;
                }
            }
            else{
                if(nums[0]>=target){
                    return 0;
                }
                if(nums[1]>target){
                    return 1;
                }
                if(nums[i]==target){
                    return i++;
                }
                if(nums[i]>target){
                    return i;
                }
            }
        }
        return nums.length;
    }
}
