package com.pesystem.po;

import java.util.ArrayList;
import java.util.List;

public class StudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyExample() {
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

        public Criteria andStdntIdIsNull() {
            addCriterion("stdnt_id is null");
            return (Criteria) this;
        }

        public Criteria andStdntIdIsNotNull() {
            addCriterion("stdnt_id is not null");
            return (Criteria) this;
        }

        public Criteria andStdntIdEqualTo(String value) {
            addCriterion("stdnt_id =", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdNotEqualTo(String value) {
            addCriterion("stdnt_id <>", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdGreaterThan(String value) {
            addCriterion("stdnt_id >", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdGreaterThanOrEqualTo(String value) {
            addCriterion("stdnt_id >=", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdLessThan(String value) {
            addCriterion("stdnt_id <", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdLessThanOrEqualTo(String value) {
            addCriterion("stdnt_id <=", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdLike(String value) {
            addCriterion("stdnt_id like", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdNotLike(String value) {
            addCriterion("stdnt_id not like", value, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdIn(List<String> values) {
            addCriterion("stdnt_id in", values, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdNotIn(List<String> values) {
            addCriterion("stdnt_id not in", values, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdBetween(String value1, String value2) {
            addCriterion("stdnt_id between", value1, value2, "stdntId");
            return (Criteria) this;
        }

        public Criteria andStdntIdNotBetween(String value1, String value2) {
            addCriterion("stdnt_id not between", value1, value2, "stdntId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdIsNull() {
            addCriterion("pe_class_Id is null");
            return (Criteria) this;
        }

        public Criteria andPeClassIdIsNotNull() {
            addCriterion("pe_class_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPeClassIdEqualTo(String value) {
            addCriterion("pe_class_Id =", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdNotEqualTo(String value) {
            addCriterion("pe_class_Id <>", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdGreaterThan(String value) {
            addCriterion("pe_class_Id >", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("pe_class_Id >=", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdLessThan(String value) {
            addCriterion("pe_class_Id <", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdLessThanOrEqualTo(String value) {
            addCriterion("pe_class_Id <=", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdLike(String value) {
            addCriterion("pe_class_Id like", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdNotLike(String value) {
            addCriterion("pe_class_Id not like", value, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdIn(List<String> values) {
            addCriterion("pe_class_Id in", values, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdNotIn(List<String> values) {
            addCriterion("pe_class_Id not in", values, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdBetween(String value1, String value2) {
            addCriterion("pe_class_Id between", value1, value2, "peClassId");
            return (Criteria) this;
        }

        public Criteria andPeClassIdNotBetween(String value1, String value2) {
            addCriterion("pe_class_Id not between", value1, value2, "peClassId");
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