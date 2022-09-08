
import London.QA.libPersonalForDatetime.Datetime;
import London.QA.libPersonalForDatetime.DatetimeValid;
import QA.Exception.QADateTimeException;
import Tokyo.QA.libPersonalForNumber.Dec;
import Tokyo.QA.libPersonalForNumber.RealNumber;
import caculSupport.numSupport;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import specialTest.charQA;
import specialTest.datetimeQA;
import specialTest.numQA;
import specialTest.stringQA;

/**
 *
 * @author DJXuyenChi
 */
public class test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(DatetimeValid.isLeapYear(2020));
    }
}
