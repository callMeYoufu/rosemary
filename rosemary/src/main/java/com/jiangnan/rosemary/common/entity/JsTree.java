package com.jiangnan.rosemary.common.entity;

import java.util.List;

/**
 * @CalssName JsTree
 * @Description  jsTree
 * @Author grolia 1421764055@qq.com
 * @Date 2019/9/1615:21
 * @Version 1.0
 **/
public class JsTree {

    private Integer id;

    private Integer pid;

    private String  icon;

    private String  title;

    private String text;

    private List<JsTree> chlidren;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<JsTree> getChlidren() {
        return chlidren;
    }

    public void setChlidren(List<JsTree> chlidren) {
        this.chlidren = chlidren;
    }
}
