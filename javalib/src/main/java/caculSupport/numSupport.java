package caculSupport;

/**
 *
 * @author DJXuyenChi
 */
public class numSupport {

    public static int greatestCommonDivisor(int num1, int num2) {
        if (num1 < 1 || num2 < 1) {
            return -1;
        }
        if (num1 == 1 || num2 == 1) {
            return 1;
        }
        if (num1 == 2 && num2 % 2 == 0 || num2 == 2 && num1 % 2 == 0) {
            return 2;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int greatestCommonDivisor = 1;
        for (int i = 3; i < num1; i++) {
            if (num2 % i == 0 && num1 % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    public static int leastCommonMultiple(int num1, int num2) {
        return num1*num2/greatestCommonDivisor(num1, num2);
    }
    
}
