package com.andrewmontgomery;

enum Status {
    // Set the time for the Green Light
    GREEN(5000),
    // Set the time for the Red Light
    RED(3000),
    // Set the time for the Yellow Light
    YELLOW(2000);
    private Integer time;
    //constructor
    Status(Integer t){
        time = t;
    }
    int getTime(){

        return time;
    }
}

