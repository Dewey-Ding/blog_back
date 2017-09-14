package com.godwei.blog.mapper.article;

import com.godwei.blog.model.article.Article;
import com.godwei.blog.model.article.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper {
    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    List<Article> articleList();

    List<String> selectTypeList();

    Integer selectTypeCount(String type);

    List<Article> selectHotArticleList();

    List<Article> selectLatelyArticleList();

    Article selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}