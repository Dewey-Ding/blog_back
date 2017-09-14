package com.godwei.blog.model.article;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andEssayIsNull() {
            addCriterion("essay is null");
            return (Criteria) this;
        }

        public Criteria andEssayIsNotNull() {
            addCriterion("essay is not null");
            return (Criteria) this;
        }

        public Criteria andEssayEqualTo(String value) {
            addCriterion("essay =", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayNotEqualTo(String value) {
            addCriterion("essay <>", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayGreaterThan(String value) {
            addCriterion("essay >", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayGreaterThanOrEqualTo(String value) {
            addCriterion("essay >=", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayLessThan(String value) {
            addCriterion("essay <", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayLessThanOrEqualTo(String value) {
            addCriterion("essay <=", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayLike(String value) {
            addCriterion("essay like", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayNotLike(String value) {
            addCriterion("essay not like", value, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayIn(List<String> values) {
            addCriterion("essay in", values, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayNotIn(List<String> values) {
            addCriterion("essay not in", values, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayBetween(String value1, String value2) {
            addCriterion("essay between", value1, value2, "essay");
            return (Criteria) this;
        }

        public Criteria andEssayNotBetween(String value1, String value2) {
            addCriterion("essay not between", value1, value2, "essay");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNull() {
            addCriterion("viewcount is null");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNotNull() {
            addCriterion("viewcount is not null");
            return (Criteria) this;
        }

        public Criteria andViewcountEqualTo(Integer value) {
            addCriterion("viewcount =", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotEqualTo(Integer value) {
            addCriterion("viewcount <>", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThan(Integer value) {
            addCriterion("viewcount >", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewcount >=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThan(Integer value) {
            addCriterion("viewcount <", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("viewcount <=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountIn(List<Integer> values) {
            addCriterion("viewcount in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotIn(List<Integer> values) {
            addCriterion("viewcount not in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountBetween(Integer value1, Integer value2) {
            addCriterion("viewcount between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewcount not between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayIsNull() {
            addCriterion("viewcounttoday is null");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayIsNotNull() {
            addCriterion("viewcounttoday is not null");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayEqualTo(Integer value) {
            addCriterion("viewcounttoday =", value, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayNotEqualTo(Integer value) {
            addCriterion("viewcounttoday <>", value, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayGreaterThan(Integer value) {
            addCriterion("viewcounttoday >", value, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewcounttoday >=", value, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayLessThan(Integer value) {
            addCriterion("viewcounttoday <", value, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayLessThanOrEqualTo(Integer value) {
            addCriterion("viewcounttoday <=", value, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayIn(List<Integer> values) {
            addCriterion("viewcounttoday in", values, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayNotIn(List<Integer> values) {
            addCriterion("viewcounttoday not in", values, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayBetween(Integer value1, Integer value2) {
            addCriterion("viewcounttoday between", value1, value2, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andViewcounttodayNotBetween(Integer value1, Integer value2) {
            addCriterion("viewcounttoday not between", value1, value2, "viewcounttoday");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNull() {
            addCriterion("commentcount is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNotNull() {
            addCriterion("commentcount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountEqualTo(Integer value) {
            addCriterion("commentcount =", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotEqualTo(Integer value) {
            addCriterion("commentcount <>", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThan(Integer value) {
            addCriterion("commentcount >", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentcount >=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThan(Integer value) {
            addCriterion("commentcount <", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
            addCriterion("commentcount <=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIn(List<Integer> values) {
            addCriterion("commentcount in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotIn(List<Integer> values) {
            addCriterion("commentcount not in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountBetween(Integer value1, Integer value2) {
            addCriterion("commentcount between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentcount not between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCandidate2IsNull() {
            addCriterion("candidate2 is null");
            return (Criteria) this;
        }

        public Criteria andCandidate2IsNotNull() {
            addCriterion("candidate2 is not null");
            return (Criteria) this;
        }

        public Criteria andCandidate2EqualTo(String value) {
            addCriterion("candidate2 =", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2NotEqualTo(String value) {
            addCriterion("candidate2 <>", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2GreaterThan(String value) {
            addCriterion("candidate2 >", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2GreaterThanOrEqualTo(String value) {
            addCriterion("candidate2 >=", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2LessThan(String value) {
            addCriterion("candidate2 <", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2LessThanOrEqualTo(String value) {
            addCriterion("candidate2 <=", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2Like(String value) {
            addCriterion("candidate2 like", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2NotLike(String value) {
            addCriterion("candidate2 not like", value, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2In(List<String> values) {
            addCriterion("candidate2 in", values, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2NotIn(List<String> values) {
            addCriterion("candidate2 not in", values, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2Between(String value1, String value2) {
            addCriterion("candidate2 between", value1, value2, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate2NotBetween(String value1, String value2) {
            addCriterion("candidate2 not between", value1, value2, "candidate2");
            return (Criteria) this;
        }

        public Criteria andCandidate3IsNull() {
            addCriterion("candidate3 is null");
            return (Criteria) this;
        }

        public Criteria andCandidate3IsNotNull() {
            addCriterion("candidate3 is not null");
            return (Criteria) this;
        }

        public Criteria andCandidate3EqualTo(String value) {
            addCriterion("candidate3 =", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3NotEqualTo(String value) {
            addCriterion("candidate3 <>", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3GreaterThan(String value) {
            addCriterion("candidate3 >", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3GreaterThanOrEqualTo(String value) {
            addCriterion("candidate3 >=", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3LessThan(String value) {
            addCriterion("candidate3 <", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3LessThanOrEqualTo(String value) {
            addCriterion("candidate3 <=", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3Like(String value) {
            addCriterion("candidate3 like", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3NotLike(String value) {
            addCriterion("candidate3 not like", value, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3In(List<String> values) {
            addCriterion("candidate3 in", values, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3NotIn(List<String> values) {
            addCriterion("candidate3 not in", values, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3Between(String value1, String value2) {
            addCriterion("candidate3 between", value1, value2, "candidate3");
            return (Criteria) this;
        }

        public Criteria andCandidate3NotBetween(String value1, String value2) {
            addCriterion("candidate3 not between", value1, value2, "candidate3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}