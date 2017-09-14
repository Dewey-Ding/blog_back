package com.godwei.blog.model.message;

import java.util.Date;

public class MessageReply {
    private Integer id;

    private Integer parent;

    private String name;

    private Date time;

    private String content;

    private String towho;

    private String email;

    private String candidate3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTowho() {
        return towho;
    }

    public void setTowho(String towho) {
        this.towho = towho == null ? null : towho.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCandidate3() {
        return candidate3;
    }

    public void setCandidate3(String candidate3) {
        this.candidate3 = candidate3 == null ? null : candidate3.trim();
    }
}