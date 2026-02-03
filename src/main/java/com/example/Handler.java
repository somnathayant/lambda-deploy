package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Object, String> {

    private final Application app = new Application();

    @Override
    public String handleRequest(Object input, Context context) {
        return app.run();
    }
}
