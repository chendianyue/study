package com.zhujie;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*自定义注解的语法要求
 * 1.成员类型是受限的，合法的类型包括原始类型及String,Class,Annotation,Enumeration
 * 2.如果注解只有一个成员，则成员名必须取名为value(),在使用时可以忽略成员的名和赋值号（=）
 * 3.注解类可以没有成员，没有成员的注解称为标注注解
 * 
 * 
 * */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {
	String value();
//	String author();
//	int age() default 18;
	

}
