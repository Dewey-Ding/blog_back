package com.godwei.blog.controller.comment;

import com.godwei.blog.model.comment.CommentReply;
import com.godwei.blog.service.comment.CommentReplyService;
import com.godwei.blog.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/CommentReply")
public class CommentReplyController {
    @Autowired
    private CommentReplyService commentReplyService;
    /**
     * 添加评论回复，二级
     * @param commentReply
     */
    @RequestMapping(value = "/addCommentReply",method = RequestMethod.POST)
    public ActionReturnUtil addCommentReply(CommentReply commentReply){
        return commentReplyService.addCommentReply(commentReply);
    }
}
