package com.myself;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Validator<T> {

    T t;

    // 有参构造
    public Validator(T t){
        this.t = t;
    }

    // of new 对象

//    public static <T> Validator<T> of(T t) {
//        return new Validator<>(t);
//    }
    public static <T> Validator<T> of(T t){
        return new Validator<T>(t);
    }

    public List<Throwable> throwableList = new ArrayList<Throwable>();


    /**
     * 校验，如果校验不通过，则new 异常，并携带msg
     *
     */

    public Validator<T> validate(Predicate<T> validation, String message) {
        if (!validation.test(t)) {
            throwableList.add(new IllegalStateException(message));
        }
        return this;
    }

    public <U> Validator<T> validate(Function<T, U> projection, Predicate<U> validation,
                                     String message) {
        return validate(projection.andThen(validation::test)::apply, message);
    }



    public T get(){
        if(throwableList.isEmpty()){
            return t;
        }

        IllegalArgumentException exception = new IllegalArgumentException();
        throwableList.forEach(exception::addSuppressed);

        throw exception;
    }










}
