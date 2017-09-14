package com.godwei.blog.controller.message;

import com.godwei.blog.model.message.MessageReply;
import com.godwei.blog.service.message.MessageReplyService;
import com.godwei.blog.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messageReply")
public class MessageReplyController {
    @Autowired
    private MessageReplyService messageReplyService;

    /*
    *插入评论回复
    * @param messageReply
     */
    @RequestMapping(value = "messageReply",method = RequestMethod.POST)
    public ActionReturnUtil addMessageReply(@Param(value = "messageReply")final MessageReply messageReply){
        return messageReplyService.addMessageReply(messageReply);
    }
}
