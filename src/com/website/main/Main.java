package com.website.main;

import com.website.controller.Controller;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                Controller controller = new Controller();
                controller.startProgramLoop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
