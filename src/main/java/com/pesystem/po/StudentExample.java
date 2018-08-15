package com.pesystem.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStdntNameIsNull() {
            addCriterion("stdnt_name is null");
            return (Criteria) this;
        }

        public Criteria andStdntNameIsNotNull() {
            addCriterion("stdnt_name is not null");
            return (Criteria) this;
        }

        public Criteria andStdntNameEqualTo(String value) {
            addCriterion("stdnt_name =", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameNotEqualTo(String value) {
            addCriterion("stdnt_name <>", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameGreaterThan(String value) {
            addCriterion("stdnt_name >", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameGreaterThanOrEqualTo(String value) {
            addCriterion("stdnt_name >=", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameLessThan(String value) {
            addCriterion("stdnt_name <", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameLessThanOrEqualTo(String value) {
            addCriterion("stdnt_name <=", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameLike(String value) {
            addCriterion("stdnt_name like", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameNotLike(String value) {
            addCriterion("stdnt_name not like", value, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameIn(List<String> values) {
            addCriterion("stdnt_name in", values, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameNotIn(List<String> values) {
            addCriterion("stdnt_name not in", values, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameBetween(String value1, String value2) {
            addCriterion("stdnt_name between", value1, value2, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntNameNotBetween(String value1, String value2) {
            addCriterion("stdnt_name not between", value1, value2, "stdntName");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayIsNull() {
            addCriterion("stdnt_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayIsNotNull() {
            addCriterion("stdnt_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("stdnt_birthday =", value, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("stdnt_birthday <>", value, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("stdnt_birthday >", value, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stdnt_birthday >=", value, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("stdnt_birthday <", value, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stdnt_birthday <=", value, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("stdnt_birthday in", values, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("stdnt_birthday not in", values, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stdnt_birthday between", value1, value2, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stdnt_birthday not between", value1, value2, "stdntBirthday");
            return (Criteria) this;
        }

        public Criteria andStdntIcIsNull() {
            addCriterion("stdnt_ic is null");
            return (Criteria) this;
        }

        public Criteria andStdntIcIsNotNull() {
            addCriterion("stdnt_ic is not null");
            return (Criteria) this;
        }

        public Criteria andStdntIcEqualTo(String value) {
            addCriterion("stdnt_ic =", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcNotEqualTo(String value) {
            addCriterion("stdnt_ic <>", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcGreaterThan(String value) {
            addCriterion("stdnt_ic >", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcGreaterThanOrEqualTo(String value) {
            addCriterion("stdnt_ic >=", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcLessThan(String value) {
            addCriterion("stdnt_ic <", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcLessThanOrEqualTo(String value) {
            addCriterion("stdnt_ic <=", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcLike(String value) {
            addCriterion("stdnt_ic like", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcNotLike(String value) {
            addCriterion("stdnt_ic not like", value, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcIn(List<String> values) {
            addCriterion("stdnt_ic in", values, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcNotIn(List<String> values) {
            addCriterion("stdnt_ic not in", values, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcBetween(String value1, String value2) {
            addCriterion("stdnt_ic between", value1, value2, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStdntIcNotBetween(String value1, String value2) {
            addCriterion("stdnt_ic not between", value1, value2, "stdntIc");
            return (Criteria) this;
        }

        public Criteria andStuHomeIsNull() {
            addCriterion("stu_home is null");
            return (Criteria) this;
        }

        public Criteria andStuHomeIsNotNull() {
            addCriterion("stu_home is not null");
            return (Criteria) this;
        }

        public Criteria andStuHomeEqualTo(String value) {
            addCriterion("stu_home =", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotEqualTo(String value) {
            addCriterion("stu_home <>", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeGreaterThan(String value) {
            addCriterion("stu_home >", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_home >=", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLessThan(String value) {
            addCriterion("stu_home <", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLessThanOrEqualTo(String value) {
            addCriterion("stu_home <=", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLike(String value) {
            addCriterion("stu_home like", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotLike(String value) {
            addCriterion("stu_home not like", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeIn(List<String> values) {
            addCriterion("stu_home in", values, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotIn(List<String> values) {
            addCriterion("stu_home not in", values, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeBetween(String value1, String value2) {
            addCriterion("stu_home between", value1, value2, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotBetween(String value1, String value2) {
            addCriterion("stu_home not between", value1, value2, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdIsNull() {
            addCriterion("stdnt_gender_id is null");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdIsNotNull() {
            addCriterion("stdnt_gender_id is not null");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdEqualTo(String value) {
            addCriterion("stdnt_gender_id =", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdNotEqualTo(String value) {
            addCriterion("stdnt_gender_id <>", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdGreaterThan(String value) {
            addCriterion("stdnt_gender_id >", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("stdnt_gender_id >=", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdLessThan(String value) {
            addCriterion("stdnt_gender_id <", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdLessThanOrEqualTo(String value) {
            addCriterion("stdnt_gender_id <=", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdLike(String value) {
            addCriterion("stdnt_gender_id like", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdNotLike(String value) {
            addCriterion("stdnt_gender_id not like", value, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdIn(List<String> values) {
            addCriterion("stdnt_gender_id in", values, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdNotIn(List<String> values) {
            addCriterion("stdnt_gender_id not in", values, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdBetween(String value1, String value2) {
            addCriterion("stdnt_gender_id between", value1, value2, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntGenderIdNotBetween(String value1, String value2) {
            addCriterion("stdnt_gender_id not between", value1, value2, "stdntGenderId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdIsNull() {
            addCriterion("stdnt_nation_id is null");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdIsNotNull() {
            addCriterion("stdnt_nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdEqualTo(String value) {
            addCriterion("stdnt_nation_id =", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdNotEqualTo(String value) {
            addCriterion("stdnt_nation_id <>", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdGreaterThan(String value) {
            addCriterion("stdnt_nation_id >", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdGreaterThanOrEqualTo(String value) {
            addCriterion("stdnt_nation_id >=", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdLessThan(String value) {
            addCriterion("stdnt_nation_id <", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdLessThanOrEqualTo(String value) {
            addCriterion("stdnt_nation_id <=", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdLike(String value) {
            addCriterion("stdnt_nation_id like", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdNotLike(String value) {
            addCriterion("stdnt_nation_id not like", value, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdIn(List<String> values) {
            addCriterion("stdnt_nation_id in", values, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdNotIn(List<String> values) {
            addCriterion("stdnt_nation_id not in", values, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdBetween(String value1, String value2) {
            addCriterion("stdnt_nation_id between", value1, value2, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntNationIdNotBetween(String value1, String value2) {
            addCriterion("stdnt_nation_id not between", value1, value2, "stdntNationId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdIsNull() {
            addCriterion("stdnt_origin_id is null");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdIsNotNull() {
            addCriterion("stdnt_origin_id is not null");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdEqualTo(String value) {
            addCriterion("stdnt_origin_id =", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdNotEqualTo(String value) {
            addCriterion("stdnt_origin_id <>", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdGreaterThan(String value) {
            addCriterion("stdnt_origin_id >", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdGreaterThanOrEqualTo(String value) {
            addCriterion("stdnt_origin_id >=", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdLessThan(String value) {
            addCriterion("stdnt_origin_id <", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdLessThanOrEqualTo(String value) {
            addCriterion("stdnt_origin_id <=", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdLike(String value) {
            addCriterion("stdnt_origin_id like", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdNotLike(String value) {
            addCriterion("stdnt_origin_id not like", value, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdIn(List<String> values) {
            addCriterion("stdnt_origin_id in", values, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdNotIn(List<String> values) {
            addCriterion("stdnt_origin_id not in", values, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdBetween(String value1, String value2) {
            addCriterion("stdnt_origin_id between", value1, value2, "stdntOriginId");
            return (Criteria) this;
        }

        public Criteria andStdntOriginIdNotBetween(String value1, String value2) {
            addCriterion("stdnt_origin_id not between", value1, value2, "stdntOriginId");
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