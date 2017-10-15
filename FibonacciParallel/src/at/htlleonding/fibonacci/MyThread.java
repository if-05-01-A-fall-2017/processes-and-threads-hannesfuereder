/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htlleonding.fibonacci;

/**
 *
 * @author Hannes
 */
public class MyThread extends Thread{
    
    private int x;
    public int answer;

    public MyThread(int x) {
        this.x = x;
    }

    public void run() {
        if( x < 2 )
            answer = 1;
        else {
            try {
                MyThread f1 = new MyThread(x-1);
                MyThread f2 = new MyThread(x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
            }
            catch(InterruptedException ex) { }
        }
    }
}
