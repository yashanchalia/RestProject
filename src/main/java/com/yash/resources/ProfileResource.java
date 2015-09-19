package com.yash.resources;

import com.yash.models.Profile;
import com.yash.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Yash on 8/16/2015.
 */

@Path("/profiles")
public class ProfileResource {

    ProfileService profileService = new ProfileService();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Profile> getallProfile(){
        return profileService.getAllProfiles();
    }

    @GET
    @Path("/{profileName}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile getProfile(@PathParam("profileName") String name){
        return profileService.getProfile(name);
    }

    @DELETE
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Profile removeProfile(@PathParam("profileName")String name){
        return profileService.removeProfile(name);
    }

    @PUT
    @Path("/{profileName}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile updateProfile(@PathParam("profileName") String name, Profile profile){
        profile.setProfileName(name);
        return profileService.updateProfile(profile);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile addProfile(Profile profile){
        return profileService.addProfile(profile);
    }
}
