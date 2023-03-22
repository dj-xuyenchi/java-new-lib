


import Seoul.QA.HibernateCustom.DongVat;
import Seoul.QA.HibernateCustom.Repository;

import java.util.Scanner;


/**
 * @author DJXuyenChi
 */
public class test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Repository<DongVat> re = new Repository<>(DongVat.class);
//        for(DongVat dv : re.findAll()){
//            System.out.println(dv.getTen());
//        }

        System.out.println(DongVat.class.getSimpleName());





//        EmailMix e = new EmailMix("do.quanganh99zz@gmail.com", "xqwcfhvbxjomokjb", 2);
//        e.sendContentToVer2("anhdqph19418@fpt.edu.vn", "â", "â");
    }
}
