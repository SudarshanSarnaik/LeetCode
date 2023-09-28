class Solution {
    public int maximumProduct(int[] arr) {
      int n=arr.length-1;
        Arrays.sort(arr);
        int case1= arr[n]*arr[n-1]*arr[n-2];
        int case2=arr[n]*arr[0]*arr[1];
        return Integer.max(case1, case2);
        
    }
}