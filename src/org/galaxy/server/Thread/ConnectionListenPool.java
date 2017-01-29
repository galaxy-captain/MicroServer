package org.galaxy.server.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by galaxy on 2017/1/29.
 */
public class ConnectionListenPool {

    private ExecutorService mPool = Executors.newFixedThreadPool(10);

}
