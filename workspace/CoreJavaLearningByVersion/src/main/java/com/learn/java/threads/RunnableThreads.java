/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author mglocadmin
 */
public class RunnableThreads implements Runnable ,Callable {

    public static void main(String[] args) {
        RunnableThreads rt = new RunnableThreads();
        Thread t = new Thread(rt);
        t.start();

        try {
            ExecutorService es = Executors.newFixedThreadPool(1);
//            Future future = es.submit(rt);
//            System.out.println("Future :" + future.get());

            es.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(" Runnable ---");
    }
    @Override
    public Integer call() throws Exception {

        return 10;

    }

}
