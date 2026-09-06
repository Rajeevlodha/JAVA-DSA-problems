class Solution {
    public int missingNumber(int[] arr) {
      // int arr[] = {3,0,1};
    int n = arr.length;
    int sum = 0;
        for (int i = 0; i < n+1; i++) {
            sum += i;
        }
    int arraySum = 0;
    for (int ele : arr) {
         arraySum  += ele;
    }
    return sum - arraySum;
    }
}