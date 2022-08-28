/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tokyo.QA.libPersonalForNumber;

import specialTest.numQA;

/**
 *
 * @author PC
 */
public class RealNumber extends numQA {

    private static float tryParseFloatValue;
    private static double tryParseDoubleValue;

    /**
     * Ép kiểu dữ liệu từ String sang float hoặc double.
     *
     * @param value đầu vào là 1 biến kiểu String chứa giá trị cần chuyển đổi.
     * @return True nếu chuyển đổi thành công và có thể lấy dữ liệu dưới 2 dạng
     * là int hoặc long qua 2 getter getTryParseFloatValue và
     * getTryParseDôubleValue
     */
    public static boolean TryParse(String value) {
        if (IsFloatOrDouble(value)) {
            tryParseFloatValue = Float.parseFloat(value);
            tryParseDoubleValue = Double.parseDouble(value);
            return true;
        }
        return false;
    }

    /**
     * Lấy giá trị ép kiểu float chắc chắn rằng TryParse thành công khuyến cáo
     * nên sử dụng với biểu thức điều kiện hoặc If (TryParse).
     *
     * @return Trả về giá trị dạng float
     */
    public static float getTryParseFloatValue() {
        return tryParseFloatValue;
    }

    /**
     * Lấy giá trị ép kiểu double chắc chắn rằng TryParse thành công khuyến cáo
     * nên sử dụng với biểu thức điều kiện hoặc If (TryParse).
     *
     * @return Trả về giá trị dạng double
     */
    public static double getTryParseDoubleValue() {
        return tryParseDoubleValue;
    }

}
