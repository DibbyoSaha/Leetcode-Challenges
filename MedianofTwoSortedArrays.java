class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums3 =Arrays.stream(nums1).boxed().collect(Collectors.toList());
        nums3.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        Collections.sort(nums3);
        if(nums3.size()%2!=0){
            return nums3.get(((nums3.size()+1)/2)-1);
        }
        else{
            double tempC = nums3.get(nums3.size()/2);
            double tempF = nums3.get((nums3.size()/2)-1);
            return (tempC+tempF)/2;
        }
    }
}
