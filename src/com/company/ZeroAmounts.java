package com.company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ZeroAmounts {

    private static final Log log = LogFactory.getLog(ZeroAmounts.class);

    /**
     * Calculate amount of zeros in the end of N! value
     *
     * @param n value for N!
     * @return amount of zeros
     * @throws IllegalArgumentException
     */
    public static int getZerosCount(int n) throws IllegalArgumentException {
        int result = 0;

        if (n < 0) {
            log.error("Negative value received");
            throw new IllegalArgumentException("Only positive values allowed");
        } else {
            while (n > 0) {
                n /= 5;
                result += n;
            }
        }

        return result;
    }
}
