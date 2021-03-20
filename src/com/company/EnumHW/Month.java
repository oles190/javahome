package com.company.EnumHW;

public enum Month {

    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER),
    JULI(31, Season.SUMMER),
    AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN),
    NOVEMBER(30, Season.AUTUMN),
    DECEMBER(31, Season.WINTER);


    private int days;
    private Season season;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    Month(int days, Season season) {
        this.days = days;
        this.season = season;
    }

    public void sameSeason() {
        System.out.println("All months with the same season:");
        for (Month anotherMonth : Month.values()) {
            if (!this.name().equals(anotherMonth.name()) && this.getSeason().equals(anotherMonth.getSeason())) {
                System.out.print(anotherMonth.name() + "; ");
            }

        }
        System.out.println();

    }

    public void sameNumberOfDays() {
        System.out.println("All months with the same number of days:");
        int count = 0;
        for (Month anotherMonth : Month.values()) {
            if (!this.name().equals(anotherMonth.name()) && this.getDays() == anotherMonth.getDays()) {
                System.out.print(anotherMonth.name() + "; ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("There are no months with same number of days");
        }
        System.out.println();
    }
}