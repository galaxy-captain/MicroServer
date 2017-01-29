package org.galaxy.server.utils;

/**
 * Created by OoO on 2017/1/21.
 */

public class L {

    public static boolean isDebug = true;

    private static String TAG = "TAG";

    public static void error(String s) {
        if (isDebug) {
            System.out.println(s);
        }
    }

}
