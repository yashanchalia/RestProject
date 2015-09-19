package com.yash.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Yash on 8/16/2015.
 */
@Path("/")
/*@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)*/
public class CommentResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test(){
        return "TEst";
    }

    @GET
    @Path("/{commentId}")
    public String getComments(@PathParam("commentId") String commentId, @PathParam("messageId") String messageId){
        return "getting all comments ...!! commentId : "+commentId +" | messageId "+messageId;
    }
}
