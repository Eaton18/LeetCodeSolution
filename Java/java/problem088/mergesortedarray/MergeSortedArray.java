package problem088.mergesortedarray;

/**
 * Created by yitgeng on 12/21/2017.
 */
public class MergeSortedArray {

    public class Solution1 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int indexA = m - 1;
            int indexB = n - 1;

            int len = m + n - 1;

            while (indexA >= 0 && indexB >= 0) {

                if (nums1[indexA] > nums2[indexB]) {
                    nums1[len--] = nums1[indexA--];
                } else {
                    nums1[len--] = nums2[indexB--];
                }
            }

            while (indexB >= 0) {
                nums1[indexB] = nums2[indexB--];
            }

        }
    }

    public class Solution2 {
        public void merge(int nums1[], int m, int nums2[], int n) {
            while (n > 0) nums1[m + n - 1] = (m == 0 || nums2[n - 1] > nums1[m - 1]) ? nums2[--n] : nums1[--m];
        }
    }

}
