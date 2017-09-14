package com.godwei.blog.service.article;

import com.godwei.blog.util.ActionReturnUtil;

public interface ArticleService {
    ActionReturnUtil getAllArticles();
    ActionReturnUtil articleTypeCount();
    ActionReturnUtil getHotArticleList();
    ActionReturnUtil getLatelyArticleList();
    ActionReturnUtil getCompleteArticle(Integer id);
    ActionReturnUtil getArticleListByType(String type);
}
