package com.bulletinboard;
import java.util.HashMap;
import java.util.Map;

public class BulletinBoardServer {
    Map<String,String> Board = new HashMap<String, String>();

	public void PUT(String title , String body){
            Board.put(title,body);
            //call ack
    }

    public void  GET(String title){
        if(Board.containsKey(title)){
            //call printBoard.get(title);
        }
        else {

            // call errrno "There is no posting named ";
        }
    }

    public void DELETE(String title){
       if(Board.containsKey(title)){
           Board.remove(title);
           //call ack
       }
       //call errno
    }

    public void LIST(){
        for (String S:Board.keySet()) {
            //call print(S+" : "+Board.get(S));
        }
    }

    public static void main(String[] args) {

    }
}
