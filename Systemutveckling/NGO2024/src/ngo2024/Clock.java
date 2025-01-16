/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;


import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



        




/**
 *
 * @author jamie
 */
public class Clock {
    
    public void startClock (JLabel label) {
        
        
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        
        Timer timer = new Timer (1000, e -> {
            
            String currentTime = LocalTime.now().format(formatter);
            label.setText(currentTime);
            
            
        });
        
        timer.start();
        
        
        
        
    }
    
    
    
    
    
        
        
        
        
        
    
    
    
    
    
}
