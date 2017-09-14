package com.godwei.blog.mapper.message;

import com.godwei.blog.model.message.MessageReply;
import com.godwei.blog.model.message.MessageReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageReplyMapper {
    int deleteByExample(MessageReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageReply record);

    int insertSelective(MessageReply record);

    List<MessageReply> selectByExample(MessageReplyExample example);

    MessageReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageReply record, @Param("example") MessageReplyExample example);

    int updateByExample(@Param("record") MessageReply record, @Param("example") MessageReplyExample example);

    int updateByPrimaryKeySelective(MessageReply record);

    int updateByPrimaryKey(MessageReply record);
}