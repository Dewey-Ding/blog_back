package com.godwei.blog.service.article.impl;

import com.godwei.blog.mapper.article.ArticleMapper;
import com.godwei.blog.model.article.Article;
import com.godwei.blog.model.article.ArticleExample;
import com.godwei.blog.service.article.ArticleService;
import com.godwei.blog.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    public ArticleMapper articleMapper;

    @Override
    public ActionReturnUtil getArticleListByType(String type){
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andTypeEqualTo(type);
        List<Article> list = new ArrayList<>();
        try {
            list = articleMapper.selectByExample(articleExample);
            return ActionReturnUtil.returnSuccessWithData(list);
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil getCompleteArticle(Integer id){
        try {
            Article article = articleMapper.selectByPrimaryKey(id);
            return ActionReturnUtil.returnSuccessWithData(article);
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil getAllArticles(){
        List<Article> data = new ArrayList<>();
        try {
            data = articleMapper.articleList();
            return ActionReturnUtil.returnErrorWithData(data);
        }catch(Exception e){
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil getHotArticleList(){
        List<Article> list = new ArrayList<Article>();
        try {
            list = articleMapper.selectHotArticleList();
            return ActionReturnUtil.returnSuccessWithData(list);
        }catch(Exception e){
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil getLatelyArticleList(){
        List<Article> list = new ArrayList<>();
        try {
            list = articleMapper.selectLatelyArticleList();
            return ActionReturnUtil.returnSuccessWithData(list);
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil articleTypeCount(){
        List<Map<String,Integer>> ArticleType = new ArrayList<>();
        try {
            List<String> list = this.getTypeList();
            for (int i = 0; i < list.size(); i++) {
                Map<String, Integer> map = new HashMap<>();
                Integer count = (Integer) this.getTypeCount(list.get(i));
                map.put(list.get(i), count);
                ArticleType.add(map);
            }
            return ActionReturnUtil.returnErrorWithData(ArticleType);
        }catch (Exception e){
            return ActionReturnUtil.returnError();
        }
    }

    private List<String> getTypeList(){
        List<String> typeList = new ArrayList<>();
        typeList=articleMapper.selectTypeList();
        return typeList;
    }
    private Integer getTypeCount(String type){
        return articleMapper.selectTypeCount(type);
    }
}
