package com.sda.twitter;

public class Autentication {

    private static boolean isAuthenticated = false;

    public static void setIsAuthenticated(boolean isAuthenticated) {
        Autentication.isAuthenticated = isAuthenticated;
    }

    public static boolean isIsAuthenticated() {
        return isAuthenticated;
    }
}
