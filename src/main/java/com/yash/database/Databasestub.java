package com.yash.database;

import com.yash.models.Message;
import com.yash.models.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yash on 8/16/2015.
 */
public class Databasestub {

    private static HashMap<Integer,Message> messages = new HashMap<>();
    private static HashMap<String,Profile> profiles = new HashMap<>();

    public static HashMap<Integer,Message> getMessages(){
        return messages;
    }

    public static HashMap<String,Profile> getProfiles(){
        return profiles;
    }

}
