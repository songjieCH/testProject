package com.song.mybatisX.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 航次
 */
@TableName(value ="vslvoyage")
@Data
public class Vslvoyage implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String gkey;

    /**
     * 船号（艘次）
     */
    private String visitGkey;

    /**
     * 艘次号
     */
    private String voyageNbr;

    /**
     * 进出口标志
     */
    private String impExpId;

    /**
     * 货重
     */
    private BigDecimal cargoWgt;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 删除标志
     */
    private Integer delFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}