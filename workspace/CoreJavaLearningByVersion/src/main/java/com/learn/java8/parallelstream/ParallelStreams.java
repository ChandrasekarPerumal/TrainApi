/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.java8.parallelstream;

import java.util.stream.IntStream;

/**
 *
 * @author mglocadmin
 */
public class ParallelStreams {

    public static void parallelStrmSample() {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();

        IntStream.range(1, 21).forEach(System.out::print);
        end = System.currentTimeMillis();
        System.out.println("Time :" + (end - start));

        start = System.currentTimeMillis();
        IntStream.range(1, 21).parallel().forEach(System.out::print);
        end = System.currentTimeMillis();
        System.out.println("Time " + (end - start));

    }

    public static void main(String[] args) {
        parallelStrmSample();
    }

}
