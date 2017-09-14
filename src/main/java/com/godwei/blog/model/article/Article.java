package com.godwei.blog.model.article;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private String author;

    private Date time;

    private String essay;

    private String type;

    private String summary;

    private Integer viewcount;

    private Integer viewcounttoday;

    private Integer commentcount;

    private String candidate2;

    private String candidate3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay == null ? null : essay.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getViewcounttoday() {
        return viewcounttoday;
    }

    public void setViewcounttoday(Integer viewcounttoday) {
        this.viewcounttoday = viewcounttoday;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
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