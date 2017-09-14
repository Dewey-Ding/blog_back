package com.godwei.blog.service.comment;

import com.godwei.blog.model.comment.Comment;
import com.godwei.blog.util.ActionReturnUtil;


public interface CommentService {
    ActionReturnUtil getCommentList(Integer articleId);
    ActionReturnUtil addComment(Comment comment);
}
