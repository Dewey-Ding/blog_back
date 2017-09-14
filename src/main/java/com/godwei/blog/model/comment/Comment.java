package com.godwei.blog.model.comment;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer articleid;

    private String name;

    private Date time;

    private String content;

    private String email;

    private String candidate2;

    private String candidate3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCandidate2() {
        return candidate2;
    }

    public void setCandidate2(String candidate2) {
        this.candidate2 = candidate2 == null ? null : candidate2.trim();
    }

    public String getCandidate3() {
        return candidate3;
    }

    public void setCandidate3(String candidate3) {
        this.candidate3 = candidate3 == null ? null : candidate3.trim();
    }
}