package com.test.spring;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hpatil on 6/23/16.
 */
@XmlRootElement(name="Dummy")
public class Dummy {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String name="Dummy Response";
    private String value="Test Response";

}
