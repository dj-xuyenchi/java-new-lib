/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specialTest;

/**
 *
 * @author DJXuyenChi
 */
public class datetimeQA {
    public static boolean IsDateTime(String input){
        int year = Integer.parseInt(input.substring(0, 4));
        int month = Integer.parseInt(input.substring(5, 7));
        int day = Integer.parseInt(input.substring(8));
        System.out.println(year+" "+month+" "+day);
        return true;
    }
}
