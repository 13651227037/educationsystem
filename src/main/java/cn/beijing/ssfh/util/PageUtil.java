package cn.beijing.ssfh.util;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by 79414 on 2017/9/4.
 */
public class PageUtil<T> {
    private Long total;
    private List<T> rows;
    public PageUtil(PageInfo<T> pageInfo){
        this.total=pageInfo.getTotal();
        this.rows=pageInfo.getList();
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageUtil(Long total, List<T> rows) {

        this.total = total;
        this.rows = rows;
    }

    public PageUtil() {

    }
}
