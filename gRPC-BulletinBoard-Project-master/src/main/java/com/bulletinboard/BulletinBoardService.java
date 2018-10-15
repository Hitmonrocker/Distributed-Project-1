package com.bulletinboard;

import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public abstract class BulletinBoardService extends BULLETINGrpc.BULLETINImplBase{
    Map<String,String> Board = new HashMap<String, String>();
    @Override
    public void gETS(GET request,
                     StreamObserver<error> responseObserver) {
        String ret = "Error Request Not Found";
        if(Board.containsKey(request.getTitle()))
            ret = Board.get(request.getTitle());

        error rep = error.newBuilder().setErrno(ret).build();
        responseObserver.onNext(rep);
        responseObserver.onCompleted();
        return;
    }
    @Override
    public void lISTS(LIST request,
                      io.grpc.stub.StreamObserver<print> responseObserver) {
        print rep = print.newBuilder().setTitle(Board.keySet().toArray().toString()).build();

        return;
    }

    @Override
    public void pOST(PUT request,
                     io.grpc.stub.StreamObserver<error> responseObserver) {
        Board.put(request.getTitle(),request.getBody());
        String ret = request.getTitle()+" posted";

        error rep = error.newBuilder().setErrno(ret).build();
        responseObserver.onNext(rep);
        responseObserver.onCompleted();

        return;
    }
    @Override
    public void dELETES(DELETE request,
                       io.grpc.stub.StreamObserver<error> responseObserver) {
        Board.put(request.getTitle(),request.getTitle());
        String ret = request.getTitle()+" deleted";
        Board.remove(request.getTitle());
        error rep = error.newBuilder().setErrno(ret).build();
        responseObserver.onNext(rep);
        responseObserver.onCompleted();

        return;
    }

}