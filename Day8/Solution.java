class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        while(l <= h)
        {
            int mid = ( (h-l)>>1) + l;
            if(nums[mid] == target)
                return mid;
            else if( target < nums[mid] )
                h = mid-1;
            else 
                l = mid+1;
        }
        return -1;
    }
    int search2(int nums[], int target) //using built in functions
    {
        int ans =  Arrays.binarySearch(nums, target);
        return ans< 0 ? -1 : ans;
    }
}