package io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.*;

public class ReadWriterMainV3 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString: " + writeString);

        // 파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        fw.write(writeString);
        fw.close();

        // 파일에 읽기
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, UTF_8);

        int ch;

        while((ch = fr.read()) != -1){
            content.append((char)ch);
        }
        fr.close();
        String string = content.toString();
        System.out.println("read string: " + string);
    }
}
