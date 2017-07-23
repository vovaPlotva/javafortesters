/**
 * Created by vgolikov on 06-Sep-16.
 */
package com.javafortesters.domainobject;

public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;

    }
}
