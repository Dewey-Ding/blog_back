package com.godwei.blog.service.message;

import com.godwei.blog.model.message.Message;
import com.godwei.blog.util.ActionReturnUtil;

public interface MessageService {
    ActionReturnUtil getMessageList();
    ActionReturnUtil addMessage(Message message);
}
