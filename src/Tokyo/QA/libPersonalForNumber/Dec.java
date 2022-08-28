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
public class Dec extends numQA {

    private static int TryParseIntValue = 0;
    private static long TryParseLongValue = 0;

    /**
     * Ép kiểu dữ liệu từ String sang int hoặc long.
     *
     * @param value đầu vào là 1 biến kiểu String chứa giá trị cần chuyển đổi.
     * @return True nếu chuyển đổi thành công và có thể lấy dữ liệu dưới 2 dạng
     * là int hoặc long qua 2 getter getTryParseIntValue và getTryParseLongValue
     */
    public static boolean TryParse(String value) {
        if (IsDecimal(value)) {
            TryParseIntValue = Integer.parseInt(value);
            TryParseLongValue = Long.parseLong(value);
            return true;
        }
        return false;
    }

    /**
     * Lấy giá trị ép kiểu int chắc chắn rằng TryParse thành công khuyến cáo nên
     * sử dụng với biểu thức điều kiện hoặc If (TryParse).
     *
     * @return Trả về giá trị dạng int
     */
    public static int getTryParseIntValue() {
        return TryParseIntValue;
    }

    /**
     * Lấy giá trị ép kiểu long chắc chắn rằng TryParse thành công khuyến cáo
     * nên sử dụng với biểu thức điều kiện hoặc If (TryParse).
     *
     * @return Trả về giá trị dạng long
     */
    public static long getTryParseLongValue() {
        return TryParseLongValue;
    }

}
