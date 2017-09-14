package com.godwei.blog.controller.comment;

import com.godwei.blog.model.comment.Comment;
import com.godwei.blog.service.comment.CommentService;
import com.godwei.blog.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    public CommentService commentService;

    /**
     * 根据文章ID查询评论List
     */
    @RequestMapping(value = "/commentList",method = RequestMethod.GET)
    public ActionReturnUtil getCommentList(@Param(value = "articleId")final Integer articleId) throws Exception{
        return commentService.getCommentList(articleId);
    }
    /**
     * 添加评论
     */
    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    public ActionReturnUtil addComment(Comment comment) throws Exception{
        return commentService.addComment(comment);
    }
}
