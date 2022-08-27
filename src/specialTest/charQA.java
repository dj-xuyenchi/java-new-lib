package specialTest;

/**
 *
 * @author DJXuyenChi
 */
public class charQA {

    public static boolean IsNumberOrCharactor(char c) {
        if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    public static boolean IsNumber(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }

    public static boolean IsAlphabet(char c) {
        if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    public static boolean IsUpper(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    public static boolean IsLower(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}
