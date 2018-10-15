package com.bulletinboard;

public abstract class BulletinBoardService extends BULLETINGrpc.BULLETINImplBase{
	@Override
	public void gETS(GET request,
	        io.grpc.stub.StreamObserver<GET> responseObserver) {
			return;
	}
    
	@Override
	public void lISTS(LIST request,
	        io.grpc.stub.StreamObserver<LIST> responseObserver) {
			return;
	}
	
	@Override
	public void pOST(PUT request,
	        io.grpc.stub.StreamObserver<PUT> responseObserver) {
			return;
	}
}