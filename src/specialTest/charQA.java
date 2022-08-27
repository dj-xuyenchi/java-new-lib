package specialTest;

/**
 *
 * @author DJXuyenChi
 */
public class charQA {

    /**
     * Ki?m tra ký t? tuy?n vào có ph?i ch? cái hay s? không.
     * @param      ký t? c
     *
     * @return     true n?u là s? ho?c ch? cái ngu?c l?i là false.
     *
     */
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
