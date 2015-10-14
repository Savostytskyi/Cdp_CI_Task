package com.epam.ci;

import com.epam.ci.download.Constants;
import org.apache.log4j.Logger;

import java.io.File;
import static com.epam.ci.download.IOHelper.downloadFileFromURL;

/**
 * @author Anton_Savostytskyi on 10/12/2015.
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        File file = new File(Constants.PATH_TO_DOWNLOADED_FILE);
        logger.info("Create file for received data.");
        try {
            downloadFileFromURL(Constants.DOWNLOAD_FILE_URL, file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
