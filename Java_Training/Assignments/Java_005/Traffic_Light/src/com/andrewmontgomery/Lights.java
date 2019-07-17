package com.andrewmontgomery;

class Lights implements Runnable {
    // Create our fields
    Thread third;
    boolean suspended;
    boolean stopped;
    Lights(String name) {
        third = new Thread(this, name);
        suspended = false; // Set our boolean value to false
        stopped = false; // Set our boolean value to false
        third.start();
    }
    // The entry point for the thread begins here.
    public void run() {
        //	System.out.println(third.getName() + " starting.");
        try {
            // Create a message that allows the user to know that the simulator is on
            System.out.println("Traffic Light Simulator is a Go!");
            while(!stopped) {
                // Create a message to allow the user to know the light is green
                System.out.println("Light is Green - Go!");
                Thread.sleep(Status.GREEN.getTime());
                // Create a message to allow the user to know the light is yellow
                System.out.println("Light is Yellow - Beware!");
                Thread.sleep(Status.YELLOW.getTime());
                // Create a message to allow the user to know the light is red
                System.out.println("Light is Read - Stop!");
                Thread.sleep(Status.RED.getTime());
            }


        }
        catch (InterruptedException exc) {
            System.out.println(third.getName() + " interrupted.");
        }

    }
    // Thread is Stopped
    synchronized void mystop() {
        stopped = true;
        // The following ensures that a suspended thread can be stopped.
        suspended = false;
        notifyAll();
    }
    // Thread is Suspended
    synchronized void mysuspend() {
        suspended = true;
    }
    // Thread is Resumed
    synchronized void myresume() {
        suspended = false;
        notify();
    }
    //setting the Priority to High
    synchronized void setPriorityHigh(){
        third.setPriority(Thread.MAX_PRIORITY);
        notify();
        System.out.println(third.getName() + " Priority was set to High");
    }
    //setting the Priority to High
    synchronized void setPriorityLow(){
        third.setPriority(Thread.MIN_PRIORITY);
        notify();
        System.out.println(third.getName() + " Priority was set to Low");
    }
}