/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import traductor.MyFrame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import com.leapmotion.leap.Controller;


import traductor.IniciarLeapMotion;
/**
 *
 * @author Alexia
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	
    	Thread hilo=new Thread(new Runnable() {				
			@Override
			public void run() {	
				
				 IniciarLeapMotion leapMotion=new IniciarLeapMotion();
			
				  MyFrame ventana=new MyFrame();
				 // ventana.setDatos(array);
				  
				   Controller control =new Controller();
			
					   control.addListener(leapMotion);

					     try {
					            System.in.read();						 
					        } catch (IOException e) {e.printStackTrace();
					        }catch(Exception e){e.printStackTrace();}
					        control.removeListener(leapMotion);						                						    					                             				  
			}
		});		
    	hilo.start();
    }
   
}
