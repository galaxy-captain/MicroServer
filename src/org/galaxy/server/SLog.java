package org.galaxy.server;

/**
 * Created by OoO on 2017/1/21.
 */
class SLog {

    private static boolean isDebug = true;

    private static String TAG = "TAG";

    public static void error(String s) {
        if (isDebug) {
            System.err.println(s);
        }
    }

}
