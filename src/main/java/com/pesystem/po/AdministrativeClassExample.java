package com.pesystem.po;

import java.util.ArrayList;
import java.util.List;

public class AdministrativeClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministrativeClassExample() {
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

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(String value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(String value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(String value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(String value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(String value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLike(String value) {
            addCriterion("ac_id like", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotLike(String value) {
            addCriterion("ac_id not like", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<String> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<String> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(String value1, String value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(String value1, String value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andTesterIdIsNull() {
            addCriterion("tester_id is null");
            return (Criteria) this;
        }

        public Criteria andTesterIdIsNotNull() {
            addCriterion("tester_id is not null");
            return (Criteria) this;
        }

        public Criteria andTesterIdEqualTo(String value) {
            addCriterion("tester_id =", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdNotEqualTo(String value) {
            addCriterion("tester_id <>", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdGreaterThan(String value) {
            addCriterion("tester_id >", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdGreaterThanOrEqualTo(String value) {
            addCriterion("tester_id >=", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdLessThan(String value) {
            addCriterion("tester_id <", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdLessThanOrEqualTo(String value) {
            addCriterion("tester_id <=", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdLike(String value) {
            addCriterion("tester_id like", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdNotLike(String value) {
            addCriterion("tester_id not like", value, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdIn(List<String> values) {
            addCriterion("tester_id in", values, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdNotIn(List<String> values) {
            addCriterion("tester_id not in", values, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdBetween(String value1, String value2) {
            addCriterion("tester_id between", value1, value2, "testerId");
            return (Criteria) this;
        }

        public Criteria andTesterIdNotBetween(String value1, String value2) {
            addCriterion("tester_id not between", value1, value2, "testerId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andAcNameIsNull() {
            addCriterion("ac_name is null");
            return (Criteria) this;
        }

        public Criteria andAcNameIsNotNull() {
            addCriterion("ac_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcNameEqualTo(String value) {
            addCriterion("ac_name =", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotEqualTo(String value) {
            addCriterion("ac_name <>", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameGreaterThan(String value) {
            addCriterion("ac_name >", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameGreaterThanOrEqualTo(String value) {
            addCriterion("ac_name >=", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameLessThan(String value) {
            addCriterion("ac_name <", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameLessThanOrEqualTo(String value) {
            addCriterion("ac_name <=", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameLike(String value) {
            addCriterion("ac_name like", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotLike(String value) {
            addCriterion("ac_name not like", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameIn(List<String> values) {
            addCriterion("ac_name in", values, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotIn(List<String> values) {
            addCriterion("ac_name not in", values, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameBetween(String value1, String value2) {
            addCriterion("ac_name between", value1, value2, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotBetween(String value1, String value2) {
            addCriterion("ac_name not between", value1, value2, "acName");
            return (Criteria) this;
        }

        public Criteria andAcYearIsNull() {
            addCriterion("ac_year is null");
            return (Criteria) this;
        }

        public Criteria andAcYearIsNotNull() {
            addCriterion("ac_year is not null");
            return (Criteria) this;
        }

        public Criteria andAcYearEqualTo(Integer value) {
            addCriterion("ac_year =", value, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearNotEqualTo(Integer value) {
            addCriterion("ac_year <>", value, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearGreaterThan(Integer value) {
            addCriterion("ac_year >", value, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_year >=", value, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearLessThan(Integer value) {
            addCriterion("ac_year <", value, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearLessThanOrEqualTo(Integer value) {
            addCriterion("ac_year <=", value, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearIn(List<Integer> values) {
            addCriterion("ac_year in", values, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearNotIn(List<Integer> values) {
            addCriterion("ac_year not in", values, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearBetween(Integer value1, Integer value2) {
            addCriterion("ac_year between", value1, value2, "acYear");
            return (Criteria) this;
        }

        public Criteria andAcYearNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_year not between", value1, value2, "acYear");
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