package com.example.demo.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PmsProductAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductAttributeExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdIsNull() {
            addCriterion("product_attribute_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdIsNotNull() {
            addCriterion("product_attribute_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdEqualTo(Long value) {
            addCriterion("product_attribute_category_id =", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdNotEqualTo(Long value) {
            addCriterion("product_attribute_category_id <>", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdGreaterThan(Long value) {
            addCriterion("product_attribute_category_id >", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_attribute_category_id >=", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdLessThan(Long value) {
            addCriterion("product_attribute_category_id <", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("product_attribute_category_id <=", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdIn(List<Long> values) {
            addCriterion("product_attribute_category_id in", values, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdNotIn(List<Long> values) {
            addCriterion("product_attribute_category_id not in", values, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdBetween(Long value1, Long value2) {
            addCriterion("product_attribute_category_id between", value1, value2, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("product_attribute_category_id not between", value1, value2, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIsNull() {
            addCriterion("select_type is null");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIsNotNull() {
            addCriterion("select_type is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTypeEqualTo(Integer value) {
            addCriterion("select_type =", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotEqualTo(Integer value) {
            addCriterion("select_type <>", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeGreaterThan(Integer value) {
            addCriterion("select_type >", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("select_type >=", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLessThan(Integer value) {
            addCriterion("select_type <", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("select_type <=", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIn(List<Integer> values) {
            addCriterion("select_type in", values, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotIn(List<Integer> values) {
            addCriterion("select_type not in", values, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeBetween(Integer value1, Integer value2) {
            addCriterion("select_type between", value1, value2, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("select_type not between", value1, value2, "selectType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNull() {
            addCriterion("input_type is null");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNotNull() {
            addCriterion("input_type is not null");
            return (Criteria) this;
        }

        public Criteria andInputTypeEqualTo(Integer value) {
            addCriterion("input_type =", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotEqualTo(Integer value) {
            addCriterion("input_type <>", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThan(Integer value) {
            addCriterion("input_type >", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_type >=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThan(Integer value) {
            addCriterion("input_type <", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThanOrEqualTo(Integer value) {
            addCriterion("input_type <=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIn(List<Integer> values) {
            addCriterion("input_type in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotIn(List<Integer> values) {
            addCriterion("input_type not in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeBetween(Integer value1, Integer value2) {
            addCriterion("input_type between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("input_type not between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputListIsNull() {
            addCriterion("input_list is null");
            return (Criteria) this;
        }

        public Criteria andInputListIsNotNull() {
            addCriterion("input_list is not null");
            return (Criteria) this;
        }

        public Criteria andInputListEqualTo(String value) {
            addCriterion("input_list =", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotEqualTo(String value) {
            addCriterion("input_list <>", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListGreaterThan(String value) {
            addCriterion("input_list >", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListGreaterThanOrEqualTo(String value) {
            addCriterion("input_list >=", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListLessThan(String value) {
            addCriterion("input_list <", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListLessThanOrEqualTo(String value) {
            addCriterion("input_list <=", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListLike(String value) {
            addCriterion("input_list like", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotLike(String value) {
            addCriterion("input_list not like", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListIn(List<String> values) {
            addCriterion("input_list in", values, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotIn(List<String> values) {
            addCriterion("input_list not in", values, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListBetween(String value1, String value2) {
            addCriterion("input_list between", value1, value2, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotBetween(String value1, String value2) {
            addCriterion("input_list not between", value1, value2, "inputList");
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