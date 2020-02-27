package com.cjw.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2020-02-27 16:33
 */
@Getter
@Setter
public class ReturnData<T> {

    private List<T> rows;
    private int pageNum;
    private int pageSize;
    private int total;

    public ReturnData() {}

    public ReturnData(int pageNum, int pageSize, int total) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.total = total;
    }
}
