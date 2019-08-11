package com.bushemi.service;

import com.bushemi.service.interfaces.HttpCallerService;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class HttpCallerServiceImpl implements HttpCallerService {

    @Override
    public CompletableFuture<TouchResponse> callForUrl(String url) {
        Objects.requireNonNull(url, "url can't be null.");
        if (url.trim().isEmpty()) {
            throw new IllegalArgumentException("url can't be empty.");
        }
        HttpClient client = HttpClientBuilder.create().build();
        url = validateUrl(url);
        HttpGet request = new HttpGet(url);
        return CompletableFuture.supplyAsync(() -> httpCall(client, request));
    }

    private String validateUrl(String url) {
        boolean doesUrlStartWithHttpPrefix = url.startsWith("http:") || url.startsWith("https:");
        return doesUrlStartWithHttpPrefix ? url : "http://" + url;
    }

    private TouchResponse httpCall(HttpClient client, HttpGet request) {
        try {
            long start = System.currentTimeMillis();
            HttpResponse execute = client.execute(request);
            long timeout = System.currentTimeMillis() - start;
            int statusCode = execute.getStatusLine().getStatusCode();
            return new TouchResponse(statusCode, (int) timeout);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
