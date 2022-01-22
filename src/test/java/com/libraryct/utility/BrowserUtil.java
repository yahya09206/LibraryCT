package com.libraryct.utility;

public class BrowserUtil {

    public static void waitFor(int seconds){

        // sleep in seconds
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
