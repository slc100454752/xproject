package com.slc.XProject.utils;

import java.lang.reflect.Field;

public class PojoUtils {
	/**
	 * 相同pojo进行属性比较，全部相同返回true，不同返回false;
	 * 
	 * @param o1
	 * @param o2
	 * @param p1
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static <T> boolean contrastPojo(T o1, T o2, Class<T> p1)
			throws IllegalArgumentException, IllegalAccessException {

		Field[] fields = p1.getDeclaredFields();
		int count = fields.length;

		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			String type = fields[i].getGenericType().toString();
			if(fields[i].getName().equals("id")||fields[i].getName().equals("seasonsId")) {
				count--;
				continue;
			}
			if (!type.equals("class java.lang.String")) {
				
				if (fields[i].get(o1) == fields[i].get(o2)) {
					 
					count--;
				}
			} else {
				
				if(fields[i].get(o1) ==(fields[i].get(o2))) {
					count--;
				}else {
					if (fields[i].get(o1) .equals(fields[i].get(o2)) ) {
						
						count--;
					}
				}
				
			}
			

		}
		System.out.println(count);
		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}
}
