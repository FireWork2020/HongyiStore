package per.gyx.hongyistore.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int id;
    private String imgName;
    private String name;
    private int parentId;
    private Boolean isParent;
    private List<Menu> children;

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public List<Menu> getChildren() {
        if(children == null){
            children = new ArrayList<>();
        }
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
