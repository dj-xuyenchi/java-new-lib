package BangKok.CompileCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileMachine {
    public static String compileData(String sourcePath) {
        try {
            // Run Java program using "java"
            ProcessBuilder runProcess = new ProcessBuilder("java", sourcePath);
            runProcess.redirectErrorStream(true);
            Process run = runProcess.start();
            BufferedReader runOutput = new BufferedReader(new InputStreamReader(run.getInputStream()));
            // Read program output
            String outputLine;
            String result = "";
            while ((outputLine = runOutput.readLine()) != null) {
                System.out.println(outputLine);
                result += outputLine;
            }
            // Wait for program to finish
            return result;
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
            return null;
        }

    }

    public static void main(String[] args) {
        FileCreate.writeFile("D:\\",

                "public class Main {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println(123);\n" +
                        "    }\n" +
                        "}", "Main1");
        compileData("D:\\Main1.java");
    }

}
