package com.study.web.vo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TestVo {

    private String id;
    private String name;

    //기존의 Getter Setter는 lombok의 어노테이션으로 대체 가능하다
    /*public TestVo(){

    }

    public TestVo(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestVo testVo = (TestVo) o;
        return id.equals(testVo.id) && name.equals(testVo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "TestVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }*/
}
