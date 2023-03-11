package BangKok.CompileCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CompileMachine {
    public static String compileAndRunJava(String sourcePath) {
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
            System.out.println("Lỗi đọc file liên hệ Admin!");
            return null;
        }
    }

    public static String compileAndRunCSharp(String sourcePath, String fileName) {
        try {
            String command = "csc.exe /out:" + "\"" + sourcePath + fileName + ".exe\" " + sourcePath + fileName + ".cs";
            Process processCompile = Runtime.getRuntime().exec(command);
            InputStream inputStream = processCompile.getInputStream();
            BufferedReader readerCompile = new BufferedReader(new InputStreamReader(inputStream));
            String result = "";
            String runLog = "";
            while ((runLog = readerCompile.readLine()) != null) {
                result += runLog + "\n";
            }
            if (result.contains("error")) {
                return "Lỗi" + result.split("error")[1];
            }
            runLog = "";
            result = "";
            ProcessBuilder processBuilder = new ProcessBuilder(sourcePath + fileName + ".exe");
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((runLog = reader.readLine()) != null) {
                result += runLog + "\n";
            }
            return result;
        } catch (IOException e) {
            System.out.println("Lỗi đọc file liên hệ Admin!");
            return null;
        }
    }

    public static void main(String[] args) {
//        FileCreate.writeFile("D:\\",
//
//                "public class Main {\n" +
//                        "    public static void main(String[] args) {\n" +
//                        "        System.out.println(123);\n" +
//                        "    }\n" +
//                        "}", "Main1");
//        compileData("D:\\Main1.java");
        System.out.println(compileAndRunCSharp("D:\\myworkspace\\", "ee"));
    }

}
