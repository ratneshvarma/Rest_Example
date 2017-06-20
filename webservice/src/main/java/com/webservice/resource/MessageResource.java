package com.webservice.resource;

import com.webservice.service.MessageService;
import com.webservice.model.Message;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by ratnesh on 18/6/17.
 */

@Path("/messages")
public class MessageResource {
    MessageService messageService = new MessageService();

    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    @Produces(MediaType.APPLICATION_JSON)
    @Produces( value={
            MediaType.APPLICATION_XML,
            MediaType.APPLICATION_JSON,
            MediaType.TEXT_PLAIN
    })

    public List<Message> getAllMessages(@QueryParam("year") int year) {
        if(year>0) {
            System.out.println("year: "+year);
            return  messageService.getAllMessageOfYear(year);
        }
        return messageService.getAllMessages();
    }

    @GET
    @Consumes( value={
            MediaType.APPLICATION_XML,
            MediaType.APPLICATION_JSON,
            MediaType.TEXT_PLAIN
    })
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") long messageId){
        return messageService.getMessage(messageId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces( value={
            MediaType.APPLICATION_XML,
            MediaType.APPLICATION_JSON,
            MediaType.TEXT_PLAIN
    })
  public Message addMessage(Message message) {
        System.out.println("Message: "+ message.getMessage());
        return messageService.addMessage(message);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    @Produces( value={
            MediaType.APPLICATION_XML,
            MediaType.APPLICATION_JSON,
            MediaType.TEXT_PLAIN
    })
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") long messageId, Message message){
        System.out.println("Message: "+ message.getMessage());
        message.setMessageId(messageId);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{messageId}")
    public Message removeMessage(@PathParam("messageId") long messageId){
        return messageService.removeMessage(messageId);
    }

    //////bellow are sample sub param example
    @GET
    @Path("/{messageId}")
    @Produces( value={
                        MediaType.APPLICATION_XML,
                        MediaType.APPLICATION_JSON,
                        MediaType.TEXT_PLAIN
            })
    public String params(@PathParam("messageId") long id){

        return "Path param: "+ id;
    }

    @GET
    @Path("/{messageId}/{messageName}")
    @Produces( value={
            MediaType.APPLICATION_XML,
            MediaType.APPLICATION_JSON,
            MediaType.TEXT_PLAIN
    })
    public String subParams(@PathParam("messageId") long id, @PathParam("messageName") String message){

        return "Path param: "+ id + " Sub param message: "+ message;
    }
}
