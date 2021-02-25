package core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class AssertWrapper {
    private static Logger LOG = LoggerFactory.getLogger(AssertWrapper.class);
    public static void assertEquals(String actual, String expected) {
        LOG.debug("assertEquals: actual result: {}, expected result: {}", actual, expected );
        Assert.assertEquals(actual, expected);
    }
}
