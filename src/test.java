
import London.QA.libPersonalForDatetime.DateTimeQA;
import London.QA.libPersonalForDatetime.DateTimeValid;
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

    public static void main(String[] args) throws QADateTimeException {
        
            DateTimeQA a = new DateTimeQA(15, 9, 2000);
            DateTimeQA b = new DateTimeQA(1, 8, 2022);
            System.out.println(DateTimeQA.DateDiff(b, a));
      
    }
}
