package BangKok.CompileCore;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
    public static boolean writeFile(String souceCodeData, String fileName,String savePath) {
        try {
            FileWriter fw = new FileWriter(savePath + fileName + ".java");
            fw.write(souceCodeData);
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
