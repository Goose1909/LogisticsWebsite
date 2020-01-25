package com.website.main;

import com.website.controller.Controller;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Controller controller = new Controller();
            controller.startProgramLoop();
        }
    }
}
