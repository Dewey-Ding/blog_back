package com.godwei.blog.service.comment.impl;

import com.godwei.blog.mapper.comment.CommentReplyMapper;
import com.godwei.blog.model.comment.CommentReply;
import com.godwei.blog.service.comment.CommentReplyService;
import com.godwei.blog.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommentReplyServiceImpl implements CommentReplyService{
    @Autowired
    private CommentReplyMapper commentReplyMapper;
    @Override
    public ActionReturnUtil addCommentReply(CommentReply commentReply) {
        try{
            commentReplyMapper.insertSelective(commentReply);
            return ActionReturnUtil.returnSuccess();
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
}
