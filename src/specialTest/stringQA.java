/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specialTest;

import java.nio.CharBuffer;

/**
 *
 * @author nguye
 */
public class stringQA {

    public static enum Opt {
        JustTrimAndClearSpace, UpperFisrtChar, ItsAName
    }

    public static String TrimWithReplaceSpaceAndOpt(String input, Opt opt) {
        input = input.trim();
        while (input.contains("  ")) {
            input = input.replace("  ", " ");
        }
        if (opt == Opt.JustTrimAndClearSpace) {
            return input;
        }
        if (opt == Opt.UpperFisrtChar || opt == Opt.ItsAName) {
            String temp = input.toLowerCase();
            String arrString[] = input.split(" ");
            if (arrString.length == 0 || arrString.length == 1) {
                return input;
            }
            temp = "";
            for (int i = 0; i < arrString.length; i++) {
                if (arrString[i].length() > 1) {
                    temp += arrString[i].substring(0, 1).toUpperCase() + arrString[i].substring(1) + " ";
                } else {
                    temp += arrString[i].toUpperCase() + " ";
                }
            }
            if (opt == Opt.UpperFisrtChar) {
                return temp;
            } else {
                StringBuilder result = new StringBuilder();
                String regexVN = "[AàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]";
                for (int i = 0; i < temp.length(); i++) {
                    if (String.valueOf(temp.charAt(i)).matches(regexVN)) {
                        result.append(String.valueOf(temp.charAt(i)));
                    }
                }
                return result.toString();
            }
        }
        return "Error";
    }

    public static int IsStringUpperLowerOrMix(String input) {
        if (input.trim().length() < 1) {
            return -1;
        }
        if (input.matches("(?=.*[a-z]).+") && input.matches("(?=.*[A-Z]).+")) {
            return 0;
        }
        if (input.matches("[^a-z]+")) {
            return 1;
        }
        return 2;
    }
}
