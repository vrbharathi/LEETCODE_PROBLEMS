class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int possibleDups = 0;
        int length_ = n - 1;
        for (int i = 0; i <= length_ - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length_ - possibleDups) {
                    arr[length_] = 0; 
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }
        int last = length_ - possibleDups;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}

