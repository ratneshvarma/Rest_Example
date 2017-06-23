package com.webservice.resource;

import com.webservice.model.ErrorMessage;
import com.webservice.model.Profile;
import com.webservice.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by ratnesh on 20/6/17.
 */
@Path("/profiles")
@Consumes( value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces( value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ProfileResource {
    private ProfileService profileService = new ProfileService();


    @GET
    public List<Profile> getAllProfile() {
        return profileService.getAllProfiles();
    }

    @GET
    @Path("/{profileName}")
    public Profile getProfile(@PathParam("profileName") String profileName){
             return profileService.getProfile(profileName);
    }

    @POST
    public Profile addProfile(Profile profile) {
          return profileService.addProfile(profile);
    }

    @PUT
    @Path("/{profileName}")
    public Profile updateMessage(@PathParam("profileName") String profileName, Profile profile){
             profile.setProfileName(profileName);
        return profileService.updateProfile(profile);
    }

    @DELETE
    @Path("/{profileName}")
    public Profile deleteProfile(@PathParam("profileName") String profileName){
        return profileService.removeProfile(profileName);
    }

}
