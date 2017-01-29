package org.galaxy.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by OoO on 2017/1/21.
 *
 * 服务器运行时状态
 */
public class ServerState {

    /**
     * 服务器
     */
    private MicroServer mServer;

    /**
     * 运行状态
     */
    private boolean isRunning = false;

    /**
     * 总连接数
     */
    private int connectionTotal = 0;

    /**
     * 连接集合
     */
    private ConcurrentHashMap<String, MicroConnection> connectionMap = new ConcurrentHashMap<>();

    public ServerState(MicroServer server) {
        this.mServer = server;
    }

    public String getLocalAddress() {
        return mServer.getConfig().getLocalAddress();
    }

    public int getPort() {
        return mServer.getConfig().getPort();
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public int getConnectionTotal() {
        return connectionTotal;
    }

    public int cutConnection(MicroConnection connection) {

        connectionMap.remove(connection.getName());

        return --connectionTotal;
    }

    public int addConnection(MicroConnection connection) {

        connectionMap.put(connection.getName(), connection);

        return ++connectionTotal;
    }

    public MicroConnection getConnection(String name) {
        return connectionMap.get(name);
    }

    public Map<String, MicroConnection> getAllConnection() {
        return connectionMap;
    }

    public List<String> getAllConnectionName() {
        return new ArrayList<>(connectionMap.keySet());
    }

    public void closeConnection(MicroConnection connection) {
        connection.close();
    }

    public void closeAllConnection() {

        Set<Map.Entry<String, MicroConnection>> set = connectionMap.entrySet();

        for (Map.Entry<String, MicroConnection> entry : set) {
            closeConnection(entry.getValue());
        }

    }

}
