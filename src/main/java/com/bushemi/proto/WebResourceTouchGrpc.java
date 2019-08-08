package com.bushemi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: grpc.proto")
public final class WebResourceTouchGrpc {

  private WebResourceTouchGrpc() {}

  public static final String SERVICE_NAME = "WebResourceTouch";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bushemi.proto.Grpc.TouchRequest,
      com.bushemi.proto.Grpc.TouchResponse> getTouchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "touch",
      requestType = com.bushemi.proto.Grpc.TouchRequest.class,
      responseType = com.bushemi.proto.Grpc.TouchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bushemi.proto.Grpc.TouchRequest,
      com.bushemi.proto.Grpc.TouchResponse> getTouchMethod() {
    io.grpc.MethodDescriptor<com.bushemi.proto.Grpc.TouchRequest, com.bushemi.proto.Grpc.TouchResponse> getTouchMethod;
    if ((getTouchMethod = WebResourceTouchGrpc.getTouchMethod) == null) {
      synchronized (WebResourceTouchGrpc.class) {
        if ((getTouchMethod = WebResourceTouchGrpc.getTouchMethod) == null) {
          WebResourceTouchGrpc.getTouchMethod = getTouchMethod = 
              io.grpc.MethodDescriptor.<com.bushemi.proto.Grpc.TouchRequest, com.bushemi.proto.Grpc.TouchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "WebResourceTouch", "touch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bushemi.proto.Grpc.TouchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bushemi.proto.Grpc.TouchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WebResourceTouchMethodDescriptorSupplier("touch"))
                  .build();
          }
        }
     }
     return getTouchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebResourceTouchStub newStub(io.grpc.Channel channel) {
    return new WebResourceTouchStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebResourceTouchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WebResourceTouchBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebResourceTouchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WebResourceTouchFutureStub(channel);
  }

  /**
   */
  public static abstract class WebResourceTouchImplBase implements io.grpc.BindableService {

    /**
     */
    public void touch(com.bushemi.proto.Grpc.TouchRequest request,
        io.grpc.stub.StreamObserver<com.bushemi.proto.Grpc.TouchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTouchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTouchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bushemi.proto.Grpc.TouchRequest,
                com.bushemi.proto.Grpc.TouchResponse>(
                  this, METHODID_TOUCH)))
          .build();
    }
  }

  /**
   */
  public static final class WebResourceTouchStub extends io.grpc.stub.AbstractStub<WebResourceTouchStub> {
    private WebResourceTouchStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebResourceTouchStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebResourceTouchStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebResourceTouchStub(channel, callOptions);
    }

    /**
     */
    public void touch(com.bushemi.proto.Grpc.TouchRequest request,
        io.grpc.stub.StreamObserver<com.bushemi.proto.Grpc.TouchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTouchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WebResourceTouchBlockingStub extends io.grpc.stub.AbstractStub<WebResourceTouchBlockingStub> {
    private WebResourceTouchBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebResourceTouchBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebResourceTouchBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebResourceTouchBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bushemi.proto.Grpc.TouchResponse touch(com.bushemi.proto.Grpc.TouchRequest request) {
      return blockingUnaryCall(
          getChannel(), getTouchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WebResourceTouchFutureStub extends io.grpc.stub.AbstractStub<WebResourceTouchFutureStub> {
    private WebResourceTouchFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebResourceTouchFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebResourceTouchFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebResourceTouchFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bushemi.proto.Grpc.TouchResponse> touch(
        com.bushemi.proto.Grpc.TouchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTouchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOUCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebResourceTouchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebResourceTouchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOUCH:
          serviceImpl.touch((com.bushemi.proto.Grpc.TouchRequest) request,
              (io.grpc.stub.StreamObserver<com.bushemi.proto.Grpc.TouchResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WebResourceTouchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebResourceTouchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bushemi.proto.Grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebResourceTouch");
    }
  }

  private static final class WebResourceTouchFileDescriptorSupplier
      extends WebResourceTouchBaseDescriptorSupplier {
    WebResourceTouchFileDescriptorSupplier() {}
  }

  private static final class WebResourceTouchMethodDescriptorSupplier
      extends WebResourceTouchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebResourceTouchMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebResourceTouchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebResourceTouchFileDescriptorSupplier())
              .addMethod(getTouchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
