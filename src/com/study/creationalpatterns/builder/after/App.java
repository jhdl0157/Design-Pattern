package com.study.creationalpatterns.builder.after;

import com.study.creationalpatterns.builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
        System.out.println(tourPlan.toString());
    }
}
