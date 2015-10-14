package com.epam.ci;

import com.epam.ci.download.Constants;
import com.epam.ci.download.IOHelper;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.File;


/**
 * @author Savostytskyi Anton on 14.10.2015.
 */
public class IOTests {

    File file;
    private static final Logger logger = Logger.getLogger(Main.class);

    @Before
    public void setUp() {
        file = new File("d:/unit_test.txt");
    }

    @Test
    public void checkDBDataSetUp() throws Exception {
        IOHelper.downloadFileFromURL(Constants.DOWNLOAD_FILE_URL, file);
        Assert.assertTrue("FAILED: file not present", IOHelper.isFileExist(file));
        logger.info("Test: File successfully download.");
    }
}