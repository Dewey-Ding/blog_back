package com.godwei.blog.service.message;

import com.godwei.blog.model.message.MessageReply;
import com.godwei.blog.util.ActionReturnUtil;

public interface MessageReplyService {
    ActionReturnUtil addMessageReply(MessageReply messageReply);
}
