package com.jd.autot.domain;

import java.util.Date;

public class TestCaseItem {

    private Integer id;

    private String params;

    private Date startTime;

    private Date endTime;

    private Long executeTime;

    private String executePerson;

    private Boolean executeResult;

    // 是否数据库回滚
    private Boolean rollback;
}
