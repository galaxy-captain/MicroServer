import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by galaxy on 2017/1/28.
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Client client = new Client();

        client.connect();
    }

    public void connect() throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);

        OutputStream stream = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String next = scanner.next();

            stream.write(next.getBytes());

            stream.flush();

        }

    }

}
