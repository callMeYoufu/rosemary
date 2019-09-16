package com.jiangnan.entity.common;

/**
 * @CalssName BaseTree
 * @Description  数据库包含树形结构的公共字段对应的属性，如果业务数据库表中包含树形结构继承该类
 * @Author grolia 1421764055@qq.com
 * @Date 2019/9/1610:35
 * @Version 1.0
 **/
public class BaseTree  extends Base{

    /**
     * 树层级
     */
    private Integer treeLevel;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 父Name
     */
    private String parentName;

    /**
     * 树ID层级关系
     */
    private String treeIdRelation;

    /**
     * 树编码层级关系
     */
    private String treeCodeRelation;

    /**
     * 树名称层级关系
     */
    private String treeNameRelation;

    /**
     * 是否为叶子节点
     */
    private String leafNode;


    public Integer getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(Integer treeLevel) {
        this.treeLevel = treeLevel;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getTreeIdRelation() {
        return treeIdRelation;
    }

    public void setTreeIdRelation(String treeIdRelation) {
        this.treeIdRelation = treeIdRelation;
    }

    public String getTreeCodeRelation() {
        return treeCodeRelation;
    }

    public void setTreeCodeRelation(String treeCodeRelation) {
        this.treeCodeRelation = treeCodeRelation;
    }

    public String getTreeNameRelation() {
        return treeNameRelation;
    }

    public void setTreeNameRelation(String treeNameRelation) {
        this.treeNameRelation = treeNameRelation;
    }

    public String getLeafNode() {
        return leafNode;
    }

    public void setLeafNode(String leafNode) {
        this.leafNode = leafNode;
    }
}
