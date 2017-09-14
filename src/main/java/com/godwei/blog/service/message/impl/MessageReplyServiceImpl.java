package com.godwei.blog.service.message.impl;

import com.godwei.blog.mapper.message.MessageReplyMapper;
import com.godwei.blog.model.message.MessageReply;
import com.godwei.blog.service.message.MessageReplyService;
import com.godwei.blog.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageReplyServiceImpl implements MessageReplyService {
    @Autowired
    private MessageReplyMapper messageReplyMapper;

    @Override
    public ActionReturnUtil addMessageReply(MessageReply messageReply){
        try{
            messageReplyMapper.insert(messageReply);
            return ActionReturnUtil.returnSuccess();
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
}
