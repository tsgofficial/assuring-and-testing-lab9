package com.example;

public class BinarySearch {
    /**
     * @return зорилтот элементийн индекс, олдохгүй бол -1
     */
    public static int search(int[] arr, int target) { // L1
        int left = 0; // L2: D(left)
        int right = arr.length - 1; // L3: D(right), U(arr)
        while (left <= right) { // L4: U(left,right) p-use
            int mid = left + (right - left) / 2; // L5: D(mid), U(left,right)
            int midVal = arr[mid]; // L6: D(midVal), U(arr,mid)
            if (midVal == target) { // L7: U(midVal,target) p-use
                return mid; // L8: U(mid)
            } else if (midVal < target) { // L9: U(midVal,target) p-use
                left = mid + 1; // L10: D(left), U(mid)
            } else { // L11
                right = mid - 1; // L12: D(right), U(mid)
            }
        } // L13
        return -1; // L14
    }
}
