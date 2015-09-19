package com.yash.database.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Yash on 9/6/2015.
 */

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
    @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String uname;
    /*@Embedded
    private Address address;
    */
    /*@ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name ="USER_ADDRESS",
            joinColumns = @JoinColumn(name = "USER_ID")
    )
    private Collection<Address> addresses = new ArrayList<>();

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }*/

    /*@OneToMany//(mappedBy = "user")
    private Collection<Vehicle> vehicles = new ArrayList<>();

    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }*/

    /*public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/

    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "USER_NAME")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
