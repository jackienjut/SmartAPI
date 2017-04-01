package com.jackie.smartapi.Model;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */
public class Project {
    public int id;
    public String name;
    public String creator;
    public String createtime;
    public String note;

    public Project(){}

    public Project(int id, String name, String creator, String createtime, String note) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.createtime = createtime;
        this.note = note;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
