import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by galaxy on 2017/1/28.
 */
class Client {

    public static void main(String[] args) throws InterruptedException {

        Client client = new Client();

        client.connect();

    }

    public void connect() throws InterruptedException {

        try {

//            L.error("开始连接服务器...");

            Socket socket = new Socket("192.168.56.101", 9999);

            OutputStream stream = socket.getOutputStream();

            Scanner scanner = new Scanner(System.in);

//            L.error("连接成功...");

            while (true) {

                String next = scanner.next();

                stream.write(next.getBytes());

                stream.flush();

            }

        } catch (IOException e) {

//            L.error("连接失败...");

            Thread.sleep(500);

            connect();

        }

    }

}
