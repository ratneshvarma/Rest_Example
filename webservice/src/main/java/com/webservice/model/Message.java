package com.webservice.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by ratnesh on 18/6/17.
 */

@XmlRootElement
public class Message {
    private long messageId;
    private String message;
    private Date created;
    private String author;

    public Message(){

    }
    public Message(long messageId, String message,String author){
        this.messageId=messageId;
        this.message=message;
        this.author=author;
        this.created= new Date();

    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
