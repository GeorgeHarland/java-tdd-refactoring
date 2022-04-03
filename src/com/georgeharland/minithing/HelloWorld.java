package com.georgeharland.minithing;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        if (args.length == 1) {
            System.out.println(helloWorld.returnGreeting(args[0]));
        } else {
            System.out.println(helloWorld.returnGreeting());
        }
    }

    public String returnGreeting(String language) {
        if (language.equals("spanish")) {
            return "Hello world in Spanish";
        }
        return "Hello, World!";
    }

    public String returnGreeting() {
        return returnGreeting("english");
    }
}