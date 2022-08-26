
package specialTest;

/**
 *
 * @author DJXuyenChi
 */
public class numQA {

    public static boolean IsPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
     public static boolean IsEven(int number) {
        if(number%2==0){
            return true;
        }
        return false;
    }
}
