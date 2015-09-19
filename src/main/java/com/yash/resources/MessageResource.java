package com.yash.resources;

import com.yash.models.Message;
import com.yash.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * Created by Yash on 8/15/2015.
 */

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    public List<Message> getAllMessages(@QueryParam("start") int start,@QueryParam("size") int size){
        if(start > 0 && size > 0){
            return messageService.getMessagePaginated(start,size);
        }
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") int id, @Context UriInfo uriInfo){
        Message message = messageService.getMessage(id);
        String selfUrl = getSelfUri(uriInfo, message);
        message.addLinks("self",selfUrl);
        return message;
    }

    private String getSelfUri(@Context UriInfo uriInfo, Message message) {
        return uriInfo.getBaseUriBuilder()
                    .path(MessageResource.class)
                    .path(String.valueOf(message.getId()))
                    .build()
                    .toString();
    }

    @POST
    public Message addNewMessage(Message message){
        return messageService.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") int id,Message message){
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    public Message removeMessage(@PathParam("messageId") int id){
        return messageService.removeMessage(id);
    }


    @Path("/{messageId}/comments")
    public CommentResource getCommentResource() {
        return new CommentResource();
    }
}
