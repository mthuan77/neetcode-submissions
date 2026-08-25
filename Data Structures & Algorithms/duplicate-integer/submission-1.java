class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(numMap.containsKey(nums[i])){
                return true;
            }
            numMap.put(nums[i], i);
        }
        return false;
    }
}