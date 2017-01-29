import org.galaxy.server.MicroServer;

/**
 * Created by galaxy on 2017/1/28.
 */
public class Test {

    public static void main(String[] args) {

        MicroServer server = new MicroServer();

        server.initServer();

        server.startServer();
    }

}
