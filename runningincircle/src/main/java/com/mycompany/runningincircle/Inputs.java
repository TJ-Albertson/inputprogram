/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.runningincircle;

import java.awt.Robot;
import java.awt.event.*;

/**
 *
 * @author thoma
 */
public class Inputs extends Thread {
    
    private volatile boolean running = true;

    public void terminate() {
        running = false;
    }
    
    public void run()
    {
        while(running) {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
                
                
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_W);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_A);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_A);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_S);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_S);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_D);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_D);
                robot.delay(100);
                
                
            } catch (Exception e) {
                System.out.println("Exception is caught");
                running = false;
            }
        }
    }
}
    