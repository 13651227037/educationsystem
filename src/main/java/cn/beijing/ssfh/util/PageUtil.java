package cn.beijing.ssfh.util;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by thinkpad on 2017/9/4.
 */
public class PageUtil<T> {
    private Long total;
    private List<T> rows;

    @Override
    public String toString() {
        return "PageUtil{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public PageUtil(PageInfo<T> pageInfo){
        this.total=pageInfo.getTotal();
        this.rows=pageInfo.getList();
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

    public PageUtil() {

    }
}
