package com.bulletinboard;
import java.io.IOException;
import java.net.Socket;
public class BulletinBoardClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String hostname = args[0];
		int portNumber = Integer.parseInt(args[1]);
		Socket conn = new Socket(hostname,portNumber);

	}

	public void error(String errno)
	{
		System.out.println(errno);
	}

	public void print(String title, String message){
		System.out.println(title + " : "+ message);
	}

}
