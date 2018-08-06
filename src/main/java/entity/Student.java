package entity;

import java.util.Date;

/**
 * Created by lyx on 2018/7/18.
 */
public class Student {
     private String id;
     private String name;
     private Date birthday;
     private String description;
     private Integer avgscore;


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvgscore(Integer avgscore) {
        this.avgscore = avgscore;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAvgscore() {
        return avgscore;
    }


}
