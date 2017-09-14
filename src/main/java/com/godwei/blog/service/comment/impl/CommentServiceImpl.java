package com.godwei.blog.service.comment.impl;

import com.godwei.blog.mapper.comment.CommentMapper;
import com.godwei.blog.mapper.comment.CommentReplyMapper;
import com.godwei.blog.model.comment.Comment;
import com.godwei.blog.model.comment.CommentExample;
import com.godwei.blog.model.comment.CommentReply;
import com.godwei.blog.model.comment.CommentReplyExample;
import com.godwei.blog.service.comment.CommentService;
import com.godwei.blog.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private CommentReplyMapper commentReplyMapper;

    @Override
    public ActionReturnUtil addComment(Comment comment){
        try{
            commentMapper.insert(comment);
            return ActionReturnUtil.returnSuccess();
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil getCommentList(Integer articleId){
        List<Map<String,Object>> result = new ArrayList<>();
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andArticleidEqualTo(articleId);
        List<Comment> comments = new ArrayList<>();
        try {
            comments = commentMapper.selectByExample(commentExample);
            for (Comment comment : comments) {
                Map map = new HashMap();
                map.put("id", comment.getId());
                map.put("articleId", comment.getArticleid());
                map.put("name", comment.getName());
                map.put("time", comment.getTime());
                map.put("content", comment.getContent());
                map.put("email", comment.getEmail());
                List<CommentReply> commentReplies = new ArrayList<>();
                CommentReplyExample commentReplyExample = new CommentReplyExample();
                commentReplyExample.createCriteria().andCommentidEqualTo(comment.getId());
                commentReplies = commentReplyMapper.selectByExample(commentReplyExample);
                if (commentReplies != null || commentReplies.size() != 0) {
                    map.put("commentReply", commentReplies);
                }
                result.add(map);
            }
            return ActionReturnUtil.returnSuccessWithData(result);
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
}
