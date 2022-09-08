
import Tokyo.QA.libPersonalForNumber.Dec;
import Tokyo.QA.libPersonalForNumber.RealNumber;
import caculSupport.numSupport;
import java.util.Scanner;
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
        boolean b = Dec.TryParse(sc.nextLine());
        System.out.println(b);
    }
}
