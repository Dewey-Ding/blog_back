package com.godwei.blog.service.comment;

import com.godwei.blog.model.comment.CommentReply;
import com.godwei.blog.util.ActionReturnUtil;

import java.util.Map;

public interface CommentReplyService {
    ActionReturnUtil addCommentReply(CommentReply commentReply);
}
