/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.apfeh;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ramar
 */
public class MyFirstFrame extends JFrame{
    
    public MyFirstFrame(){
    
        setTitle("My First Frame");
        setSize(400,400);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setForeground(Color.RED);
        setVisible(true);
        
    }
    
}
