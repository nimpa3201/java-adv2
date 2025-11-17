package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMain1 {

    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("== ASCII 영문 처리 ==");
        encoding("A", US_ASCII);  //A -> [US-ASCII] 인코딩 -> [65] 1byte
        encoding("A", ISO_8859_1); //  A -> [ISO-8859-1] 인코딩 -> [65] 1byte
        encoding("A",EUC_KR); // A -> [EUC-KR] 인코딩 -> [65] 1byte
        encoding("A", UTF_16BE); // 호환 안됨  A -> [UTF-16BE] 인코딩 -> [0, 65] 2byte

        System.out.println("== 한글 지원 ==");
        encoding("가",EUC_KR);  // 가 -> [EUC-KR] 인코딩 -> [-80, -95] 2byte
        encoding("가",MS_949);  // 가 -> [x-windows-949] 인코딩 -> [-80, -95] 2byte
        encoding("가",UTF_8);  // 가 -> [UTF-8] 인코딩 -> [-22, -80, -128] 3byte
        encoding("가",UTF_16BE); // 가 -> [UTF-16BE] 인코딩 -> [-84, 0] 2byte
    }

    private static void encoding(String text, Charset charset){
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n ", text,charset, Arrays.toString(bytes),bytes.length);
    }
}
