/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spiedra
 */
public class ClassThread extends Thread{
    private String nameThread;

    public ClassThread(String nameThread) {
        this.nameThread = nameThread;
    }
    
    private void printNameThread(){
        System.out.println("Hello, I'm: " + this.nameThread);
    }
    
    private void sleepThread(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClassThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        while(true){
            this.printNameThread();
            this.sleepThread();
        }
    }
}
