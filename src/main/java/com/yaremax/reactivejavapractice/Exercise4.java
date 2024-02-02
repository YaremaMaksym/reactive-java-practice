package com.yaremax.reactivejavapractice;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono()
                .subscribe(number -> System.out.println(number));

        // Get the value from the Mono into an integer variable
        int value = ReactiveSources.intNumberMono()
                .block();
        System.out.println(value);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
