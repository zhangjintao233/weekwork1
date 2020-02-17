package com.itdr.pojo;

public class Users {
    private Integer id;
    private String name;
    private String mim;


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

    public String getMim() {
        return mim;
    }

    public void setMim(String mim) {
        this.mim = mim;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mim='" + mim + '\'' +
                '}';
    }
}
