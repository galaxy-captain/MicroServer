import org.galaxy.server.MicroServer;
import org.galaxy.server.ServerConfig;

/**
 * Created by galaxy on 2017/1/28.
 */
class Test {

    public static void main(String[] args) {

        ServerConfig config = new ServerConfig();

        MicroServer server = new MicroServer(config);

        server.initServer();

        server.startServer();
    }

}
