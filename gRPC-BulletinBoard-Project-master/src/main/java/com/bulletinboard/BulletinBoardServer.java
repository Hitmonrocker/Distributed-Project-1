package com.bulletinboard;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BulletinBoardServer {
    
	
    public static void main(String[] args) {
    	Server server = ServerBuilder
    	          .forPort(20001)
    	          .addService(new BulletinBoardService()).build();
    	 
    	        try {
					server.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	        try {
					server.awaitTermination();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    }
}
