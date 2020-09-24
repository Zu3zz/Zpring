package com.zth.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author 3zZ.
 * Date: 2020/9/25.
 */
@Data
public class HeadLine {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
}

