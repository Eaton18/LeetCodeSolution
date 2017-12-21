package problem088.mergesortedarray;

/**
 * Created by yitgeng on 12/21/2017.
 */
public class Test {

    public static void merge(int A[], int m, int B[], int n) {
        while (n > 0) A[m + n - 1] = (m == 0 || B[n - 1] > A[m - 1]) ? B[--n] : A[--m];
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
