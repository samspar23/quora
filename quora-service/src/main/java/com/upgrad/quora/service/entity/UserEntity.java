package com.upgrad.quora.service.entity;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "users")
@NamedQueries(
        {
                @NamedQuery(name = "userByUuid", query = "select u from UserEntity u where u.uuid = :uuid"),
                @NamedQuery(name = "deleteByUuid", query = "delete from UserEntity u where u.uuid = :uuid")
        }
)
public class UserEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UUID")
    @Size(max = 64)
    private String uuid;

    @Column(name = "FIRSTNAME")
    @NotNull
    @Size(max = 200)
    private String firstName;

    @Column(name = "LASTNAME")
    @NotNull
    @Size(max = 200)
    private String lastName;

    @Column(name = "USERNAME")
    @NotNull
    @Size(max = 200)
    private String userName;

    @Column(name = "EMAIL")
    @NotNull
    @Size(max = 200)
    private String emailAddress;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ABOUTME")
    private String aboutMe;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "CONTACTNUMBER")
    private String contactNumber;

    @Column(name = "SALT")
    @NotNull
    @Size(max = 200)
    //@ToStringExclude
    private String salt;

    @Column(name = "ROLE")
    private String role;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this).hashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }



}
