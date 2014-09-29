package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

/**
 * Created by lenovo on 29/09/2014.
 */
public class Goal {

    public int minutes;

    @Range(min = 1, max=120)
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
