package com.mianshi.test.serial;

import java.io.*;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public class Student implements Externalizable {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private Address address;

    public Student(Address address, String name, int age){
        this.address = address;
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age){
        this.address = new Address("福建省","漳州市", "中国");
        this.name = name;
        this.age = age;
    }

    public Student(){}

    @Override
    public String toString() {
        String res = "年龄: " +age +", 名字: "+name +", 地址: " +address;
        return res;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age =  in.readInt();
    }
}
