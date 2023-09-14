package org.example;


import io.vertx.core.Vertx;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Vertx.vertx().deployVerticle(new MainVerticle());
    }
}
