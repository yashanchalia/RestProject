package com.yash.models;

/**
 * Created by Yash on 8/16/2015.
 */
public class Profile {
    int id;
    String profileName;
    String fname;
    String lname;

    public Profile() {
    }

    public Profile(int id, String profileName, String fname, String lname) {
        this.id = id;
        this.profileName = profileName;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
