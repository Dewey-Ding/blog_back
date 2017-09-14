package com.godwei.blog.service.message.impl;

import com.godwei.blog.mapper.message.MessageMapper;
import com.godwei.blog.model.message.Message;
import com.godwei.blog.service.message.MessageService;
import com.godwei.blog.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public ActionReturnUtil getMessageList(){
        List<Message> list = new ArrayList<>();
        try {
            list = messageMapper.selectMessageList();
            return ActionReturnUtil.returnSuccessWithData(list);
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }

    @Override
    public ActionReturnUtil addMessage(Message message){
        try{
            messageMapper.insert(message);
            return ActionReturnUtil.returnSuccess();
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
}
