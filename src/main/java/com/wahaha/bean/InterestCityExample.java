package com.wahaha.bean;

import java.util.ArrayList;
import java.util.List;

public class InterestCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterestCityExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCity1IsNull() {
            addCriterion("city1 is null");
            return (Criteria) this;
        }

        public Criteria andCity1IsNotNull() {
            addCriterion("city1 is not null");
            return (Criteria) this;
        }

        public Criteria andCity1EqualTo(String value) {
            addCriterion("city1 =", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotEqualTo(String value) {
            addCriterion("city1 <>", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1GreaterThan(String value) {
            addCriterion("city1 >", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1GreaterThanOrEqualTo(String value) {
            addCriterion("city1 >=", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1LessThan(String value) {
            addCriterion("city1 <", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1LessThanOrEqualTo(String value) {
            addCriterion("city1 <=", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1Like(String value) {
            addCriterion("city1 like", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotLike(String value) {
            addCriterion("city1 not like", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1In(List<String> values) {
            addCriterion("city1 in", values, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotIn(List<String> values) {
            addCriterion("city1 not in", values, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1Between(String value1, String value2) {
            addCriterion("city1 between", value1, value2, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotBetween(String value1, String value2) {
            addCriterion("city1 not between", value1, value2, "city1");
            return (Criteria) this;
        }

        public Criteria andCity2IsNull() {
            addCriterion("city2 is null");
            return (Criteria) this;
        }

        public Criteria andCity2IsNotNull() {
            addCriterion("city2 is not null");
            return (Criteria) this;
        }

        public Criteria andCity2EqualTo(String value) {
            addCriterion("city2 =", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotEqualTo(String value) {
            addCriterion("city2 <>", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2GreaterThan(String value) {
            addCriterion("city2 >", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2GreaterThanOrEqualTo(String value) {
            addCriterion("city2 >=", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2LessThan(String value) {
            addCriterion("city2 <", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2LessThanOrEqualTo(String value) {
            addCriterion("city2 <=", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2Like(String value) {
            addCriterion("city2 like", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotLike(String value) {
            addCriterion("city2 not like", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2In(List<String> values) {
            addCriterion("city2 in", values, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotIn(List<String> values) {
            addCriterion("city2 not in", values, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2Between(String value1, String value2) {
            addCriterion("city2 between", value1, value2, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotBetween(String value1, String value2) {
            addCriterion("city2 not between", value1, value2, "city2");
            return (Criteria) this;
        }

        public Criteria andCity3IsNull() {
            addCriterion("city3 is null");
            return (Criteria) this;
        }

        public Criteria andCity3IsNotNull() {
            addCriterion("city3 is not null");
            return (Criteria) this;
        }

        public Criteria andCity3EqualTo(String value) {
            addCriterion("city3 =", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3NotEqualTo(String value) {
            addCriterion("city3 <>", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3GreaterThan(String value) {
            addCriterion("city3 >", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3GreaterThanOrEqualTo(String value) {
            addCriterion("city3 >=", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3LessThan(String value) {
            addCriterion("city3 <", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3LessThanOrEqualTo(String value) {
            addCriterion("city3 <=", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3Like(String value) {
            addCriterion("city3 like", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3NotLike(String value) {
            addCriterion("city3 not like", value, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3In(List<String> values) {
            addCriterion("city3 in", values, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3NotIn(List<String> values) {
            addCriterion("city3 not in", values, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3Between(String value1, String value2) {
            addCriterion("city3 between", value1, value2, "city3");
            return (Criteria) this;
        }

        public Criteria andCity3NotBetween(String value1, String value2) {
            addCriterion("city3 not between", value1, value2, "city3");
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