package com.godwei.blog.controller.article;

import com.godwei.blog.service.article.ArticleService;
import com.godwei.blog.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    /**
     *查询所有的博文
     */
    @RequestMapping(value = "/aritcleList",method = RequestMethod.GET)
    public ActionReturnUtil articleList() throws Exception{
        return articleService.getAllArticles();
    }
    /**
     *查询文章分类以及各类别文章数目
     */
    @RequestMapping(value = "/articleType",method = RequestMethod.GET)
    public ActionReturnUtil atricleTypeCount() throws Exception{
        return articleService.articleTypeCount();
    }
    /**
     *查询热门博文排行
     */
    @RequestMapping(value = "/hotArticleList",method = RequestMethod.GET)
    public ActionReturnUtil hotArticleList() throws Exception{
        return articleService.getHotArticleList();
    }
    /**
     *查询最新博文排行排行
     */
    @RequestMapping(value = "/latelyArticleList",method = RequestMethod.GET)
    public ActionReturnUtil latelyArticleList() throws Exception{
        return articleService.getLatelyArticleList();
    }
    /**
     *查询完整博文
     * @param id
     */
    @RequestMapping(value = "/completeArticle",method = RequestMethod.GET)
    public ActionReturnUtil completeArticle(@Param(value = "id") final Integer id) throws Exception{
        return articleService.getCompleteArticle(id);
    }
    /**
     *查询某一类型的所有博文
     * @param type
     */
    @RequestMapping(value = "/articleListByType",method = RequestMethod.GET)
    public ActionReturnUtil articleListByType(@Param(value = "type")final String type) throws  Exception{
        return articleService.getArticleListByType(type);
    }
}
