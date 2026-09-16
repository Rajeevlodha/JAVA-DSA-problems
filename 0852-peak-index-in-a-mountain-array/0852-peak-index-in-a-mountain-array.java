class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int n = arr.length;
        int st = 0, end = n-1;
        int index = -1;
        while (st<=end){
            int mid = (st + end)/2;
            if(mid==0){
                st = mid+1;
                continue;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                index = mid;
                break;
            } else if (arr[mid]< arr[mid+1]) {
                st = mid+1;
            } else end = mid-1;

        }
        return index;
    }
}