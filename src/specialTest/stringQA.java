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

    /**
     * Các option của hàm TrimWithReplaceSpaceAndOpt JustTrimAndClearSpace chỉ
     * cần xóa khoảng trắng hai đầu và các khoảng trắng thừa bên trong giữ các
     * chữ cái cánh nhau 1 khoảng trắng. UpperFisrtChar xóa khoảng trắng hai đầu
     * và các khoảng trắng thừa bên trong giữ các chữ cái cánh nhau 1 khoảng
     * trắng và viết hoa ký tự đầu mỗi từ. ItsAName Chuẩn hóa đầu vào thành tên
     * chuẩn.
     */
    public static enum Opt {
        JustTrimAndClearSpace, UpperFisrtChar, ItsAName
    }

    /**
     * Chuẩn hóa một chuỗi truyền vào.
     *
     * @param input chuỗi cần chuẩn hóa.
     * @param opt option chuẩn hóa.
     * @return JustTrimAndClearSpace chỉ cần xóa khoảng trắng hai đầu và các
     * khoảng trắng thừa bên trong giữ các chữ cái cánh nhau 1 khoảng trắng.
     * UpperFisrtChar xóa khoảng trắng hai đầu và các khoảng trắng thừa bên
     * trong giữ các chữ cái cánh nhau 1 khoảng trắng và viết hoa ký tự đầu mỗi
     * từ. ItsAName Chuẩn hóa đầu vào thành tên chuẩn.
     *
     */
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

    /**
     * Kiểm tra chuỗi truyền vào có viết in hoa hết hoặc viết thường hết hoặc
     * lộn xộn.
     *
     * @param input chuỗi cần kiểm tra.
     * @return trả về -1 nếu chuỗi trống. trả về 0 nếu chuỗi là chuỗi lộn xộn.
     * trả về 1 nếu chuỗi in hoa. trả về 2 nếu là chuỗi in thường.
     */
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
