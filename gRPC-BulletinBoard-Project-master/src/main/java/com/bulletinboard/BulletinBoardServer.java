package com.bulletinboard;
import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BulletinBoardServer {
    
	
    public static void main(String[] args) {
    	//Builds Server
    	Server server = ServerBuilder
    	          .forPort(20001)
    	          .addService(new BulletinBoardService()).build();
    	 //Starts Server and handles termination
    	        try {
					server.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
    	        try {
					server.awaitTermination();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    }
}
