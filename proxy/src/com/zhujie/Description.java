package com.zhujie;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*�Զ���ע����﷨Ҫ��
 * 1.��Ա���������޵ģ��Ϸ������Ͱ���ԭʼ���ͼ�String,Class,Annotation,Enumeration
 * 2.���ע��ֻ��һ����Ա�����Ա������ȡ��Ϊvalue(),��ʹ��ʱ���Ժ��Գ�Ա�����͸�ֵ�ţ�=��
 * 3.ע�������û�г�Ա��û�г�Ա��ע���Ϊ��עע��
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
