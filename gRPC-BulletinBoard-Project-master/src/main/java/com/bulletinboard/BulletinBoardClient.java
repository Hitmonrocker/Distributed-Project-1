package com.bulletinboard;
import java.util.HashMap;
public class BulletinBoardClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void ack(String ack)
	{
		System.out.println(ack);
	}
	public void error(String errno)
	{
		System.out.println(errno);
	}
	public void print(String title, String message){
		System.out.println(title + " : "+ message);
	}

}
