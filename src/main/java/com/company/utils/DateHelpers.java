package com.company.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateHelpers {
    /**
     * Creates a date in the past based on the number of years provided.
     * @param yearsAgo the number of years to subtract from the current date.
     * @return a Date object representing the date in the past.
     */
    public static Date createDateYearsAgo(int yearsAgo) {
        // Get the current date as LocalDate
        LocalDate pastDate = LocalDate.now().minus(yearsAgo, ChronoUnit.YEARS);

        // Convert LocalDate to Date
        return Date.from(pastDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
