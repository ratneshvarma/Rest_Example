package com.webservice.service;

import com.webservice.database.Database;
import com.webservice.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by ratnesh on 18/6/17.
 */
public class MessageService {
    private static Map<Long, Message> messages = Database.getMessages();

    public MessageService(){
        messages.put(1L, new Message(1L,"This is 1st message","Ratnesh"));
        messages.put(2L, new Message(2L,"This is 2nd message","Kumar"));
        messages.put(3L, new Message(3L,"This is 3rd message","Jaideep"));
    }

    public List<Message> getAllMessages() {
        return  new ArrayList<Message>(messages.values());
    }

    public Message getMessage(long messageId){
        return messages.get(messageId);
    }
    public Message addMessage(Message message){
        message.setMessageId(messages.size()+1);
        messages.put(message.getMessageId(),message);
        return message;
    }
    public Message updateMessage(Message message){
        if(message.getMessageId()<=0)
            return null;
        messages.put(message.getMessageId(),message);
        return message;
    }

    public Message removeMessage(long messageId){
        return messages.remove(messageId);

    }

}
