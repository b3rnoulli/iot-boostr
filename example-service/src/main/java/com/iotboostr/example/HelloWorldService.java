package com.iotboostr.example;

import static spark.Spark.*;

public class HelloWorldService {
    public static void main(String[] args) {

        get("/hello", (req, res)->"Hello, world");

        get("/hello/:name", (req,res)-> "Hello, "+ req.params(":name"));
    }
}
