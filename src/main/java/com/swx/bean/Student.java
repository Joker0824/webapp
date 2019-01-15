package com.swx.bean;

import java.util.Objects;

public class Student {
  private String name;
  private String address;
  private int age;

  public Student() {
  }

  public Student(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student)) return false;
    Student student = (Student) o;
    return getAge() == student.getAge() &&
            getName().equals(student.getName()) &&
            getAddress().equals(student.getAddress());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAddress(), getAge());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", age=" + age +
            '}';
  }
}
