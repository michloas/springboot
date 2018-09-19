package com.michloas.springboot.pojo;

;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Created by michloas on 2018/9/19.
 */

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Student {

    private String name;
    private int age;
    private String male;
    private String studentNo;
}
