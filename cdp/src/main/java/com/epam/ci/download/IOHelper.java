package com.epam.ci.download;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.apache.log4j.Logger;

/**
 * @author Savostytskyi Anton on 14.10.2015.
 */
public class IOHelper {

    private static final Logger logger = Logger.getLogger(IOHelper.class);

    public static void downloadFileFromURL(String urlString, File destination) throws Exception {
        URL website = new URL(urlString);
        logger.info("Connect to url and try to read file.");
        try (
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(destination)
        ) {
            logger.info("Get data from file.");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            logger.info("Write data to file.");
        }
    }

    public static boolean isFileExist(File file) {
        return file.exists();
    }
}
