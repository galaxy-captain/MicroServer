package org.galaxy.server;

/**
 * Created by OoO on 2017/1/21.
 * <p>
 * 服务器配置类
 */
public class ServerConfig {

    private static final int MIN = 1;

    private static final int MAX = 500;

    /**
     * 本地地址
     */
    private String localAddress = "";

    /**
     * 本地端口号
     */
    private int port = 9999;

    /**
     * 最大连接数
     */
    private int connectionMaximum = MIN;

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getConnectionMaximum() {
        return connectionMaximum;
    }

    public void setConnectionMaximum(int connectionMaximum) {
        this.connectionMaximum = connectionMaximum;
    }

}
