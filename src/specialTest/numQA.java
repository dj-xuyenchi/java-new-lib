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
        for (int i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsPrime(long number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (long i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean IsEven(long number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean IsPerfectNumber(int input) {
        if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input < 0) {
            return false;
        }
        int total = 0;
        for (int i = 1; i <= input / 2; i++) {
            if (input % i == 0) {
                total += i;
            }
        }
        if (input == total) {
            return true;
        }
        return false;
    }

    public static boolean IsPerfectNumber(long input) {
        if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input < 0) {
            return false;
        }
        int total = 0;
        for (long i = 1; i <= input / 2; i++) {
            if (input % i == 0) {
                total += i;
            }
        }
        if (input == total) {
            return true;
        }
        return false;
    }

    public static boolean IsDecimal(String input) {
        if(input.trim().length()==0){
            return false;
        }
        if (input.matches("-?\\d+")) {
            return true;
        }
        return false;
    }
     public static boolean IsFloatOrDouble(String input) {
         if(input.trim().length()==0){
            return false;
        }
        if (input.matches("-?((\\d*\\.?\\d+)||(\\d+\\.?\\d*))")) {
            return true;
        }
        return false;
    }
     public static boolean IsNumber(String input) {
        if (input.matches("-?((\\d*\\.?\\d+)||(\\d+\\.?\\d*))")) {
            return true;
        }
        return false;
    }
}
