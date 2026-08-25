class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));

        int head = 0;
        int tail = n - 1;
        while(head < tail){
            int complement = target - arr[head][0];
            if(complement == arr[tail][0]){
                if(arr[head][1] < arr[tail][1])
                return new int[]{arr[head][1], arr[tail][1]};
                return new int[]{arr[tail][1], arr[head][1]};
            }else if(complement > arr[tail][0]){
                head++;
            }else {
                tail--;
            }
        }
        return new int[]{}; 
    }
}
