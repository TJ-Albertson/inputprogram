/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.runningincircle;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;   
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.Border;

//test from mac

public class Main extends Canvas{  
    
    public static int count = -1;
    
    
    public static void main(String[] args) {  
        
        JFrame f = new JFrame("Circle Runner");    
        
        JButton b1 = new JButton("Start");  
        b1.setBounds(265,320,95,30);
        b1.setBackground(Color.LIGHT_GRAY);
        
        JButton b2 = new JButton("Stop");  
        b2.setBounds(370,320,95,30);
        b2.setBackground(Color.LIGHT_GRAY);
        
        DefaultListModel<String> listModel = new DefaultListModel<>();  
        
        ArrayList<Inputs> list = new ArrayList<Inputs>();
        
        JList<String> jList = new JList<>(listModel);  
        jList.setBounds(265,15,200,300);
        
        Border blackline = BorderFactory.createLineBorder(Color.black);
        jList.setBorder(blackline);
        
        JTextField t1 = new JTextField();
        t1.setBounds(20,15,150,30);  
        
        JButton b3 = new JButton("add inp");  
        b3.setBounds(180,17,75,25);
        b3.setBackground(Color.LIGHT_GRAY);
        
        b1.addActionListener((ActionEvent e) -> {      
            count++;
            list.add(new Inputs());
            list.get(count).start();
        });
        
        b2.addActionListener((ActionEvent e) -> {
            list.get(count).terminate();             
        }); 
        
        b3.addActionListener((ActionEvent e) -> {
            listModel.addElement("bruh");             
        }); 
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(jList);
        f.add(t1);
        
        f.setSize(500,400);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
}  
}  
