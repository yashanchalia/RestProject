package com.yash.service;

import com.yash.database.Databasestub;
import com.yash.models.Profile;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Yash on 8/16/2015.
 */
public class ProfileService {

    private HashMap<String,Profile> profiles = Databasestub.getProfiles();

    public ProfileService() {
        profiles.put("Yash",new Profile(1,"Yash","Yash","Anchalia"));
    }

    public List<Profile> getAllProfiles(){
        return new ArrayList<>(profiles.values());
    }

    public Profile getProfile(String name){
        return profiles.get(name);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size() + 1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile updateProfile(Profile profile){
        if(profiles.size() <=0){
            return null;
        }
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile removeProfile(String name){
        return profiles.remove(name);
    }



}
