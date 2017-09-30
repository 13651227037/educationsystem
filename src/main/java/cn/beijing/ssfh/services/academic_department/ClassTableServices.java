package cn.beijing.ssfh.services.academic_department;

import cn.beijing.ssfh.entity.DateTime;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2017/9/25 0025.
 * Author 武云峰
 */
public interface ClassTableServices {
    public Integer saveClassTable();
    public Calendar getStartDate();
    public Integer saveNextWeekDateTime(List<DateTime> dates);
}
