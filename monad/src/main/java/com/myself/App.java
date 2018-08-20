package com.myself;

import java.util.Objects;

public class App {

    public static void main(String[] args) {

        User user = new User("liu", 18, Sex.FEMALE,"582@qq.com");

        Validator.of(user)
                .validate(User::getName, name -> name.startsWith("a") , "不是以a开头！")
                .validate(User::getAge , age -> age > 20, "年龄不得小于20")
                .validate(User::getSex,  sex -> Sex.MALE == sex, "不是男生")
                .validate(User::getEmail, email -> email.indexOf("@") >= 0, "email不合法").get().toString();


    }
}
