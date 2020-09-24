package com.zth.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author 3zZ.
 * Date: 2020/9/25.
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
