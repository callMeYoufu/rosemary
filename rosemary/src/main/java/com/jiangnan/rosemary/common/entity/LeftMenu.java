package com.jiangnan.rosemary.common.entity;

import com.sun.source.doctree.SerialDataTree;

import java.io.Serializable;
import java.util.List;

/**
 * @CalssName LeftMenu
 * @Description 左侧菜单
 * @Author grolia 1421764055@qq.com
 * @Date 2019/9/1615:22
 * @Version 1.0
 **/
public class LeftMenu implements Serializable {

    private static final long serialVersionUID = -4580530060591287284L;

    private Integer id;

    private Integer pid;

    private String title;

    private String font;

    private String  icon;

    private String url;

    private String param;

    private String condition;

    private boolean spread;

    private List<LeftMenu> chlidren;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    public List<LeftMenu> getChlidren() {
        return chlidren;
    }

    public void setChlidren(List<LeftMenu> chlidren) {
        this.chlidren = chlidren;
    }
}
