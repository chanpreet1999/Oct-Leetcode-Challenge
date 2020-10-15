class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1)
            return;
        
        int n = nums.length;
        k =  k%n;
        if(k == 0)
            return;
        
        reverse(nums,0, n-k-1);
        reverse(nums,n-k, n-1);
        reverse(nums,0, n-1);    
    }
    void reverse(int a[], int l, int h)
    {
        while(l < h)
        {
            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            
            l++;
            h--;
        }
    }
}