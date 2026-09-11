class Solution {
    public void moveZeroes(int[] arr) {
         int n = arr.length;

               for (int i = 0; i < n; i++) {
                   int swap = 0;
                   for (int j = 0; j < n-1-i; j++) {
                       if(arr[j]==0){
                           int tmp = arr[j];
                           arr[j] = arr[j+1];
                           arr[j+1] = tmp;
                           swap++;
                       }

                   }
                   if (swap==0){
                       break;
                   }

               }
        
    }
}