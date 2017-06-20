package com.webservice.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


/**
 * Created by ratnesh on 20/6/17.
 */
@XmlRootElement
public class Profile {
    private long profileId;
    private String prifileName;
    private String firstName;
    private String lastName;
    private Date created;

    public Profile(){

    }
    public Profile(long profileId, String profileName, String firstName, String lastName){
        this.profileId= profileId;
        this.prifileName= prifileName;
        this.firstName=firstName;
        this.lastName=lastName;
        this.created= new Date();

    }
    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public String getPrifileName() {
        return prifileName;
    }

    public void setPrifileName(String prifileName) {
        this.prifileName = prifileName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


}
