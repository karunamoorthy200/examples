package org.example.designpatterns.behavioural.chainofresponsibility;

import java.util.HashMap;

public class DataBase {

    HashMap<String, String> map;

    public DataBase()
    {
        map = new HashMap<>();
        map.put("karuna","karuna");
        map.put("therasa","therasa");
        map.put("kerena","kerena");
    }

    public boolean isUserExists(String userName, String password)
    {
        return map.containsKey(userName);
    }


    public boolean isUserValid(String userName, String password)
    {
        return map.get(userName).equals(password);
    }





}
