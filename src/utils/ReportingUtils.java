package utils;

import java.io.FileWriter;
import java.io.IOException;

public class ReportingUtils {

    public void writeLog(String filePath, String message) {
        try(FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(message + "\n");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
