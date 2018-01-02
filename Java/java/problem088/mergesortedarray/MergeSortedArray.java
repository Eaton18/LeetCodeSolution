package problem088.mergesortedarray;

/**
 * Created by eaton on 12/21/2017.
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

    public static void printArray(String arrName, int[] a) {
        System.out.print(arrName);
        for (int i : a) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        /************ test case ************/
        int[] testcase1Num1 = {4, 5, 6, 0, 0, 0};
        int m1 = 3;
        int[] testcase1Num2 = {1, 2, 3};
        int n1 = 3;

        int[] testcase2Num1 = {0};
        int m2 = 0;
        int[] testcase2Num2 = {1};
        int n2 = 1;

        int[] nums1 = testcase1Num1;
        int[] nums2 = testcase1Num2;
        int m = m1;
        int n = n1;

        printArray("nums1: ", nums1);
        printArray("nums2: ", nums2);

        MergeSortedArray mergesortedarray = new MergeSortedArray();
        MergeSortedArray.Solution1 ms1 = mergesortedarray.new Solution1();

        ms1.merge(nums1, m, nums2, n);

        printArray("After merge: ", nums1);
    }

}
