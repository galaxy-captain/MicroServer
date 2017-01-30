package org.galaxy.server.impl;

/**
 * Created by galaxy on 2017/1/30.
 */
public interface IConnection {

    boolean create();

    boolean start();

    boolean stop();

    boolean close();
}
