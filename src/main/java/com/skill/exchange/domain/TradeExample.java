package com.skill.exchange.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public TradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
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

        public Criteria andFromStudentIdIsNull() {
            addCriterion("from_student_id is null");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdIsNotNull() {
            addCriterion("from_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdEqualTo(Integer value) {
            addCriterion("from_student_id =", value, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdNotEqualTo(Integer value) {
            addCriterion("from_student_id <>", value, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdGreaterThan(Integer value) {
            addCriterion("from_student_id >", value, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_student_id >=", value, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdLessThan(Integer value) {
            addCriterion("from_student_id <", value, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_student_id <=", value, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdIn(List<Integer> values) {
            addCriterion("from_student_id in", values, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdNotIn(List<Integer> values) {
            addCriterion("from_student_id not in", values, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("from_student_id between", value1, value2, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_student_id not between", value1, value2, "fromStudentId");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameIsNull() {
            addCriterion("from_student_real_name is null");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameIsNotNull() {
            addCriterion("from_student_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameEqualTo(String value) {
            addCriterion("from_student_real_name =", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameNotEqualTo(String value) {
            addCriterion("from_student_real_name <>", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameGreaterThan(String value) {
            addCriterion("from_student_real_name >", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_student_real_name >=", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameLessThan(String value) {
            addCriterion("from_student_real_name <", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameLessThanOrEqualTo(String value) {
            addCriterion("from_student_real_name <=", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameLike(String value) {
            addCriterion("from_student_real_name like", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameNotLike(String value) {
            addCriterion("from_student_real_name not like", value, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameIn(List<String> values) {
            addCriterion("from_student_real_name in", values, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameNotIn(List<String> values) {
            addCriterion("from_student_real_name not in", values, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameBetween(String value1, String value2) {
            addCriterion("from_student_real_name between", value1, value2, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentRealNameNotBetween(String value1, String value2) {
            addCriterion("from_student_real_name not between", value1, value2, "fromStudentRealName");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumIsNull() {
            addCriterion("from_student_num is null");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumIsNotNull() {
            addCriterion("from_student_num is not null");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumEqualTo(String value) {
            addCriterion("from_student_num =", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumNotEqualTo(String value) {
            addCriterion("from_student_num <>", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumGreaterThan(String value) {
            addCriterion("from_student_num >", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumGreaterThanOrEqualTo(String value) {
            addCriterion("from_student_num >=", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumLessThan(String value) {
            addCriterion("from_student_num <", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumLessThanOrEqualTo(String value) {
            addCriterion("from_student_num <=", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumLike(String value) {
            addCriterion("from_student_num like", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumNotLike(String value) {
            addCriterion("from_student_num not like", value, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumIn(List<String> values) {
            addCriterion("from_student_num in", values, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumNotIn(List<String> values) {
            addCriterion("from_student_num not in", values, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumBetween(String value1, String value2) {
            addCriterion("from_student_num between", value1, value2, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromStudentNumNotBetween(String value1, String value2) {
            addCriterion("from_student_num not between", value1, value2, "fromStudentNum");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdIsNull() {
            addCriterion("from_skill_id is null");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdIsNotNull() {
            addCriterion("from_skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdEqualTo(Integer value) {
            addCriterion("from_skill_id =", value, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdNotEqualTo(Integer value) {
            addCriterion("from_skill_id <>", value, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdGreaterThan(Integer value) {
            addCriterion("from_skill_id >", value, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_skill_id >=", value, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdLessThan(Integer value) {
            addCriterion("from_skill_id <", value, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_skill_id <=", value, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdIn(List<Integer> values) {
            addCriterion("from_skill_id in", values, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdNotIn(List<Integer> values) {
            addCriterion("from_skill_id not in", values, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdBetween(Integer value1, Integer value2) {
            addCriterion("from_skill_id between", value1, value2, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_skill_id not between", value1, value2, "fromSkillId");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleIsNull() {
            addCriterion("from_skill_title is null");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleIsNotNull() {
            addCriterion("from_skill_title is not null");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleEqualTo(String value) {
            addCriterion("from_skill_title =", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleNotEqualTo(String value) {
            addCriterion("from_skill_title <>", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleGreaterThan(String value) {
            addCriterion("from_skill_title >", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleGreaterThanOrEqualTo(String value) {
            addCriterion("from_skill_title >=", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleLessThan(String value) {
            addCriterion("from_skill_title <", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleLessThanOrEqualTo(String value) {
            addCriterion("from_skill_title <=", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleLike(String value) {
            addCriterion("from_skill_title like", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleNotLike(String value) {
            addCriterion("from_skill_title not like", value, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleIn(List<String> values) {
            addCriterion("from_skill_title in", values, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleNotIn(List<String> values) {
            addCriterion("from_skill_title not in", values, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleBetween(String value1, String value2) {
            addCriterion("from_skill_title between", value1, value2, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andFromSkillTitleNotBetween(String value1, String value2) {
            addCriterion("from_skill_title not between", value1, value2, "fromSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToStudentIdIsNull() {
            addCriterion("to_student_id is null");
            return (Criteria) this;
        }

        public Criteria andToStudentIdIsNotNull() {
            addCriterion("to_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andToStudentIdEqualTo(Integer value) {
            addCriterion("to_student_id =", value, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdNotEqualTo(Integer value) {
            addCriterion("to_student_id <>", value, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdGreaterThan(Integer value) {
            addCriterion("to_student_id >", value, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_student_id >=", value, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdLessThan(Integer value) {
            addCriterion("to_student_id <", value, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_student_id <=", value, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdIn(List<Integer> values) {
            addCriterion("to_student_id in", values, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdNotIn(List<Integer> values) {
            addCriterion("to_student_id not in", values, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("to_student_id between", value1, value2, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_student_id not between", value1, value2, "toStudentId");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameIsNull() {
            addCriterion("to_student_real_name is null");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameIsNotNull() {
            addCriterion("to_student_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameEqualTo(String value) {
            addCriterion("to_student_real_name =", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameNotEqualTo(String value) {
            addCriterion("to_student_real_name <>", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameGreaterThan(String value) {
            addCriterion("to_student_real_name >", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_student_real_name >=", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameLessThan(String value) {
            addCriterion("to_student_real_name <", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameLessThanOrEqualTo(String value) {
            addCriterion("to_student_real_name <=", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameLike(String value) {
            addCriterion("to_student_real_name like", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameNotLike(String value) {
            addCriterion("to_student_real_name not like", value, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameIn(List<String> values) {
            addCriterion("to_student_real_name in", values, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameNotIn(List<String> values) {
            addCriterion("to_student_real_name not in", values, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameBetween(String value1, String value2) {
            addCriterion("to_student_real_name between", value1, value2, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentRealNameNotBetween(String value1, String value2) {
            addCriterion("to_student_real_name not between", value1, value2, "toStudentRealName");
            return (Criteria) this;
        }

        public Criteria andToStudentNumIsNull() {
            addCriterion("to_student_num is null");
            return (Criteria) this;
        }

        public Criteria andToStudentNumIsNotNull() {
            addCriterion("to_student_num is not null");
            return (Criteria) this;
        }

        public Criteria andToStudentNumEqualTo(String value) {
            addCriterion("to_student_num =", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumNotEqualTo(String value) {
            addCriterion("to_student_num <>", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumGreaterThan(String value) {
            addCriterion("to_student_num >", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumGreaterThanOrEqualTo(String value) {
            addCriterion("to_student_num >=", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumLessThan(String value) {
            addCriterion("to_student_num <", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumLessThanOrEqualTo(String value) {
            addCriterion("to_student_num <=", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumLike(String value) {
            addCriterion("to_student_num like", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumNotLike(String value) {
            addCriterion("to_student_num not like", value, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumIn(List<String> values) {
            addCriterion("to_student_num in", values, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumNotIn(List<String> values) {
            addCriterion("to_student_num not in", values, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumBetween(String value1, String value2) {
            addCriterion("to_student_num between", value1, value2, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToStudentNumNotBetween(String value1, String value2) {
            addCriterion("to_student_num not between", value1, value2, "toStudentNum");
            return (Criteria) this;
        }

        public Criteria andToSkillIdIsNull() {
            addCriterion("to_skill_id is null");
            return (Criteria) this;
        }

        public Criteria andToSkillIdIsNotNull() {
            addCriterion("to_skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andToSkillIdEqualTo(Integer value) {
            addCriterion("to_skill_id =", value, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdNotEqualTo(Integer value) {
            addCriterion("to_skill_id <>", value, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdGreaterThan(Integer value) {
            addCriterion("to_skill_id >", value, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_skill_id >=", value, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdLessThan(Integer value) {
            addCriterion("to_skill_id <", value, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_skill_id <=", value, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdIn(List<Integer> values) {
            addCriterion("to_skill_id in", values, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdNotIn(List<Integer> values) {
            addCriterion("to_skill_id not in", values, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdBetween(Integer value1, Integer value2) {
            addCriterion("to_skill_id between", value1, value2, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_skill_id not between", value1, value2, "toSkillId");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleIsNull() {
            addCriterion("to_skill_title is null");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleIsNotNull() {
            addCriterion("to_skill_title is not null");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleEqualTo(String value) {
            addCriterion("to_skill_title =", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleNotEqualTo(String value) {
            addCriterion("to_skill_title <>", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleGreaterThan(String value) {
            addCriterion("to_skill_title >", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleGreaterThanOrEqualTo(String value) {
            addCriterion("to_skill_title >=", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleLessThan(String value) {
            addCriterion("to_skill_title <", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleLessThanOrEqualTo(String value) {
            addCriterion("to_skill_title <=", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleLike(String value) {
            addCriterion("to_skill_title like", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleNotLike(String value) {
            addCriterion("to_skill_title not like", value, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleIn(List<String> values) {
            addCriterion("to_skill_title in", values, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleNotIn(List<String> values) {
            addCriterion("to_skill_title not in", values, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleBetween(String value1, String value2) {
            addCriterion("to_skill_title between", value1, value2, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andToSkillTitleNotBetween(String value1, String value2) {
            addCriterion("to_skill_title not between", value1, value2, "toSkillTitle");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade
     *
     * @mbg.generated do_not_delete_during_merge Fri Apr 19 11:32:55 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
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