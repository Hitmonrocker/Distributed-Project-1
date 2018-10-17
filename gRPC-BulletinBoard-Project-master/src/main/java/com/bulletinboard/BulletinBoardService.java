package com.bulletinboard;

import io.grpc.stub.StreamObserver;

import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;

public class BulletinBoardService extends BULLETINGrpc.BULLETINImplBase implements Remote{
    Map<String,String> Board = new HashMap<String, String>();
    @Override
    public void gETS(GET request,
                     StreamObserver<error> responseObserver) {
        String ret = "Error Post Not Found";
        //Checks to see if post exists
        if(Board.containsKey(request.getTitle())) {
        	ret = Board.get(request.getTitle());
        }
        //Sends response
        error rep = error.newBuilder().setErrno(ret).build();
        responseObserver.onNext(rep);
        responseObserver.onCompleted();
        return;
    }
    
    @Override
    public void lISTS(LIST request,
            io.grpc.stub.StreamObserver<print> responseObserver) {
    	StringBuilder s1 = new StringBuilder();
    	//Builds response
    	for(String s : Board.keySet()) {
    		s1.append(s).append(",");
    	}
    	//Sends response
        print rep = print.newBuilder().setTitle(s1.toString()).build();
        System.out.println(Board.keySet().toArray().toString());
        responseObserver.onNext(rep);
        responseObserver.onCompleted();
        return;
    }

    @Override
    public void pOST(PUT request,
                     io.grpc.stub.StreamObserver<error> responseObserver) {
        String ret=request.getTitle().toString() +" posted";
        //Checks for duplicate post
        if(Board.containsKey(request.getTitle())){
        	ret = request.getTitle().toString() +" posted(Warning a post with that title already exists. Replaced past body with new body)";
        }
        //Sends response message
        Board.put(request.getTitle().toString(), request.getBody().toString());
        error rep = error.newBuilder().setErrno(ret).build();
        responseObserver.onNext(rep);
        responseObserver.onCompleted();

        return;
    }
    
    @Override
    public void dELETES(DELETE request,
                       io.grpc.stub.StreamObserver<error> responseObserver) {
    	String ret = "Error Post Not Found";
    	//Checks to see if post exists
        if(Board.containsKey(request.getTitle())) {
        	Board.put(request.getTitle(),request.getTitle());
            ret = request.getTitle()+" deleted";
            Board.remove(request.getTitle());
        }
        //Sends response message
        error rep = error.newBuilder().setErrno(ret).build();
        responseObserver.onNext(rep);
        responseObserver.onCompleted();

        return;
    }

}