package com.bulletinboard;
import java.util.HashMap;
import java.util.Map;

public class BulletinBoardServer {
    Map<String,String> Board = new HashMap<String, String>();

	public void PUT(String title , String body){
            Board.put(title,body);
    }

    public String GET(String title){
        if(Board.containsKey(title)){
            return Board.get(title);
        }
        else {
            return "There is no posting named " + title;
        }
    }

    public void DELETE(String title){
       if(Board.containsKey(title)){
           Board.remove(title);
       }

    }

    public Map<String,String> LIST(String title , String body){
       return Board;
    }

    public static void main(String[] args) {

    }
}
