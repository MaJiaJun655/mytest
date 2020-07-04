package com.accp.model;

import java.util.ArrayList;
import java.util.List;

public class ShtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShtExample() {
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

        public Criteria andShidIsNull() {
            addCriterion("shid is null");
            return (Criteria) this;
        }

        public Criteria andShidIsNotNull() {
            addCriterion("shid is not null");
            return (Criteria) this;
        }

        public Criteria andShidEqualTo(Integer value) {
            addCriterion("shid =", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidNotEqualTo(Integer value) {
            addCriterion("shid <>", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidGreaterThan(Integer value) {
            addCriterion("shid >", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shid >=", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidLessThan(Integer value) {
            addCriterion("shid <", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidLessThanOrEqualTo(Integer value) {
            addCriterion("shid <=", value, "shid");
            return (Criteria) this;
        }

        public Criteria andShidIn(List<Integer> values) {
            addCriterion("shid in", values, "shid");
            return (Criteria) this;
        }

        public Criteria andShidNotIn(List<Integer> values) {
            addCriterion("shid not in", values, "shid");
            return (Criteria) this;
        }

        public Criteria andShidBetween(Integer value1, Integer value2) {
            addCriterion("shid between", value1, value2, "shid");
            return (Criteria) this;
        }

        public Criteria andShidNotBetween(Integer value1, Integer value2) {
            addCriterion("shid not between", value1, value2, "shid");
            return (Criteria) this;
        }

        public Criteria andShlxrIsNull() {
            addCriterion("shlxr is null");
            return (Criteria) this;
        }

        public Criteria andShlxrIsNotNull() {
            addCriterion("shlxr is not null");
            return (Criteria) this;
        }

        public Criteria andShlxrEqualTo(String value) {
            addCriterion("shlxr =", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrNotEqualTo(String value) {
            addCriterion("shlxr <>", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrGreaterThan(String value) {
            addCriterion("shlxr >", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrGreaterThanOrEqualTo(String value) {
            addCriterion("shlxr >=", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrLessThan(String value) {
            addCriterion("shlxr <", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrLessThanOrEqualTo(String value) {
            addCriterion("shlxr <=", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrLike(String value) {
            addCriterion("shlxr like", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrNotLike(String value) {
            addCriterion("shlxr not like", value, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrIn(List<String> values) {
            addCriterion("shlxr in", values, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrNotIn(List<String> values) {
            addCriterion("shlxr not in", values, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrBetween(String value1, String value2) {
            addCriterion("shlxr between", value1, value2, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShlxrNotBetween(String value1, String value2) {
            addCriterion("shlxr not between", value1, value2, "shlxr");
            return (Criteria) this;
        }

        public Criteria andShcretimeIsNull() {
            addCriterion("shcretime is null");
            return (Criteria) this;
        }

        public Criteria andShcretimeIsNotNull() {
            addCriterion("shcretime is not null");
            return (Criteria) this;
        }

        public Criteria andShcretimeEqualTo(String value) {
            addCriterion("shcretime =", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeNotEqualTo(String value) {
            addCriterion("shcretime <>", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeGreaterThan(String value) {
            addCriterion("shcretime >", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeGreaterThanOrEqualTo(String value) {
            addCriterion("shcretime >=", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeLessThan(String value) {
            addCriterion("shcretime <", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeLessThanOrEqualTo(String value) {
            addCriterion("shcretime <=", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeLike(String value) {
            addCriterion("shcretime like", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeNotLike(String value) {
            addCriterion("shcretime not like", value, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeIn(List<String> values) {
            addCriterion("shcretime in", values, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeNotIn(List<String> values) {
            addCriterion("shcretime not in", values, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeBetween(String value1, String value2) {
            addCriterion("shcretime between", value1, value2, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShcretimeNotBetween(String value1, String value2) {
            addCriterion("shcretime not between", value1, value2, "shcretime");
            return (Criteria) this;
        }

        public Criteria andShphoneIsNull() {
            addCriterion("shphone is null");
            return (Criteria) this;
        }

        public Criteria andShphoneIsNotNull() {
            addCriterion("shphone is not null");
            return (Criteria) this;
        }

        public Criteria andShphoneEqualTo(String value) {
            addCriterion("shphone =", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneNotEqualTo(String value) {
            addCriterion("shphone <>", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneGreaterThan(String value) {
            addCriterion("shphone >", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneGreaterThanOrEqualTo(String value) {
            addCriterion("shphone >=", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneLessThan(String value) {
            addCriterion("shphone <", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneLessThanOrEqualTo(String value) {
            addCriterion("shphone <=", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneLike(String value) {
            addCriterion("shphone like", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneNotLike(String value) {
            addCriterion("shphone not like", value, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneIn(List<String> values) {
            addCriterion("shphone in", values, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneNotIn(List<String> values) {
            addCriterion("shphone not in", values, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneBetween(String value1, String value2) {
            addCriterion("shphone between", value1, value2, "shphone");
            return (Criteria) this;
        }

        public Criteria andShphoneNotBetween(String value1, String value2) {
            addCriterion("shphone not between", value1, value2, "shphone");
            return (Criteria) this;
        }

        public Criteria andSharessIsNull() {
            addCriterion("sharess is null");
            return (Criteria) this;
        }

        public Criteria andSharessIsNotNull() {
            addCriterion("sharess is not null");
            return (Criteria) this;
        }

        public Criteria andSharessEqualTo(String value) {
            addCriterion("sharess =", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessNotEqualTo(String value) {
            addCriterion("sharess <>", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessGreaterThan(String value) {
            addCriterion("sharess >", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessGreaterThanOrEqualTo(String value) {
            addCriterion("sharess >=", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessLessThan(String value) {
            addCriterion("sharess <", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessLessThanOrEqualTo(String value) {
            addCriterion("sharess <=", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessLike(String value) {
            addCriterion("sharess like", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessNotLike(String value) {
            addCriterion("sharess not like", value, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessIn(List<String> values) {
            addCriterion("sharess in", values, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessNotIn(List<String> values) {
            addCriterion("sharess not in", values, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessBetween(String value1, String value2) {
            addCriterion("sharess between", value1, value2, "sharess");
            return (Criteria) this;
        }

        public Criteria andSharessNotBetween(String value1, String value2) {
            addCriterion("sharess not between", value1, value2, "sharess");
            return (Criteria) this;
        }

        public Criteria andShkhidIsNull() {
            addCriterion("shkhid is null");
            return (Criteria) this;
        }

        public Criteria andShkhidIsNotNull() {
            addCriterion("shkhid is not null");
            return (Criteria) this;
        }

        public Criteria andShkhidEqualTo(Integer value) {
            addCriterion("shkhid =", value, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidNotEqualTo(Integer value) {
            addCriterion("shkhid <>", value, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidGreaterThan(Integer value) {
            addCriterion("shkhid >", value, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shkhid >=", value, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidLessThan(Integer value) {
            addCriterion("shkhid <", value, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidLessThanOrEqualTo(Integer value) {
            addCriterion("shkhid <=", value, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidIn(List<Integer> values) {
            addCriterion("shkhid in", values, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidNotIn(List<Integer> values) {
            addCriterion("shkhid not in", values, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidBetween(Integer value1, Integer value2) {
            addCriterion("shkhid between", value1, value2, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShkhidNotBetween(Integer value1, Integer value2) {
            addCriterion("shkhid not between", value1, value2, "shkhid");
            return (Criteria) this;
        }

        public Criteria andShzwdjhIsNull() {
            addCriterion("shzwdjh is null");
            return (Criteria) this;
        }

        public Criteria andShzwdjhIsNotNull() {
            addCriterion("shzwdjh is not null");
            return (Criteria) this;
        }

        public Criteria andShzwdjhEqualTo(Integer value) {
            addCriterion("shzwdjh =", value, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhNotEqualTo(Integer value) {
            addCriterion("shzwdjh <>", value, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhGreaterThan(Integer value) {
            addCriterion("shzwdjh >", value, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhGreaterThanOrEqualTo(Integer value) {
            addCriterion("shzwdjh >=", value, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhLessThan(Integer value) {
            addCriterion("shzwdjh <", value, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhLessThanOrEqualTo(Integer value) {
            addCriterion("shzwdjh <=", value, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhIn(List<Integer> values) {
            addCriterion("shzwdjh in", values, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhNotIn(List<Integer> values) {
            addCriterion("shzwdjh not in", values, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhBetween(Integer value1, Integer value2) {
            addCriterion("shzwdjh between", value1, value2, "shzwdjh");
            return (Criteria) this;
        }

        public Criteria andShzwdjhNotBetween(Integer value1, Integer value2) {
            addCriterion("shzwdjh not between", value1, value2, "shzwdjh");
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