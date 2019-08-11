package com.bushemi.service;

import com.bushemi.service.interfaces.GrpcServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

import static java.util.Objects.isNull;

public class GrpcServerImpl implements GrpcServer {
    private Server server;
    private final int port;

    /**
     * Constructor for server;
     *
     * @param port chosen port for running the server.
     */
    public GrpcServerImpl(int port) {
        this.port = port;
    }

    @Override
    public void start() {
        System.out.println("Server has been started.");
        server = ServerBuilder.forPort(port)
                .addService(new WebResourceTouchServiceImpl())
                .build();

        try {
            server.start();
            System.out.println("server started at " + server.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shutdown() {
        if (isNull(server) || server.isShutdown())
            throw new IllegalStateException("You can't stop not running server.");
        server.shutdown();
    }
}
