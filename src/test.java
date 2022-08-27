
import caculSupport.numSupport;
import specialTest.charQA;
import specialTest.datetimeQA;
import specialTest.numQA;
import specialTest.stringQA;



/**
 *
 * @author DJXuyenChi
 */
public class test {
    public static void main(String[] args) {
     int a=0;
     a=numQA.tryParseInt("0", a);
     boolean aa;
        System.out.println(a);
        System.out.println(numQA.getTryParseBool());
     
    }
  
}