package BangKok.CompileCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileMachine {
    public static String compileData(String) throws IOException {
        String data = "D:\\cla\\Test.java";
        // Run Java program using "java"
        ProcessBuilder runProcess = new ProcessBuilder("java", data);
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
    }

    public static void main(String[] args) throws IOException, InterruptedException {

    }
}
