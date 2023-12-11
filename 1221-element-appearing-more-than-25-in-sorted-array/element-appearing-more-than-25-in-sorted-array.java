class Solution {
    public int findSpecialInteger(int[] arr) {
         int sz = arr.length, freq = sz / 4;
         for(int indx = 0; indx < sz; indx++){
             if(indx - freq > -1 && arr[indx - freq] == arr[indx]){
                 return arr[indx];
             }
         }
         return -1;
    }
}