package org.galaxy.server.utils;

/**
 * Created by galaxy on 2017/1/22.
 */

public class NetworkUtils {

    /**
     * 将十六进制IP转换成十进制IP
     */
    public static String formatIP(int ip) {
        StringBuilder sb = new StringBuilder();
        sb.append(ip & 0xFF).append(".");
        sb.append((ip >> 8) & 0xFF).append(".");
        sb.append((ip >> 16) & 0xFF).append(".");
        sb.append((ip >> 24) & 0xFF);
        return sb.toString();
    }

    /**
     * 获取当前所连接WIFI的局域网IP
     */
    public static String localAddress() {
        return "";
    }

}
