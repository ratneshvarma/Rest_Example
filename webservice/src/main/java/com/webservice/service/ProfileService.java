package com.webservice.service;

import com.webservice.database.Database;
import com.webservice.model.Message;
import com.webservice.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ratnesh on 20/6/17.
 */
public class ProfileService {

    private static Map<String, Profile> profiles = Database.getProfiles();
    public ProfileService() {
        profiles.put("java", new Profile(1L, "java", "Ratnesh", "Varma"));
        profiles.put("php",  new Profile(2L, "php", "Jai", "Singh"));
    }

    public List<Profile> getAllProfiles() {
        return  new ArrayList<Profile>(profiles.values());
    }
    public Profile getProfile(String profileName){
        return profiles.get(profileName);
    }
    public Profile addProfile(Profile profile){
        profile.setProfileId(profiles.size()+1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }
    public Profile updateProfile(Profile profile){
        if(profile.getProfileName().isEmpty())
            return null;
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }
    public Profile removeProfile(String profileName){
        return profiles.remove(profileName);

    }

}
