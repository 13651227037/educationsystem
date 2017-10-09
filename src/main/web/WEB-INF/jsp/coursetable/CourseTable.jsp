<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>课程表显示</title>
    <jsp:include page="../basic.jsp"></jsp:include>
    <script type="text/javascript">
        $(function () {

            $("#queryCourseTable").datagrid({
                url: "${pageContext.request.contextPath}/CourseTables/selectCoruseTableAll.controller",
                method: "post",


                /*pagination:true,*/
                title: '课程表',
//                queryParams{3},
//                fitColumns: true, //自适应列宽
//                singleSelect: true,  //是否单选

                columns: [[
                    {field: 'weekName', title: 'zhou', width: 100, align: 'center', rowspan: 2},
                    {field: 'dateTime', title: 'riqiid', width: 100, align: 'center', rowspan: 2},
                    {field: 'clsssroomName', title: 'jaoshi', width: 90, align: 'center', rowspan: 2},
                    {title: 'c组', colspan: 3},
                    {title: 'a组', colspan: 3},
                    {title: 'r组', colspan: 3},
                    {title: 't组', colspan: 3}
                ], [

                    {field: 'chapterName', title: '课程', width: 120, rowspan: 1,
                    formatter:function (row,value) {
                        return value.voMap.a0.chapterName
                    }
                    },
                    {field: 'gradeName', title: '班级编号', width: 220, rowspan: 1, sortable: true,
                        formatter:function (row,value) {
                            return value.voMap.a0.gradeName
                        }
                    },
                    {field: 'steacherName', title: '教员姓名', width: 150, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a0.steacherName
                        }
                    },


                    {field: 'chapterName1', title: '课程', width: 120, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a1.chapterName
                        }
                        },
                    { field: 'gradeName1', title: '班级编号', width: 220, rowspan: 1, sortable: true,
                        formatter:function (row,value) {
                            return value.voMap.a1.gradeName
                        }

                    },
                    {field: 'steacherName1', title: '教员姓名', width: 150, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a1.steacherName
                        }

                    },


                    {field: 'chapterName2', title: '课程', width: 120, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a2.chapterName
                        }
                    },
                    {
                        field: 'gradeName2', title: '班级编号', width: 220, rowspan: 1, sortable: true,
                        formatter:function (row,value) {
                            return value.voMap.a2.gradeName
                        }

                    },
                    {field: 'steacherName2', title: '教员姓名', width: 150, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a2.steacherName
                        }

                    },


                    {field: 'chapterName3', title: '课程', width: 120, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a3.chapterName
                        }

                    },
                    {
                        field: 'gradeName3', title: '班级编号', width: 220, rowspan: 1, sortable: true,
                        formatter:function (row,value) {
                            return value.voMap.a3.gradeName
                        }

                    },
                    {field: 'steacherName3', title: '教员姓名', width: 150, rowspan: 1,
                        formatter:function (row,value) {
                            return value.voMap.a3.steacherName
                        }

                    }


                ]]


            });


        })
        //datagrid加载完后合并指定单元格
        function mergeCellss(data) {
            var arr = [{mergeFiled: "weekName", premiseFiled: "PROJECTID"},    //合并列的field数组及对应前提条件filed（为空则直接内容合并）
                {mergeFiled: "dateTime", premiseFiled: "PROJECTID"}
            ];
            var dg = $("#queryCourseTable");   //要合并的datagrid中的表格id
            var rowCount = dg.datagrid("getRows").length;
            var cellName;
            var span;
            var perValue = "";
            var curValue = "";
            var perCondition = "";
            var curCondition = "";
            var flag = true;
            var condiName = "";
            var length = arr.length - 1;
            for (i = length; i >= 0; i--) {
                cellName = arr[i].mergeFiled;
                condiName = arr[i].premiseFiled;
                if (condiName.length > 0) {
                    flag = false;
                }
                perValue = "";
                perCondition = "";
                span = 1;
                for (row = 0; row <= rowCount; row++) {
                    if (row == rowCount) {
                        curValue = "";
                        curCondition = "";
                    } else {
                        curValue = dg.datagrid("getRows")[row][cellName];
                        /*if(cellName=="ORGSTARTTIME"){//特殊处理这个时间字段
                         curValue =formatDay(dg.datagrid("getRows")[row][cellName],"");
                         }*/
                        if (!flag) {
                            curCondition = dg.datagrid("getRows")[row][condiName];
                        }
                    }
                    if (perValue == curValue && (flag || perCondition == curCondition)) {
                        span += 1;
                    } else {
                        var index = row - span;
                        dg.datagrid('mergeCells', {
                            index: index,
                            field: cellName,
                            rowspan: span,
                            colspan: null
                        });
                        span = 1;
                        perValue = curValue;
                        if (!flag) {
                            perCondition = curCondition;
                        }
                    }
                }
            }
        }


    </script>
</head>
<body>
<div>
    <table id="queryCourseTable" data-options="onLoadSuccess:mergeCellss"></table>
</div>
</body>
</html>
