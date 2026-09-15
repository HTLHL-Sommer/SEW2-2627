package MethodLog;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    void main() throws IOException {
        log(4, "Hollabrunn", "test.txt");
    }

    public static void log(int count, String output, String filename) throws IOException {
        String text = count + ": " + output + "\n";

        FileWriter writer = new FileWriter(filename, true);

        writer.write(text);
        writer.close();
    }
}
