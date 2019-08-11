package com.bushemi.service.interfaces;

/**
 * interface for basic operations
 */
public interface GrpcServer {
    /**
     * Starts the server;
     */
    void start();

    /**
     * Shut down the server;
     *
     * @throws IllegalStateException if server is not running;
     */
    void shutdown();
}
