


import Seoul.QA.HibernateCustom.Context;
import Seoul.QA.HibernateCustom.DongVat;
import Seoul.QA.HibernateCustom.OptionConfig;
import Seoul.QA.HibernateCustom.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author DJXuyenChi
 */
public class test {

    public static void main(String[] args) {

        Context con = new Context();
        DongVat dvNew = new DongVat();
        dvNew.setTen("Xuyen Chi");
        con.getDongVat().save(dvNew);
        for (DongVat dv : con.getDongVat().findAll()) {
            System.out.println(dv.getTen());
        }
    }
}
