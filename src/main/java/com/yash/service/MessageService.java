package com.yash.service;

import com.yash.database.Databasestub;
import com.yash.exception.DataNotFoundException;
import com.yash.models.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yash on 8/16/2015.
 */
public class MessageService {

    private HashMap<Integer,Message> messages = Databasestub.getMessages();

    public MessageService() {
        messages.put(1,new Message(1,"Yash1","Hello yash1!!"));
        messages.put(2,new Message(2,"Yash2","Hello yash2!!"));
        messages.put(3,new Message(3,"Yash3","Hello yash3!!"));
        messages.put(4,new Message(4,"Yash4","Hello yash4!!"));
        messages.put(5,new Message(5,"Yash5","Hello yash5!!"));
        messages.put(6,new Message(6,"Yash6","Hello yash6!!"));
    }

    public List<Message> getMessagePaginated(int start,int size){
        ArrayList<Message> paginatedMessages = new ArrayList<Message>(messages.values());
        return paginatedMessages.subList(start,start+size-1);
    }

    public List<Message> getAllMessages(){
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(int id){
        Message message = messages.get(id);
        if(message == null){
            throw new DataNotFoundException("Message with id " + id + " not found");
        }

        return message;
    }

    public Message addMessage(Message message){
        int id = messages.size() + 1;
        message.setId(id);
        messages.put(id,message);
        return message;
    }

    public Message updateMessage(Message message){
        if(message.getId() <=0)
            return null;
        messages.put(message.getId(),message);
        return message;
    }

    public Message removeMessage(int id){
        return messages.remove(id);
    }

}
