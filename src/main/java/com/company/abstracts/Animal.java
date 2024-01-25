package com.company.abstracts;

import java.util.Calendar;
import java.util.Date;

public abstract class Animal {
    public Animal() {}

    public Animal(Integer serialNumber, String name, Date birthday) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.birthday = birthday;
    }

    private Integer serialNumber;
    private String name;
    private Date birthday;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public abstract String saySomething();

    /**
     * Calculates the age of the animal based on its birthday.
     * @return The age of the animal in years. Or -1 if birthday was not specified.
     */
    public int getAge() {
        if (birthday == null) {
            return -1;
        }

        Calendar birth = Calendar.getInstance();
        birth.setTime(birthday);
        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= birth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
}
