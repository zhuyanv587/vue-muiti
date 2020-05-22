package com.example.muiti.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
@ApiModel(value = "职位实体类", description = "职位信息描述")
public class Position implements Serializable {

    @ApiModelProperty(value = "职位id")
    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(name, position.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public Position() {

    }

    public Position(String name) {

        this.name = name;
    }

    @ApiModelProperty(value = "职位名称")
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm",timezone = "Asia/Shanghai")
    @ApiModelProperty(value = "职位创建时间")
    private Date createDate;

    @ApiModelProperty(value = "是否启用")
    private Boolean enabled;

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
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}