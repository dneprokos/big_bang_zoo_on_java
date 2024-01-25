package com.company.utils;

public class SerialNumberHelper {
    private Integer serialNumber = 0;

    /**
     * Gets next available serial number
     * @return Serial Number
     */
    public Integer getSerialNumber() {
        serialNumber += 1;
        return serialNumber;
    }
}
