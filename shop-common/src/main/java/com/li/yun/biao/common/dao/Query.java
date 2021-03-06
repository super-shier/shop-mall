package com.li.yun.biao.common.dao;

import java.io.Serializable;

public class Query<T> implements Serializable {
    private static final long serialVersionUID = 1930382256159908170L;
    private T queryObject;
    private int start = 0;
    private int limit = 20;
    private OrderBy orderBy;

    public Query() {
    }

    public Query(T queryObject) {
        this.queryObject = queryObject;
    }

    public Query(T queryObject, int start) {
        this.queryObject = queryObject;
        this.start = start;
    }

    public Query(T queryObject, int start, int limit) {
        this.queryObject = queryObject;
        this.start = start;
        this.limit = limit;
    }

    public Query(T queryObject, int start, OrderBy orderBy) {
        this.queryObject = queryObject;
        this.start = start;
        this.orderBy = orderBy;
    }

    public Query(T queryObject, int start, int limit, OrderBy orderBy) {
        this.queryObject = queryObject;
        this.start = start;
        this.limit = limit;
        this.orderBy = orderBy;
    }

    public T getQueryObject() {
        return this.queryObject;
    }

    public void setQueryObject(T queryObject) {
        this.queryObject = queryObject;
    }

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return this.limit == 0 ? 20 : this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public OrderBy getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderByClause() {
        if (this.orderBy != null) {
            String sort = this.orderBy.isDesc() ? " desc" : "asc";
            return this.orderBy.getFieldName() + sort;
        } else {
            return null;
        }
    }

    public String toString() {
        return "Query{queryObject=" + this.queryObject + ", start=" + this.start + ", limit=" + this.limit + ", orderBy=" + this.orderBy + '}';
    }
}

