package com.bushemi.service;

import com.bushemi.service.interfaces.GrpcServer;

public class ServerRunner {
    public static void main(String[] args) throws InterruptedException {
        GrpcServer server = new GrpcServerImpl(8099);
        server.start();
        Thread.sleep(10000);
        server.shutdown();
    }
}
