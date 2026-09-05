class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        Swap(arr, 0, n - d - 1);
        Swap(arr, n - d, n - 1);
        Swap(arr, 0, n - 1);
    }
        public static void Swap(int arr[], int st, int end) {
        while (st < end) {
            int tmp = 0;
            tmp = arr[st];
            arr[st] = arr[end];
            arr[end] = tmp;
            st++;
            end--;
            
        }
    }
}