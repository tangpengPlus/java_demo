package com.gency.subscribe.model.system;

import java.util.Date;

import com.gency.subscribe.model.base.BaseModel;

/**
	* 作者:唐鹏
	* 描述:
	* 版本: version 1.0.0
	* 时间:2017-08-29 14:03:08
  */
public class ManageOptionLog extends BaseModel {
    /**
     * 操作记录数据Id
     * 表字段 : manage_option_log.id
     */
    private Integer id;

    /**
     * 权限数据Id
     * 表字段 : manage_option_log.authorid
     */
    private Integer authorid;

    /**
     * 操作人id
     * 表字段 : manage_option_log.adminId
     */
    private Integer adminid;

    /**
     * 操作时间
     * 表字段 : manage_option_log.createtime
     */
    private Date createtime;

    /**
     * 操作内容
     * 表字段 : manage_option_log.optioncount
     */
    private String optioncount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manage_option_log
     *
     * @mbg.generated Tue Aug 29 14:03:08 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 操作记录数据Id 字段:manage_option_log.id
     *
     * @return manage_option_log.id, 操作记录数据Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 操作记录数据Id 字段:manage_option_log.id
     *
     * @param id the value for manage_option_log.id, 操作记录数据Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 权限数据Id 字段:manage_option_log.authorid
     *
     * @return manage_option_log.authorid, 权限数据Id
     */
    public Integer getAuthorid() {
        return authorid;
    }

    /**
     * 设置 权限数据Id 字段:manage_option_log.authorid
     *
     * @param authorid the value for manage_option_log.authorid, 权限数据Id
     */
    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    /**
     * 获取 操作人id 字段:manage_option_log.adminId
     *
     * @return manage_option_log.adminId, 操作人id
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * 设置 操作人id 字段:manage_option_log.adminId
     *
     * @param adminid the value for manage_option_log.adminId, 操作人id
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * 获取 操作时间 字段:manage_option_log.createtime
     *
     * @return manage_option_log.createtime, 操作时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置 操作时间 字段:manage_option_log.createtime
     *
     * @param createtime the value for manage_option_log.createtime, 操作时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取 操作内容 字段:manage_option_log.optioncount
     *
     * @return manage_option_log.optioncount, 操作内容
     */
    public String getOptioncount() {
        return optioncount;
    }

    /**
     * 设置 操作内容 字段:manage_option_log.optioncount
     *
     * @param optioncount the value for manage_option_log.optioncount, 操作内容
     */
    public void setOptioncount(String optioncount) {
        this.optioncount = optioncount == null ? null : optioncount.trim();
    }
}