package com.epam.ci;

import com.epam.ci.download.IOHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * @author Anton_Savostytskyi on 10/12/2015.
 */
public class Main {

    public static void main(String[] args) {
        File f = new File("d:/test.txt");
        try {
            IOHelper.downloadFileFromURL("https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt", f);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
