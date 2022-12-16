/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package London.QA.libPersonalForDatetime;

import QA.Exception.QADateTimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DJXuyenChi
 */
public class DatetimeValid {

    /**
     * Kiểm tra số truyền vào có phải là giây hợp lệ hay không.
     *
     * @param input đầu vào là 1 biến kiểu int cần kiểm tra.
     * @return True nếu đúng là số giây hợp lệ và False nếu không hợp lệ.
     */
    public static boolean checkSecond(int input) {
        if (input < 0 || input > 59) {
            return false;
        }
        return true;
    }

    /**
     * Kiểm tra số truyền vào có phải là phút hợp lệ hay không.
     *
     * @param input đầu vào là 1 biến kiểu int cần kiểm tra.
     * @return True nếu đúng là số phút hợp lệ và False nếu không hợp lệ.
     */
    public static boolean checkMinute(int input) {
        if (input < 0 || input > 59) {
            return false;
        }
        return true;
    }

    /**
     * Kiểm tra số truyền vào có phải là giờ hợp lệ hay không.
     *
     * @param input đầu vào là 1 biến kiểu int cần kiểm tra.
     * @return True nếu đúng là số giờ hợp lệ và False nếu không hợp lệ.
     */
    public static boolean checkHour(int input) {
        if (input < 0 || input > 23) {
            return false;
        }
        return true;
    }

    /**
     * Kiểm tra số truyền vào có phải là năm hợp lệ hay không.
     *
     * @param input đầu vào là 1 biến kiểu int cần kiểm tra.
     * @return True nếu đúng là số năm hợp lệ và False nếu không hợp lệ.
     */
    public static boolean checkYear(int input) {
        if (input < 1) {
            return false;
        }
        return true;
    }

    /**
     * Kiểm tra số truyền vào có phải là tháng hợp lệ hay không.
     *
     * @param input đầu vào là 1 biến kiểu int cần kiểm tra.
     * @return True nếu đúng là số tháng hợp lệ và False nếu không hợp lệ.
     */
    public static boolean checkMonth(int input) {
        if (input < 1 || input > 12) {
            return false;
        }
        return true;
    }

    /**
     * Kiểm tra số truyền vào có phải là ngày hợp lệ hay không.
     *
     * @param day đầu vào là ngày.
     * @param month đầu vào là tháng.
     * @param year đầu vào là năm.
     * @return True nếu đúng là số ngày hợp lệ và False nếu không hợp lệ.
     */
    public static boolean checkDay(int day, int month, int year) {

        if (!checkYear(year) || !checkMonth(month)) {
            return false;
        }
        if (day < 0) {
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    return false;
                }
                return true;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    return false;
                }
                return true;
            case 2:
                if (isLeapYear(year)) {
                    if (day > 29) {
                        return false;
                    }
                    return true;
                } else {
                    if (day > 28) {
                        return false;
                    }
                    return true;
                }
        }
        return true;
    }

    /**
     * Kiểm tra số truyền vào có phải là năm nhuận hay không.
     *
     * @param year đầu vào là năm.
     * @return True nếu đúng là năm nhuận và False nếu không phải.
     */
    public static boolean isLeapYear(int year) {
        checkYear(year);
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 1) {
            return true;
        }
        return false;
    }

}
