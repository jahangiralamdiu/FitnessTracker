package com.pluralsight.service;

import com.pluralsight.model.Activity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 29/09/2014.
 */
@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Override
    public List<Activity> findAllActivities()
    {
        List<Activity> activities = new ArrayList<Activity>();

        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDesc("Bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDesc("Swim");
        activities.add(swim);

        return activities;

    }
}
