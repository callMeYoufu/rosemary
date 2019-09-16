package com.jiangnan.entity.common;

/**
 * @CalssName Base
 * @Description 项目基础实体包含了实体必须字段(不包含树形结构)
 * @Author grolia 1421764055@qq.com
 * @Date 2019/9/169:32
 * @Version 1.0
 **/
public class Base {
    /**
     *  为批量操作做准备
     */
    private String[] ids;

    /**
     *  创建用户
     */
    private  Integer createUser;

    /**
     *  创建时间
     */
    private  String createTime;

    /**
     * 创建用户IP
     */
    private  String createUserIp;

    /**
     * 创建用户终端类型
     */
    private  String createTerminalType;

    /**
     *  修改用户
     */
    private  Integer updateUser;

    /**
     * 修改时间
     */
    private  String  updateTime;

    /**
     * 修改用户IP
     */
    private String updateUserIp;

    /**
     * 修改用户终端类型
     */
    private String updateTerminalType;

    /**
     * 排序编码
     */
    private Integer sortNum;

    /**
     * 业务状态
     */
    private Integer dataStatus;

    /**
     * 删除状态
     */
    private Integer deleteStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 行为操作
     */
    private  String  operation;

    /**
     * 行号
     */
    private Integer lineNo;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 修改人名称
     */
    private String updateUserName;


    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserIp() {
        return createUserIp;
    }

    public void setCreateUserIp(String createUserIp) {
        this.createUserIp = createUserIp;
    }

    public String getCreateTerminalType() {
        return createTerminalType;
    }

    public void setCreateTerminalType(String createTerminalType) {
        this.createTerminalType = createTerminalType;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserIp() {
        return updateUserIp;
    }

    public void setUpdateUserIp(String updateUserIp) {
        this.updateUserIp = updateUserIp;
    }

    public String getUpdateTerminalType() {
        return updateTerminalType;
    }

    public void setUpdateTerminalType(String updateTerminalType) {
        this.updateTerminalType = updateTerminalType;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
}
