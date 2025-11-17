package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {

    public static void main(String[] args) {
        // 이용 가능한 모든 Charset  자바 + OS
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (String string : charsets.keySet()) {
            System.out.println("string = " + string);
        }

        System.out.println("======");
        // 문자로 조회(대소문자 구분X)
        Charset charset1 = Charset.forName("MS949");
        System.out.println("charset1 = " + charset1);

        Set<String> aliases = charset1.aliases();
        for (String alias : aliases) {
            System.out.println("alias = " + alias);
        }

        // UTF-8 문자로 조회
        Charset charset2 = Charset.forName("UTF-8");
        System.out.println("charset2 = " + charset2);

        // UTF-8 상수로 조회
        Charset charset3 = StandardCharsets.UTF_8;
        System.out.println("charset3 = " + charset3);

        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("defaultCharset = " + defaultCharset);

    }

}
