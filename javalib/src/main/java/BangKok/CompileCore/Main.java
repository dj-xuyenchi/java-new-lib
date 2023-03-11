package BangKok.CompileCore;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String command = "csc.exe /out:\"D:\\myworkspace\\ee.exe\" D:\\myworkspace\\ee.cs"; // replace Test.cs with your file name
            Process process = Runtime.getRuntime().exec(command);
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
