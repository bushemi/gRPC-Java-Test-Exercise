package com.bushemi.service;

import com.bushemi.proto.Grpc;
import com.bushemi.proto.WebResourceTouchGrpc;
import io.grpc.stub.StreamObserver;

import static java.util.Objects.nonNull;

public class WebResourceTouchServiceImpl extends WebResourceTouchGrpc.WebResourceTouchImplBase {
    private HttpCallerServiceImpl callerService = new HttpCallerServiceImpl();

    @Override
    public void touch(Grpc.TouchRequest request, StreamObserver<Grpc.TouchResponse> responseObserver) {
        String url = request.getUrl();

        callerService.callForUrl(url)
                .whenComplete((result, exception) -> {
                    if (nonNull(exception)) {
                        result = new TouchResponse(500, 0);
                    }
                    Grpc.TouchResponse.Builder builder = Grpc.TouchResponse.newBuilder();
                    builder.setResponseCode(result.getCode());
                    builder.setResponseTime(result.getTimout());
                    responseObserver.onNext(builder.build());
                    responseObserver.onCompleted();
                });
    }
}
