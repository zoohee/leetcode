class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            }
            else {
                return binarySearch(arr, mid + 1, high, key);
            }
        } else {
            return low;
        }
        
    }
}