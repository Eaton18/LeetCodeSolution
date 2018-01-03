package problem119.pascaltriangle2;

import utilities.testcase.TestCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * problem link: https://leetcode.com/problems/pascals-triangle-ii/description/
 */
public class PascalTriangle2 {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> lstRow = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex + 1; i++) {
            lstRow.add(1);
            for (int j = i - 1; j > 0; j--) {
                lstRow.set(j, lstRow.get(j - 1) + lstRow.get(j));
            }
        }
        return lstRow;
    }


    public static void main(String[] args) {
        int rowIndex = 0;

        int testcase1 = 5;
        int testcase2 = 10;
        int testcase3 = 18;

        TestCase testcase = TestCase.TESTCASE_2;
        switch (testcase) {
            case TESTCASE_1:
                rowIndex = testcase1;
                break;
            case TESTCASE_2:
                rowIndex = testcase2;
                break;
            case TESTCASE_3:
                rowIndex = testcase3;
                break;
            default:
                break;
        }

        List<Integer> pascalRow = getRow(rowIndex);

        Iterator<Integer> it = pascalRow.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }
}
