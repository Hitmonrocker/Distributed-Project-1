package com.bulletinboard;

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
    comments = "Source: BulletinBoard.proto")
public final class BULLETINGrpc {

  private BULLETINGrpc() {}

  public static final String SERVICE_NAME = "com.bulletinboard.BULLETIN";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.PUT,
      com.bulletinboard.PUT> getPOSTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "POST",
      requestType = com.bulletinboard.PUT.class,
      responseType = com.bulletinboard.PUT.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.PUT,
      com.bulletinboard.PUT> getPOSTMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.PUT, com.bulletinboard.PUT> getPOSTMethod;
    if ((getPOSTMethod = BULLETINGrpc.getPOSTMethod) == null) {
      synchronized (BULLETINGrpc.class) {
        if ((getPOSTMethod = BULLETINGrpc.getPOSTMethod) == null) {
          BULLETINGrpc.getPOSTMethod = getPOSTMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.PUT, com.bulletinboard.PUT>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BULLETIN", "POST"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.PUT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.PUT.getDefaultInstance()))
                  .setSchemaDescriptor(new BULLETINMethodDescriptorSupplier("POST"))
                  .build();
          }
        }
     }
     return getPOSTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.LIST,
      com.bulletinboard.LIST> getLISTSMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LISTS",
      requestType = com.bulletinboard.LIST.class,
      responseType = com.bulletinboard.LIST.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.LIST,
      com.bulletinboard.LIST> getLISTSMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.LIST, com.bulletinboard.LIST> getLISTSMethod;
    if ((getLISTSMethod = BULLETINGrpc.getLISTSMethod) == null) {
      synchronized (BULLETINGrpc.class) {
        if ((getLISTSMethod = BULLETINGrpc.getLISTSMethod) == null) {
          BULLETINGrpc.getLISTSMethod = getLISTSMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.LIST, com.bulletinboard.LIST>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BULLETIN", "LISTS"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.LIST.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.LIST.getDefaultInstance()))
                  .setSchemaDescriptor(new BULLETINMethodDescriptorSupplier("LISTS"))
                  .build();
          }
        }
     }
     return getLISTSMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.GET,
      com.bulletinboard.GET> getGETSMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GETS",
      requestType = com.bulletinboard.GET.class,
      responseType = com.bulletinboard.GET.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.GET,
      com.bulletinboard.GET> getGETSMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.GET, com.bulletinboard.GET> getGETSMethod;
    if ((getGETSMethod = BULLETINGrpc.getGETSMethod) == null) {
      synchronized (BULLETINGrpc.class) {
        if ((getGETSMethod = BULLETINGrpc.getGETSMethod) == null) {
          BULLETINGrpc.getGETSMethod = getGETSMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.GET, com.bulletinboard.GET>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BULLETIN", "GETS"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.GET.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.GET.getDefaultInstance()))
                  .setSchemaDescriptor(new BULLETINMethodDescriptorSupplier("GETS"))
                  .build();
          }
        }
     }
     return getGETSMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BULLETINStub newStub(io.grpc.Channel channel) {
    return new BULLETINStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BULLETINBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BULLETINBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BULLETINFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BULLETINFutureStub(channel);
  }

  /**
   */
  public static abstract class BULLETINImplBase implements io.grpc.BindableService {

    /**
     */
    public void pOST(com.bulletinboard.PUT request,
        io.grpc.stub.StreamObserver<com.bulletinboard.PUT> responseObserver) {
      asyncUnimplementedUnaryCall(getPOSTMethod(), responseObserver);
    }

    /**
     */
    public void lISTS(com.bulletinboard.LIST request,
        io.grpc.stub.StreamObserver<com.bulletinboard.LIST> responseObserver) {
      asyncUnimplementedUnaryCall(getLISTSMethod(), responseObserver);
    }

    /**
     */
    public void gETS(com.bulletinboard.GET request,
        io.grpc.stub.StreamObserver<com.bulletinboard.GET> responseObserver) {
      asyncUnimplementedUnaryCall(getGETSMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPOSTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.PUT,
                com.bulletinboard.PUT>(
                  this, METHODID_POST)))
          .addMethod(
            getLISTSMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.LIST,
                com.bulletinboard.LIST>(
                  this, METHODID_LISTS)))
          .addMethod(
            getGETSMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.GET,
                com.bulletinboard.GET>(
                  this, METHODID_GETS)))
          .build();
    }
  }

  /**
   */
  public static final class BULLETINStub extends io.grpc.stub.AbstractStub<BULLETINStub> {
    private BULLETINStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BULLETINStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BULLETINStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BULLETINStub(channel, callOptions);
    }

    /**
     */
    public void pOST(com.bulletinboard.PUT request,
        io.grpc.stub.StreamObserver<com.bulletinboard.PUT> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPOSTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lISTS(com.bulletinboard.LIST request,
        io.grpc.stub.StreamObserver<com.bulletinboard.LIST> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLISTSMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gETS(com.bulletinboard.GET request,
        io.grpc.stub.StreamObserver<com.bulletinboard.GET> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGETSMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BULLETINBlockingStub extends io.grpc.stub.AbstractStub<BULLETINBlockingStub> {
    private BULLETINBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BULLETINBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BULLETINBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BULLETINBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bulletinboard.PUT pOST(com.bulletinboard.PUT request) {
      return blockingUnaryCall(
          getChannel(), getPOSTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bulletinboard.LIST lISTS(com.bulletinboard.LIST request) {
      return blockingUnaryCall(
          getChannel(), getLISTSMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bulletinboard.GET gETS(com.bulletinboard.GET request) {
      return blockingUnaryCall(
          getChannel(), getGETSMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BULLETINFutureStub extends io.grpc.stub.AbstractStub<BULLETINFutureStub> {
    private BULLETINFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BULLETINFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BULLETINFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BULLETINFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.PUT> pOST(
        com.bulletinboard.PUT request) {
      return futureUnaryCall(
          getChannel().newCall(getPOSTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.LIST> lISTS(
        com.bulletinboard.LIST request) {
      return futureUnaryCall(
          getChannel().newCall(getLISTSMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.GET> gETS(
        com.bulletinboard.GET request) {
      return futureUnaryCall(
          getChannel().newCall(getGETSMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST = 0;
  private static final int METHODID_LISTS = 1;
  private static final int METHODID_GETS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BULLETINImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BULLETINImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST:
          serviceImpl.pOST((com.bulletinboard.PUT) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.PUT>) responseObserver);
          break;
        case METHODID_LISTS:
          serviceImpl.lISTS((com.bulletinboard.LIST) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.LIST>) responseObserver);
          break;
        case METHODID_GETS:
          serviceImpl.gETS((com.bulletinboard.GET) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.GET>) responseObserver);
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

  private static abstract class BULLETINBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BULLETINBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bulletinboard.BulletinBoard.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BULLETIN");
    }
  }

  private static final class BULLETINFileDescriptorSupplier
      extends BULLETINBaseDescriptorSupplier {
    BULLETINFileDescriptorSupplier() {}
  }

  private static final class BULLETINMethodDescriptorSupplier
      extends BULLETINBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BULLETINMethodDescriptorSupplier(String methodName) {
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
      synchronized (BULLETINGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BULLETINFileDescriptorSupplier())
              .addMethod(getPOSTMethod())
              .addMethod(getLISTSMethod())
              .addMethod(getGETSMethod())
              .build();
        }
      }
    }
    return result;
  }
}
