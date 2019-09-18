package com.nengliang.web.entity;

import java.util.Date;

public class Scholastic {
    private Integer id;

    private String username;

    private Byte userage;

    private String mailbox;

    private String usergender;

    private String headportrait;

    private Date creationtime;

    private Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Byte getUserage() {
        return userage;
    }

    public void setUserage(Byte userage) {
        this.userage = userage;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    public String getUsergender() {
        return usergender;
    }

    public void setUsergender(String usergender) {
        this.usergender = usergender == null ? null : usergender.trim();
    }

    public String getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait == null ? null : headportrait.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}