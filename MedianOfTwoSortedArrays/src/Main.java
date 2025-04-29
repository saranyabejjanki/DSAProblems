//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for binary search on smaller size
        // if (nums1.length > nums2.length) {
        // return findMedianSortedArrays(nums2, nums1);
        // }    int x = nums1.length;
        // int y = nums2.length;
        // int low = 0, high = x;
        // while (low <= high) {
        // Binary search is being performed on smaller array
        // int partitionX = (low + high) / 2;
        // No of elements in partitionY = Median - no of elements in partition x
        // int partitionY = (x + y + 1) / 2 - partitionX;
        // Same condition as in Binary search edge case handling if entire array is on left or right of median
        // int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
        // int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];
        // int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
        // int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];
        // Success condition        if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
        // Check Odd/even and calculate            if ((x + y) % 2 == 0) {
        // return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
        // } else {
        // return (double)Math.max(maxLeftX, maxLeftY);
        // }        } else if (maxLeftX > minRightY) {
        // adjust for binary search            high = partitionX - 1; // move left
        // } else {            low = partitionX + 1; // move right        }
        // }    throw new IllegalArgumentException("Input arrays are not sorted.");}
  return 0.0;

    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

    }
}