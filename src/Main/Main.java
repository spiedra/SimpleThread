/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Domain.ClassThread;

/**
 *
 * @author spiedra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassThread threadOne = new ClassThread("Thread 1");
        ClassThread threadTwo = new ClassThread("Thread two");
        threadOne.start();
        threadTwo.start();
    }

}
