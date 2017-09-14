package com.godwei.blog.controller.message;

import com.godwei.blog.model.message.Message;
import com.godwei.blog.service.message.MessageService;
import com.godwei.blog.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    /**
     * 查询所有留言
     */
    @RequestMapping(value = "/messageList",method = RequestMethod.GET)
    public ActionReturnUtil messageList() throws Exception{
        return messageService.getMessageList();
    }
    /**
     * 添加留言
     * @param message
     */
    @RequestMapping(value = "/addMessage",method = RequestMethod.POST)
    public ActionReturnUtil addMessage(@Param(value = "message")final Message message) throws Exception{
        return messageService.addMessage(message);
    }
}
