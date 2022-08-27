package specialTest;

/**
 *
 * @author DJXuyenChi
 */
public class numQA {

    private static boolean tryParseBool;

    /**
     * Trả về kết quả của việc ép kiểu dữ liệu của hàm tryParse
     *
     * @return Kết quả của lần ép kiểu cuối cùng.
     */
    public static boolean getTryParseBool() {
        return tryParseBool;
    }

    /**
     * Ép kiểu dữ liệu từ String sang int. Nếu cần gán giá trị là biến mới khởi
     * tạo thì hãy gán bằng 0 và option hàm là false nếu thất bại sẽ trả về giá
     * trị max của int là -2147000000
     *
     * @param input đầu vào là 1 biến kiểu String chứa giá trị cần chuyển đổi.
     * @param outInt đầu vào là 1 biến kiểu int chứa giá trị gốc của biến nhận
     * @param opt nếu biến mới thì để false còn biến đã có giá trị sạch từ trước
     * thì để true giá trị.
     * @return Trả về giá trị mới cho biến cần nhận giá trị và thay đổi trạng
     * thái của tryParseBool thành true bạn có thể lấy giá trị của tryParseBool
     * thông qua getter nhưng không thể gán và nếu không thể chuyển đổi giá trị
     * thì tryParseBool chuyển thành false và trả lại giá trị cho biến cần
     * chuyển.
     */
    public static int tryParseInt(String input, int outInt, boolean opt) {
        if (IsDecimal(input)) {
            tryParseBool = true;
            return Integer.parseInt(input);
        } else {
            tryParseBool = false;
            if (opt) {
                return outInt;
            } else {
                return -2147000000;
            }
        }
    }

    /**
     * Ép kiểu dữ liệu từ String sang int. Nếu cần gán giá trị là biến mới khởi
     * tạo thì hãy gán bằng 0 và option hàm là false nếu thất bại sẽ trả về giá
     * trị max của int là -2147000000
     *
     * @param input đầu vào là 1 biến kiểu String chứa giá trị cần chuyển đổi.
     * @param outLong đầu vào là 1 biến kiểu int chứa giá trị gốc của biến nhận
     * @param opt nếu biến mới thì để false còn biến đã có giá trị sạch từ trước
     * thì để true giá trị.
     * @return Trả về giá trị mới cho biến cần nhận giá trị và thay đổi trạng
     * thái của tryParseBool thành true bạn có thể lấy giá trị của tryParseBool
     * thông qua getter nhưng không thể gán và nếu không thể chuyển đổi giá trị
     * thì tryParseBool chuyển thành false và trả lại giá trị cho biến cần
     * chuyển.
     */
    public static long tryParseLong(String input, long outLong, boolean opt) {
        if (IsDecimal(input)) {
            tryParseBool = true;
            return Long.parseLong(input);
        } else {
            tryParseBool = false;
            if (opt) {
                return outLong;
            } else {
                return -2147000000;
            }
        }
    }

    /**
     * Ép kiểu dữ liệu từ String sang float. Nếu cần gán giá trị là biến mới
     * khởi tạo thì hãy gán bằng 0 và option hàm là false nếu thất bại sẽ trả về
     * -999999999
     *
     * @param input đầu vào là 1 biến kiểu String chứa giá trị cần chuyển đổi.
     * @param outFloat đầu vào là 1 biến kiểu int chứa giá trị gốc của biến nhận
     * @param opt nếu biến mới thì để false còn biến đã có giá trị sạch từ trước
     * thì để true giá trị.
     * @return Trả về giá trị mới cho biến cần nhận giá trị và thay đổi trạng
     * thái của tryParseBool thành true bạn có thể lấy giá trị của tryParseBool
     * thông qua getter nhưng không thể gán và nếu không thể chuyển đổi giá trị
     * thì tryParseBool chuyển thành false và trả lại giá trị cho biến cần
     * chuyển.
     */
    public static float tryParseFloat(String input, float outFloat, boolean opt) {
        if (IsFloatOrDouble(input)) {
            tryParseBool = true;
            return Float.parseFloat(input);
        } else {
            tryParseBool = false;
            if (opt) {
                return outFloat;
            } else {
                return -999999999;
            }
        }
    }

    /**
     * Ép kiểu dữ liệu từ String sang float. Nếu cần gán giá trị là biến mới
     * khởi tạo thì hãy gán bằng 0 và option hàm là false nếu thất bại sẽ trả về
     * -999999999
     *
     * @param input đầu vào là 1 biến kiểu String chứa giá trị cần chuyển đổi.
     * @param outDouble đầu vào là 1 biến kiểu int chứa giá trị gốc của biến
     * nhận
     * @param opt nếu biến mới thì để false còn biến đã có giá trị sạch từ trước
     * thì để true giá trị.
     * @return Trả về giá trị mới cho biến cần nhận giá trị và thay đổi trạng
     * thái của tryParseBool thành true bạn có thể lấy giá trị của tryParseBool
     * thông qua getter nhưng không thể gán và nếu không thể chuyển đổi giá trị
     * thì tryParseBool chuyển thành false và trả lại giá trị cho biến cần
     * chuyển.
     */
    public static double tryParseDouble(String input, double outDouble, boolean opt) {
        if (IsFloatOrDouble(input)) {
            tryParseBool = true;
            return Double.parseDouble(input);
        } else {
            tryParseBool = false;
            if (opt) {
                return outDouble;
            } else {
                return -999999999;
            }
        }
    }

    /**
     * Kiểm tra số truyền vào có phải số nguyên tố hay không.
     *
     * @param number số cần kiểm tra.
     * @return true nếu đối số đúng là số nguyên tố và ngược lại false nếu không
     * phải.
     */
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

    /**
     * Kiểm tra số truyền vào có phải số nguyên tố hay không.
     *
     * @param number số cần kiểm tra.
     * @return true nếu đối số đúng là số nguyên tố và ngược lại false nếu không
     * phải.
     */
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

    /**
     * Kiểm tra số truyền vào có phải số chẵn hay không.
     *
     * @param number số cần kiểm tra.
     * @return true nếu đối số đúng là số chẵn và ngược lại false nếu không
     * phải.
     */
    public static boolean IsEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra số truyền vào có phải số chẵn hay không.
     *
     * @param number số cần kiểm tra.
     * @return true nếu đối số đúng là số chẵn và ngược lại false nếu không
     * phải.
     */
    public static boolean IsEven(long number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra số truyền vào có phải số tuyệt vời hay không.
     *
     * @param input số cần kiểm tra.
     * @return true nếu đối số đúng là số tuyệt vời hay không và ngược lại false
     * nếu không phải.
     */
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

    /**
     * Kiểm tra số truyền vào có phải số tuyệt vời hay không.
     *
     * @param input số cần kiểm tra.
     * @return true nếu đối số đúng là số tuyệt vời hay không và ngược lại false
     * nếu không phải.
     */
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

    /**
     * Kiểm tra số truyền vào có phải số nguyên hay không.
     *
     * @param input số cần kiểm tra.
     * @return true nếu đối số đúng là số nguyên và ngược lại false nếu không
     * phải.
     */
    public static boolean IsDecimal(String input) {
        if (input.trim().length() == 0) {
            return false;
        }
        if (input.matches("-?\\d+")) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra số truyền vào có phải số thực hay hay không.
     *
     * @param input số cần kiểm tra.
     * @return true nếu đối số đúng là số thực và ngược lại false nếu không
     * phải.
     */
    public static boolean IsFloatOrDouble(String input) {
        if (input.trim().length() == 0) {
            return false;
        }
        if (input.matches("-?((\\d*\\.?\\d+)||(\\d+\\.?\\d*))")) {
            return true;
        }
        return false;
    }

    /**
     * Kiểm tra số truyền vào có phải số hay không.
     *
     * @param input số cần kiểm tra.
     * @return true nếu đối số đúng là số và ngược lại false nếu không phải.
     */
    public static boolean IsNumber(String input) {
        if (input.matches("-?((\\d*\\.?\\d+)||(\\d+\\.?\\d*))")) {
            return true;
        }
        return false;
    }
}
