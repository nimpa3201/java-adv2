package network.exception.connect;

import java.io.IOException;
import java.net.ServerSocket;

public class SoTimeoutServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(12345);
        serverSocket.accept();

        Thread.sleep(1000000); // 무한 슬립

    }
}
