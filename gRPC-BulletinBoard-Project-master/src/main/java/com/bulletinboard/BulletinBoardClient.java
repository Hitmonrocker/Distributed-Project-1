package com.bulletinboard;
import java.util.Scanner;

import com.bulletinboard.BULLETINGrpc.BULLETINBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.net.Socket;
import java.rmi.Naming;
public class BulletinBoardClient {
	static error response = null;
	static print response1;
	static GET request = null;
	static LIST request2 = null;
	static DELETE request3 = null;
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		BulletinBoardService sample;
		int stop = 0;
		String variable = "start";
		String[] input;
		String title;
		String body;
		BULLETINGrpc.BULLETINBlockingStub stub;
		int port = Integer.parseInt("20001");
        String url = "//localhost:" + port + "/Sample";
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",port).usePlaintext().build();
        stub = BULLETINGrpc.newBlockingStub(channel);
		Scanner userInput = new Scanner(System.in);
		while(variable!="Quit") {
			System.out.println("Enter a command(Type Quit to exit): ");
			variable = userInput.nextLine();
			input = variable.split(" ");
			switch(input[0]) {
				case "get":
					System.out.println("Get");
					response = stub.gETS(GET.newBuilder().setTitle(input[1]).build());
					System.out.println(response.getErrno().toString());
					break;
				case "post":
					System.out.println("Post");
					response = stub.pOST(PUT.newBuilder().setTitle(input[1]).setBody(input[2]).build());
					System.out.println(response.getErrno());
					break;
				case "delete":
					System.out.println("Delete");
					response = stub.dELETES(DELETE.newBuilder().setTitle(input[1]).build());
					System.out.println(response.getErrno());
					break;
				case "list":
					System.out.println("List");
					response1 = stub.lISTS(LIST.newBuilder().build());
					System.out.println("List1");
					System.out.println(response1.getTitle());
					break;
				default:
					break;
			}
		}
		userInput.close();
		channel.shutdown();
	}

	public void error(String errno)
	{
		System.out.println(errno);
	}

	public void print(String title, String message){
		System.out.println(title + " : "+ message);
	}

}
