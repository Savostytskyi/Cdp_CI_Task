package com.epam.ci.download;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * @author Savostytskyi Anton on 14.10.2015.
 */
public class IOHelper {

    public static void downloadFileFromURL(String urlString, File destination) throws Throwable {
        URL website = new URL(urlString);
        try(
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(destination)
        ){
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
    }
}
