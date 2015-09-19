package com.yash.models;

import com.yash.models.RelLink.RelLink;
import org.glassfish.jersey.server.JSONP;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yash on 8/15/2015.
 */

@XmlRootElement
public class Message {

    int id;
    String author;
    String message;
    List<RelLink> links = new ArrayList<RelLink>();

    public Message() {
    }

    public Message(int id, String author, String message) {
        this.id = id;
        this.author = author;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<RelLink> getLinks() {
        return links;
    }

    public void setLinks(List<RelLink> links) {
        this.links = links;
    }

    public void addLinks(String rel,String uri){
        RelLink relLink = new RelLink();
        relLink.setRel(rel);
        relLink.setLink(uri);
        links.add(relLink);
    }
}
