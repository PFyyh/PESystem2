package com.pesystem.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRecYearIsNull() {
            addCriterion("rec_year is null");
            return (Criteria) this;
        }

        public Criteria andRecYearIsNotNull() {
            addCriterion("rec_year is not null");
            return (Criteria) this;
        }

        public Criteria andRecYearEqualTo(Date value) {
            addCriterionForJDBCDate("rec_year =", value, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("rec_year <>", value, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearGreaterThan(Date value) {
            addCriterionForJDBCDate("rec_year >", value, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rec_year >=", value, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearLessThan(Date value) {
            addCriterionForJDBCDate("rec_year <", value, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rec_year <=", value, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearIn(List<Date> values) {
            addCriterionForJDBCDate("rec_year in", values, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("rec_year not in", values, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rec_year between", value1, value2, "recYear");
            return (Criteria) this;
        }

        public Criteria andRecYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rec_year not between", value1, value2, "recYear");
            return (Criteria) this;
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

        public Criteria andRecHeightIsNull() {
            addCriterion("rec_height is null");
            return (Criteria) this;
        }

        public Criteria andRecHeightIsNotNull() {
            addCriterion("rec_height is not null");
            return (Criteria) this;
        }

        public Criteria andRecHeightEqualTo(BigDecimal value) {
            addCriterion("rec_height =", value, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightNotEqualTo(BigDecimal value) {
            addCriterion("rec_height <>", value, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightGreaterThan(BigDecimal value) {
            addCriterion("rec_height >", value, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_height >=", value, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightLessThan(BigDecimal value) {
            addCriterion("rec_height <", value, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_height <=", value, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightIn(List<BigDecimal> values) {
            addCriterion("rec_height in", values, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightNotIn(List<BigDecimal> values) {
            addCriterion("rec_height not in", values, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_height between", value1, value2, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_height not between", value1, value2, "recHeight");
            return (Criteria) this;
        }

        public Criteria andRecEightIsNull() {
            addCriterion("rec_eight is null");
            return (Criteria) this;
        }

        public Criteria andRecEightIsNotNull() {
            addCriterion("rec_eight is not null");
            return (Criteria) this;
        }

        public Criteria andRecEightEqualTo(BigDecimal value) {
            addCriterion("rec_eight =", value, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightNotEqualTo(BigDecimal value) {
            addCriterion("rec_eight <>", value, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightGreaterThan(BigDecimal value) {
            addCriterion("rec_eight >", value, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_eight >=", value, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightLessThan(BigDecimal value) {
            addCriterion("rec_eight <", value, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_eight <=", value, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightIn(List<BigDecimal> values) {
            addCriterion("rec_eight in", values, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightNotIn(List<BigDecimal> values) {
            addCriterion("rec_eight not in", values, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_eight between", value1, value2, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecEightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_eight not between", value1, value2, "recEight");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityIsNull() {
            addCriterion("rec_vtal_capacity is null");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityIsNotNull() {
            addCriterion("rec_vtal_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityEqualTo(Integer value) {
            addCriterion("rec_vtal_capacity =", value, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityNotEqualTo(Integer value) {
            addCriterion("rec_vtal_capacity <>", value, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityGreaterThan(Integer value) {
            addCriterion("rec_vtal_capacity >", value, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_vtal_capacity >=", value, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityLessThan(Integer value) {
            addCriterion("rec_vtal_capacity <", value, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("rec_vtal_capacity <=", value, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityIn(List<Integer> values) {
            addCriterion("rec_vtal_capacity in", values, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityNotIn(List<Integer> values) {
            addCriterion("rec_vtal_capacity not in", values, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityBetween(Integer value1, Integer value2) {
            addCriterion("rec_vtal_capacity between", value1, value2, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecVtalCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_vtal_capacity not between", value1, value2, "recVtalCapacity");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendIsNull() {
            addCriterion("rec_begin_to_bend is null");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendIsNotNull() {
            addCriterion("rec_begin_to_bend is not null");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendEqualTo(BigDecimal value) {
            addCriterion("rec_begin_to_bend =", value, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendNotEqualTo(BigDecimal value) {
            addCriterion("rec_begin_to_bend <>", value, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendGreaterThan(BigDecimal value) {
            addCriterion("rec_begin_to_bend >", value, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_begin_to_bend >=", value, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendLessThan(BigDecimal value) {
            addCriterion("rec_begin_to_bend <", value, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_begin_to_bend <=", value, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendIn(List<BigDecimal> values) {
            addCriterion("rec_begin_to_bend in", values, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendNotIn(List<BigDecimal> values) {
            addCriterion("rec_begin_to_bend not in", values, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_begin_to_bend between", value1, value2, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecBeginToBendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_begin_to_bend not between", value1, value2, "recBeginToBend");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpIsNull() {
            addCriterion("rec_standing_broad_jump is null");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpIsNotNull() {
            addCriterion("rec_standing_broad_jump is not null");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpEqualTo(BigDecimal value) {
            addCriterion("rec_standing_broad_jump =", value, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpNotEqualTo(BigDecimal value) {
            addCriterion("rec_standing_broad_jump <>", value, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpGreaterThan(BigDecimal value) {
            addCriterion("rec_standing_broad_jump >", value, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_standing_broad_jump >=", value, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpLessThan(BigDecimal value) {
            addCriterion("rec_standing_broad_jump <", value, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_standing_broad_jump <=", value, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpIn(List<BigDecimal> values) {
            addCriterion("rec_standing_broad_jump in", values, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpNotIn(List<BigDecimal> values) {
            addCriterion("rec_standing_broad_jump not in", values, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_standing_broad_jump between", value1, value2, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecStandingBroadJumpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_standing_broad_jump not between", value1, value2, "recStandingBroadJump");
            return (Criteria) this;
        }

        public Criteria andRecSitUpIsNull() {
            addCriterion("rec_sit_up is null");
            return (Criteria) this;
        }

        public Criteria andRecSitUpIsNotNull() {
            addCriterion("rec_sit_up is not null");
            return (Criteria) this;
        }

        public Criteria andRecSitUpEqualTo(Integer value) {
            addCriterion("rec_sit_up =", value, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpNotEqualTo(Integer value) {
            addCriterion("rec_sit_up <>", value, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpGreaterThan(Integer value) {
            addCriterion("rec_sit_up >", value, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_sit_up >=", value, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpLessThan(Integer value) {
            addCriterion("rec_sit_up <", value, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpLessThanOrEqualTo(Integer value) {
            addCriterion("rec_sit_up <=", value, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpIn(List<Integer> values) {
            addCriterion("rec_sit_up in", values, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpNotIn(List<Integer> values) {
            addCriterion("rec_sit_up not in", values, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpBetween(Integer value1, Integer value2) {
            addCriterion("rec_sit_up between", value1, value2, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecSitUpNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_sit_up not between", value1, value2, "recSitUp");
            return (Criteria) this;
        }

        public Criteria andRecChinningIsNull() {
            addCriterion("rec_chinning is null");
            return (Criteria) this;
        }

        public Criteria andRecChinningIsNotNull() {
            addCriterion("rec_chinning is not null");
            return (Criteria) this;
        }

        public Criteria andRecChinningEqualTo(Integer value) {
            addCriterion("rec_chinning =", value, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningNotEqualTo(Integer value) {
            addCriterion("rec_chinning <>", value, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningGreaterThan(Integer value) {
            addCriterion("rec_chinning >", value, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_chinning >=", value, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningLessThan(Integer value) {
            addCriterion("rec_chinning <", value, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningLessThanOrEqualTo(Integer value) {
            addCriterion("rec_chinning <=", value, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningIn(List<Integer> values) {
            addCriterion("rec_chinning in", values, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningNotIn(List<Integer> values) {
            addCriterion("rec_chinning not in", values, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningBetween(Integer value1, Integer value2) {
            addCriterion("rec_chinning between", value1, value2, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecChinningNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_chinning not between", value1, value2, "recChinning");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunIsNull() {
            addCriterion("rec_fivety_rrun is null");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunIsNotNull() {
            addCriterion("rec_fivety_rrun is not null");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunEqualTo(Integer value) {
            addCriterion("rec_fivety_rrun =", value, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunNotEqualTo(Integer value) {
            addCriterion("rec_fivety_rrun <>", value, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunGreaterThan(Integer value) {
            addCriterion("rec_fivety_rrun >", value, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_fivety_rrun >=", value, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunLessThan(Integer value) {
            addCriterion("rec_fivety_rrun <", value, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunLessThanOrEqualTo(Integer value) {
            addCriterion("rec_fivety_rrun <=", value, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunIn(List<Integer> values) {
            addCriterion("rec_fivety_rrun in", values, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunNotIn(List<Integer> values) {
            addCriterion("rec_fivety_rrun not in", values, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunBetween(Integer value1, Integer value2) {
            addCriterion("rec_fivety_rrun between", value1, value2, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecFivetyRrunNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_fivety_rrun not between", value1, value2, "recFivetyRrun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunIsNull() {
            addCriterion("rec_thousand_run is null");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunIsNotNull() {
            addCriterion("rec_thousand_run is not null");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunEqualTo(String value) {
            addCriterion("rec_thousand_run =", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunNotEqualTo(String value) {
            addCriterion("rec_thousand_run <>", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunGreaterThan(String value) {
            addCriterion("rec_thousand_run >", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunGreaterThanOrEqualTo(String value) {
            addCriterion("rec_thousand_run >=", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunLessThan(String value) {
            addCriterion("rec_thousand_run <", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunLessThanOrEqualTo(String value) {
            addCriterion("rec_thousand_run <=", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunLike(String value) {
            addCriterion("rec_thousand_run like", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunNotLike(String value) {
            addCriterion("rec_thousand_run not like", value, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunIn(List<String> values) {
            addCriterion("rec_thousand_run in", values, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunNotIn(List<String> values) {
            addCriterion("rec_thousand_run not in", values, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunBetween(String value1, String value2) {
            addCriterion("rec_thousand_run between", value1, value2, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecThousandRunNotBetween(String value1, String value2) {
            addCriterion("rec_thousand_run not between", value1, value2, "recThousandRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunIsNull() {
            addCriterion("rec_eight_handred_run is null");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunIsNotNull() {
            addCriterion("rec_eight_handred_run is not null");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunEqualTo(String value) {
            addCriterion("rec_eight_handred_run =", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunNotEqualTo(String value) {
            addCriterion("rec_eight_handred_run <>", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunGreaterThan(String value) {
            addCriterion("rec_eight_handred_run >", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunGreaterThanOrEqualTo(String value) {
            addCriterion("rec_eight_handred_run >=", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunLessThan(String value) {
            addCriterion("rec_eight_handred_run <", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunLessThanOrEqualTo(String value) {
            addCriterion("rec_eight_handred_run <=", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunLike(String value) {
            addCriterion("rec_eight_handred_run like", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunNotLike(String value) {
            addCriterion("rec_eight_handred_run not like", value, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunIn(List<String> values) {
            addCriterion("rec_eight_handred_run in", values, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunNotIn(List<String> values) {
            addCriterion("rec_eight_handred_run not in", values, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunBetween(String value1, String value2) {
            addCriterion("rec_eight_handred_run between", value1, value2, "recEightHandredRun");
            return (Criteria) this;
        }

        public Criteria andRecEightHandredRunNotBetween(String value1, String value2) {
            addCriterion("rec_eight_handred_run not between", value1, value2, "recEightHandredRun");
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