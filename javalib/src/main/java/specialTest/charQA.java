package specialTest;

/**
 *
 * @author DJXuyenChi
 */
public class charQA {

    /**
     * Kiểm tra xem ký tự truyền vào có phải là chữ cái hoặc số hay không.
     *
     * @param c đầu vào là 1 biến charactor
     * @return trả về true nếu đúng là chữ hoặc số ngược lại là false
     */
    public static boolean IsNumberOrCharactor(char c) {
        if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra xem ký tự truyền vào có phải là số hay không.
     *
     * @param c đầu vào là 1 biến charactor
     * @return trả về true nếu đúng là số ngược lại là false
     */
    public static boolean IsNumber(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra xem ký tự truyền vào có phải là chữ cái hay không.
     *
     * @param c đầu vào là 1 biến charactor
     * @return trả về true nếu đúng là chữ cái ngược lại là false
     */
    public static boolean IsAlphabet(char c) {
        if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra xem ký tự truyền vào có phải là chữ cái viết hoa hay không.
     *
     * @param c đầu vào là 1 biến charactor
     * @return trả về true nếu đúng là chữ cái viết hoa ngược lại là false
     */
    public static boolean IsUpper(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra xem ký tự truyền vào có phải là chữ cái viết thường hay không.
     *
     * @param c đầu vào là 1 biến charactor
     * @return trả về true nếu đúng là chữ cái viết thường ngược lại là false
     */
    public static boolean IsLower(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}
