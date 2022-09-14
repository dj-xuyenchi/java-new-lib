/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package London.QA.libPersonalForDatetime;

import QA.Exception.QADateTimeException;

/**
 *
 * @author DJXuyenChi
 */
public class DateTimeQA {

    /**
     * Tập hợp hằng số enum các thứ trong tuần.
     *
     */
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    private int day = 1;
    private int month = 1;
    private int year = 1;
    private int second = 0;
    private int minute = 0;
    private int hour = 0;
    private final String error = "Format lỗi!";

    /**
     * Khởi tạo đối tượng DateTimeQA không tham số truyền vào.
     *
     */
    public DateTimeQA() {
    }

    /**
     * Khởi tạo đối tượng DateTimeQA không tham số truyền vào.
     *
     * @param day ngày.
     * @param month tháng.
     * @param year năm.
     */
    public DateTimeQA(int day, int month, int year) throws QADateTimeException {
        if (!DateTimeValid.checkYear(year) || !DateTimeValid.checkMonth(month) || !DateTimeValid.checkDay(day, month, year)) {
            throw new QADateTimeException(error);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Khởi tạo đối tượng DateTimeQA không tham số truyền vào.
     *
     * @param day ngày.
     * @param month tháng.
     * @param year năm.
     * @param second giây.
     * @param minute phút.
     * @param hour giờ.
     */
    public DateTimeQA(int day, int month, int year, int second, int minute, int hour) throws QADateTimeException {
        if (!DateTimeValid.checkYear(year) || !DateTimeValid.checkMonth(month) || !DateTimeValid.checkDay(day, month, year) || !DateTimeValid.checkSecond(second) || !DateTimeValid.checkMinute(minute) || !DateTimeValid.checkHour(hour)) {
            throw new QADateTimeException(error);
        }
        this.day = day;
        this.month = month;
        this.year = year;
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    /**
     * Lấy ngày.
     *
     * @return Trả về ngày của đối tượng hiện tại.
     */
    public int getDay() {
        return day;
    }

    /**
     * Lấy tháng.
     *
     * @return Trả về tháng của đối tượng hiện tại.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Lấy năm.
     *
     * @return Trả về tháng của đối tượng hiện tại.
     */
    public int getYear() {
        return year;
    }

    /**
     * Lấy giây.
     *
     * @return Trả về tháng của đối tượng hiện tại.
     */
    public int getSecond() {
        return second;
    }

    /**
     * Lấy phút.
     *
     * @return Trả về tháng của đối tượng hiện tại.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Lấy giờ.
     *
     * @return Trả về tháng của đối tượng hiện tại.
     */
    public int getHour() {
        return hour;
    }

    /**
     * Lấy tổng số lượng ngày của đối tượng.
     *
     * @param input đầu vào là đối tượng kiểu DateTimeQA.
     * @return Trả về số lượng ngày của đối tượng hiện tại.
     */
    public static int getTotalDay(DateTimeQA input) {
        int totalDay = input.getDay();
        int inputYear = input.getYear() -1;
        while (inputYear > 0) {
            inputYear--;
            if (DateTimeValid.isLeapYear(inputYear)) {
                totalDay += 356;
            } else {
                totalDay += 355;
            }
        }
        for (int i = 1; i < input.getMonth(); i++) {
            if (i == 2 && DateTimeValid.isLeapYear(input.getYear())) {
                totalDay += 29;
            }
            if (i == 2 && !DateTimeValid.isLeapYear(input.getYear())) {
                totalDay += 28;
            }
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                totalDay += 30;
            }
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                totalDay += 31;
            }
        }
        return totalDay;
    }

    /**
     * Lấy khoảng cách số ngày giữa 2 đối tượng DateTimeQA.
     *
     * @param input1 đầu vào thứ 1 là đối tượng kiểu DateTimeQA.
     * @param input2 đầu vào thứ 1 là đối tượng kiểu DateTimeQA.
     * @return Trả về thứ của đối tượng hiện tại.
     */
    public static int DateDiff(DateTimeQA input1, DateTimeQA input2) {
        int totalDayInput1 = DateTimeQA.getTotalDay(input1);
        int totalDayInput2 = DateTimeQA.getTotalDay(input2);
        if (totalDayInput1 == totalDayInput2) {
            return 0;
        }
        if (totalDayInput1 > totalDayInput2) {
            return totalDayInput1 - totalDayInput2;
        } else {
            return totalDayInput2 - totalDayInput1;
        }
    }

    /**
     * Lấy thứ hiện tại của đối tượng.
     *
     * @param input đầu vào là 1 đối tượng kiểu DateTimeQA.
     * @return Trả về thứ của đối tượng hiện tại.
     */
    public static DayOfWeek getDayOfWeek(DateTimeQA input) {
        return DayOfWeek.FRIDAY;
    }
////////////////////////////////////////// chuwa xong

    public boolean addDay(int number) {
        if (number < 1) {
            return false;
        }
        return true;
    }
}
