package com.jiangnan.rosemary.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @CalssName SelectTree
 * @Description TODO
 * @Author grolia 1421764055@qq.com
 * @Date 2019/9/1615:29
 * @Version 1.0
 **/
public class SelectTree  implements Serializable {


    private static final long serialVersionUID = 4485211220430553737L;

    private Integer id;

    private String name;

    private boolean open;

    private boolean checked;

    private Integer level;

    private List<SelectTree> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<SelectTree> getChildren() {
        return children;
    }

    public void setChildren(List<SelectTree> children) {
        this.children = children;
    }
}
