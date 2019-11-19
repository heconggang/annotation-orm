package com.hecg.test;

import java.lang.reflect.Field;

import com.hecg.annotation.Property;
import com.hecg.annotation.Table;

/**
 * 功能：通过反射模仿orm，根据实体类获取到对象对应的sql语句
 *
 * @author hecg
 * @version 2019年11月13日
 */
public class StudentAnnotationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// 获取对象
		Class<?> forName = Class.forName("com.hecg.entity.Student");
		// 获取所有的属性
		Field[] fields = forName.getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append("select ");
		for (int i = 0; i < fields.length; i++) {
			// 获取每个属性上面的注解
			Field field = fields[i];
			Property property = field.getDeclaredAnnotation(Property.class);
			if (property == null) {
				continue;
			}
			String propertyName = property.name();
			sb.append(propertyName);
			if (i < fields.length - 1) {
				sb.append(", ");
			}
		}
		sb.append(" from ");
		// 获取table注解，得到表名称
		Table table = forName.getAnnotation(Table.class);
		String tableValue = table.value();
		sb.append(tableValue);
		sb.append(";");
		System.out.println(sb.toString());
	}
}
