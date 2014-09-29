package com.pluralsight.service;

import com.pluralsight.model.Activity;

import java.util.List;

/**
 * Created by lenovo on 29/09/2014.
 */
public interface ExerciseService {
    List<Activity> findAllActivities();
}
