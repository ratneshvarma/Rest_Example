package com.webservice.database;

import com.webservice.model.Message;
import com.webservice.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ratnesh on 20/6/17.
 */
public class Database {
    private static Map<Long, Message> messases= new HashMap();
    private static Map<Long, Profile> profiles= new HashMap();

    public static Map<Long, Message> getMessages(){
         return messases;
     }
    public static Map<Long, Profile> getProfiles(){
        return profiles;
    }
}
