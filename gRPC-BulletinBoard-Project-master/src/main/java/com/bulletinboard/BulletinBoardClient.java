package com.bulletinboard;
import java.util.Scanner;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
public class BulletinBoardClient {
	static error response = null;
	static print response1;
	static GET request = null;
	static LIST request2 = null;
	static DELETE request3 = null;
	//@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		if(args.length>0) {
			System.out.println("Do not pass any arguments");
			System.out.println("Port number is hard coded in as 20001");
			return;
		}
		int stop = 0;
		String variable = "start";
		String[] input;
		BULLETINGrpc.BULLETINBlockingStub stub;
		int port = Integer.parseInt("20001");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",port).usePlaintext().build();
        stub = BULLETINGrpc.newBlockingStub(channel);
		Scanner userInput = new Scanner(System.in);
		while(stop == 0) {
			System.out.println("Enter a command(Type Quit to exit): ");
			variable = userInput.nextLine();
			input = variable.split(" ");
			switch(input[0]) {
				case "get":
					//checks for incorrect params
					if(input.length!=2) {
						System.out.println("Error: Incorrect number of parameters");
						System.out.println("get takes in one parameter [title]");
						break;
					}
					//calls get
					response = stub.gETS(GET.newBuilder().setTitle(input[1]).build());
					System.out.println(response.getErrno().toString());
					break;
				case "post":
					//checks for incorrect params
					if(input.length!=3) {
						System.out.println("Error: Incorrect number of parameters");
						System.out.println("post takes in two parameters [title] and [body]");
						break;
					}
					//calls post
					response = stub.pOST(PUT.newBuilder().setTitle(input[1]).setBody(input[2]).build());
					System.out.println(response.getErrno());
					break;
				case "delete":
					//checks for incorrect params
					if(input.length!=2) {
						System.out.println("Error: Incorrect number of parameters");
						System.out.println("delete takes in one parameter [title]");
						break;
					}
					//calls delete
					response = stub.dELETES(DELETE.newBuilder().setTitle(input[1]).build());
					System.out.println(response.getErrno());
					break;
				case "list":
					//checks for incorrect params
					if(input.length!=1) {
						System.out.println("Error: Incorrect number of parameters");
						System.out.println("list takes in no parameters");
						break;
					}
					//calls list
					response1 = stub.lISTS(LIST.newBuilder().build());
					String[] split = response1.getTitle().split(",");
					//Lists Posts and checks for empty response
					System.out.println("Posts");
					int i = 1;
					if(split.length==1 & split[0].isEmpty()) {
						System.out.println("There are no posts");
						break;
					}
					for(String s : split) {
						System.out.println(i + "." + s);
						i++;
					}
					break;
				default:
					if(variable.equals("Quit") ){
						stop = 1;
					}
					else {
						System.out.println("Error: Invalid Command");
						System.out.println("Valid Commands are ");
						System.out.println("1.post [title] [body]");
						System.out.println("2.get [title]");
						System.out.println("3.list");
						System.out.println("4.delete [title]");
						System.out.println("5.Quit");
					}
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
