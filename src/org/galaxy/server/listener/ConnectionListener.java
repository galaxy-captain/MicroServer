package org.galaxy.server.listener;


import org.galaxy.server.MicroConnection;

/**
 * Created by galaxy on 2017/1/24.
 */
public abstract class ConnectionListener {

    public abstract void onAccept(final MicroConnection connection);

    public abstract void onClose(final MicroConnection connection);

    public abstract void onReceive(final MicroConnection connection, byte[] buffer, int length);

    public abstract void onSend(final MicroConnection connection, byte[] buffer);

}