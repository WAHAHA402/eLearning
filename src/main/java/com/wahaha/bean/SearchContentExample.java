package com.wahaha.bean;

import java.util.ArrayList;
import java.util.List;

public class SearchContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SearchContentExample() {
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

        public Criteria andFrontendfoundationIsNull() {
            addCriterion("frontEndFoundation is null");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationIsNotNull() {
            addCriterion("frontEndFoundation is not null");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationEqualTo(Integer value) {
            addCriterion("frontEndFoundation =", value, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationNotEqualTo(Integer value) {
            addCriterion("frontEndFoundation <>", value, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationGreaterThan(Integer value) {
            addCriterion("frontEndFoundation >", value, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationGreaterThanOrEqualTo(Integer value) {
            addCriterion("frontEndFoundation >=", value, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationLessThan(Integer value) {
            addCriterion("frontEndFoundation <", value, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationLessThanOrEqualTo(Integer value) {
            addCriterion("frontEndFoundation <=", value, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationIn(List<Integer> values) {
            addCriterion("frontEndFoundation in", values, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationNotIn(List<Integer> values) {
            addCriterion("frontEndFoundation not in", values, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationBetween(Integer value1, Integer value2) {
            addCriterion("frontEndFoundation between", value1, value2, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendfoundationNotBetween(Integer value1, Integer value2) {
            addCriterion("frontEndFoundation not between", value1, value2, "frontendfoundation");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceIsNull() {
            addCriterion("frontEndAdvance is null");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceIsNotNull() {
            addCriterion("frontEndAdvance is not null");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceEqualTo(Integer value) {
            addCriterion("frontEndAdvance =", value, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceNotEqualTo(Integer value) {
            addCriterion("frontEndAdvance <>", value, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceGreaterThan(Integer value) {
            addCriterion("frontEndAdvance >", value, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("frontEndAdvance >=", value, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceLessThan(Integer value) {
            addCriterion("frontEndAdvance <", value, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceLessThanOrEqualTo(Integer value) {
            addCriterion("frontEndAdvance <=", value, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceIn(List<Integer> values) {
            addCriterion("frontEndAdvance in", values, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceNotIn(List<Integer> values) {
            addCriterion("frontEndAdvance not in", values, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceBetween(Integer value1, Integer value2) {
            addCriterion("frontEndAdvance between", value1, value2, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andFrontendadvanceNotBetween(Integer value1, Integer value2) {
            addCriterion("frontEndAdvance not between", value1, value2, "frontendadvance");
            return (Criteria) this;
        }

        public Criteria andBackendIsNull() {
            addCriterion("backEnd is null");
            return (Criteria) this;
        }

        public Criteria andBackendIsNotNull() {
            addCriterion("backEnd is not null");
            return (Criteria) this;
        }

        public Criteria andBackendEqualTo(Integer value) {
            addCriterion("backEnd =", value, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendNotEqualTo(Integer value) {
            addCriterion("backEnd <>", value, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendGreaterThan(Integer value) {
            addCriterion("backEnd >", value, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendGreaterThanOrEqualTo(Integer value) {
            addCriterion("backEnd >=", value, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendLessThan(Integer value) {
            addCriterion("backEnd <", value, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendLessThanOrEqualTo(Integer value) {
            addCriterion("backEnd <=", value, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendIn(List<Integer> values) {
            addCriterion("backEnd in", values, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendNotIn(List<Integer> values) {
            addCriterion("backEnd not in", values, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendBetween(Integer value1, Integer value2) {
            addCriterion("backEnd between", value1, value2, "backend");
            return (Criteria) this;
        }

        public Criteria andBackendNotBetween(Integer value1, Integer value2) {
            addCriterion("backEnd not between", value1, value2, "backend");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopIsNull() {
            addCriterion("mobileDevelop is null");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopIsNotNull() {
            addCriterion("mobileDevelop is not null");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopEqualTo(Integer value) {
            addCriterion("mobileDevelop =", value, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopNotEqualTo(Integer value) {
            addCriterion("mobileDevelop <>", value, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopGreaterThan(Integer value) {
            addCriterion("mobileDevelop >", value, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobileDevelop >=", value, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopLessThan(Integer value) {
            addCriterion("mobileDevelop <", value, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopLessThanOrEqualTo(Integer value) {
            addCriterion("mobileDevelop <=", value, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopIn(List<Integer> values) {
            addCriterion("mobileDevelop in", values, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopNotIn(List<Integer> values) {
            addCriterion("mobileDevelop not in", values, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopBetween(Integer value1, Integer value2) {
            addCriterion("mobileDevelop between", value1, value2, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andMobiledevelopNotBetween(Integer value1, Integer value2) {
            addCriterion("mobileDevelop not between", value1, value2, "mobiledevelop");
            return (Criteria) this;
        }

        public Criteria andDatabase666IsNull() {
            addCriterion("database666 is null");
            return (Criteria) this;
        }

        public Criteria andDatabase666IsNotNull() {
            addCriterion("database666 is not null");
            return (Criteria) this;
        }

        public Criteria andDatabase666EqualTo(Integer value) {
            addCriterion("database666 =", value, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666NotEqualTo(Integer value) {
            addCriterion("database666 <>", value, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666GreaterThan(Integer value) {
            addCriterion("database666 >", value, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666GreaterThanOrEqualTo(Integer value) {
            addCriterion("database666 >=", value, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666LessThan(Integer value) {
            addCriterion("database666 <", value, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666LessThanOrEqualTo(Integer value) {
            addCriterion("database666 <=", value, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666In(List<Integer> values) {
            addCriterion("database666 in", values, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666NotIn(List<Integer> values) {
            addCriterion("database666 not in", values, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666Between(Integer value1, Integer value2) {
            addCriterion("database666 between", value1, value2, "database666");
            return (Criteria) this;
        }

        public Criteria andDatabase666NotBetween(Integer value1, Integer value2) {
            addCriterion("database666 not between", value1, value2, "database666");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemIsNull() {
            addCriterion("recentTechItem is null");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemIsNotNull() {
            addCriterion("recentTechItem is not null");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemEqualTo(Integer value) {
            addCriterion("recentTechItem =", value, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemNotEqualTo(Integer value) {
            addCriterion("recentTechItem <>", value, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemGreaterThan(Integer value) {
            addCriterion("recentTechItem >", value, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemGreaterThanOrEqualTo(Integer value) {
            addCriterion("recentTechItem >=", value, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemLessThan(Integer value) {
            addCriterion("recentTechItem <", value, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemLessThanOrEqualTo(Integer value) {
            addCriterion("recentTechItem <=", value, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemIn(List<Integer> values) {
            addCriterion("recentTechItem in", values, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemNotIn(List<Integer> values) {
            addCriterion("recentTechItem not in", values, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemBetween(Integer value1, Integer value2) {
            addCriterion("recentTechItem between", value1, value2, "recenttechitem");
            return (Criteria) this;
        }

        public Criteria andRecenttechitemNotBetween(Integer value1, Integer value2) {
            addCriterion("recentTechItem not between", value1, value2, "recenttechitem");
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