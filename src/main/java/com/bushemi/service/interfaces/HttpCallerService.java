package com.bushemi.service.interfaces;

import com.bushemi.service.TouchResponse;

import java.util.concurrent.CompletableFuture;

public interface HttpCallerService {

    CompletableFuture<TouchResponse> callForUrl(String url);
}
