// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestReflection.java

package testReflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class TestReflection {
	//创建Class的三种方式
	@Test
	public void test1(){
		//方式一
		Class class1 = Student.class;
		System.out.println(class1.toString());
		
		System.out.println();
		
		//方式二
		String className = "testReflection.Student";
		try {
			Class class2 = Class.forName(className);
			System.out.println(class2.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//方式三
		Student s = new Student();
		Class class3 = s.getClass();
		System.out.println(class3.toString());
	}
	
	//利用Class创建类对象
	@Test
	public void test2(){
		String className = "testReflection.Student";
		Class class1;
		try {
			class1 = Class.forName(className);
			
			//调用无参构造器创建类对象
			Object obj = null;
			try {
				obj = class1.newInstance();
				if(obj instanceof Student){
					Student student1 = (Student)obj;
					System.out.println(student1.toString());
				}
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
			//调用指定参数的构造器创建类对象
			try {
				Constructor cons1 = class1.getConstructor(int.class);
				try {
					obj = cons1.newInstance(1);
					if(obj instanceof Student){
						Student student2 = (Student)obj;
						System.out.println(student2.toString());
					}
				} catch (InstantiationException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			//调用指定参数的构造器创建类对象2
			try {
				Constructor cons2 = class1.getConstructor(String.class, int.class, int.class);
				try {
					obj = cons2.newInstance("A",12,2);
					if(obj instanceof Student){
						Student student3 = (Student)obj;
						System.out.println(student3.toString());
					}
				} catch (InstantiationException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//利用Class获得类的属性
	@Test
	public void test3(){
		
		String className = "testReflection.Student";
		try {
			Class class1 = Class.forName(className);
			//获得只属于本类的所有属性（包括private类型）
			Field[] fields1 = class1.getDeclaredFields();
			String modifiers = null;
			Class fieldType = null;
			for(int i=0;i<fields1.length;i++){
				modifiers = Modifier.toString(fields1[i].getModifiers());
				fieldType = fields1[i].getType();
				if (modifiers.length()>0) {
					System.out.println(modifiers+ " " + fieldType.getName().toString() + " " +fields1[i].getName().toString());
				}else {
					System.out.println(fieldType.getName().toString() + " " +fields1[i].getName().toString());
				}
			}
			
			System.out.println();
			
			//只获得本类和父类的所有public属性（不允许private和缺省类型）
			Field[] fields2 = class1.getFields();
			String modifiers2 = null;
			Class fieldType2 = null;
			for(int i=0;i<fields2.length;i++){
				modifiers2 = Modifier.toString(fields2[i].getModifiers());
				fieldType2 = fields2[i].getType();
				if(modifiers2.length()>0){
					System.out.println(modifiers2 + " " + fieldType2.getName().toString() + " " + fields2[i].getName().toString());
				}else {
					System.out.println(fieldType2.getName().toString() + " " + fields2[i].getName().toString());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	//利用Class获得类的构造器
	@Test
	public void test4(){
		Class class1 = Student.class;
		//获得本类所有的public构造器（不包括private和缺省 类型的，注意不包含父类构造器）
		Constructor[] constructors = class1.getConstructors();
		String modifiers = null;
		Class[] parameterTypes = null; 
		for (int i = 0; i < constructors.length; i++) {
			modifiers = Modifier.toString(constructors[i].getModifiers());
			parameterTypes = constructors[i].getParameterTypes();
			if (modifiers.length()>0) {
				System.out.print(modifiers + " " + constructors[i].getName().toString());				
			}else{
				System.out.print(constructors[i].getName().toString());
			}			
			System.out.print("(");
			for (int j = 0; j < parameterTypes.length; j++) {
				if(j>0){
					System.out.print(", ");
				}
				System.out.print(parameterTypes[j].getName().toString());
			}
			System.out.println(");");
		}
		
		System.out.println();
		
		//获得本类所有的构造器（包括private类型的构造器，不包括父类构造器）
		Constructor[] constructors2 = class1.getDeclaredConstructors();
		String modifiers2 = null;
		Class[] parameterTypes2 = null;
		for (int i = 0; i < constructors2.length; i++) {
			modifiers2 = Modifier.toString(constructors2[i].getModifiers());
			parameterTypes2 = constructors2[i].getParameterTypes();
			if (modifiers2.length()>0) {
				System.out.print(modifiers2 + " " + constructors2[i].getName().toString());
			}else{
				System.out.print(constructors2[i].getName().toString());
			}
			System.out.print("(");
			for (int j = 0; j < parameterTypes2.length; j++) {
				if(j>0){
					System.out.print(", ");
				}
				System.out.print(parameterTypes2[j].getName().toString());
			}
			System.out.println(");");
		}
		
		System.out.println();
		
		//获得本类某个特定参数的构造器
		try {
			Constructor constructor = class1.getConstructor(String.class, int.class, int.class);
			String modifier = Modifier.toString(constructor.getModifiers());
			Class[] parameterTypes3 = constructor.getParameterTypes();
			if(modifier.length()>0){
				System.out.print(modifier + " " + constructor.getName().toString());
			}else {
				System.out.print(constructor.getName().toString());
			}
			System.out.print("(");
			for (int i = 0; i < parameterTypes3.length; i++) {
				if(i>0){
					System.out.print(", ");
				}
				System.out.print(parameterTypes3[i].getName().toString());
			}
			System.out.print(")");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	//利用Class获得类的方法
	@Test
	public void test5(){
		String className = "testReflection.Student";
		try {
			Class class1 = Class.forName(className);
			//获得类的所有类型的方法，不包括父类和构造方法
			Method[] methods = class1.getDeclaredMethods();
			String modifiers = null;
			Class returnType = null;
			Class[] parameters = null;
			for (int i = 0; i < methods.length; i++) {
				modifiers = Modifier.toString(methods[i].getModifiers());
				returnType = methods[i].getReturnType();
				parameters = methods[i].getParameterTypes();
				System.out.print(modifiers + " " + returnType + " " + methods[i].getName().toString() + "(");
				for (int j = 0; j < parameters.length; j++) {
					if(j>0){
						System.out.print(", ");
					}
					System.out.print(parameters[j].getName().toString());
				}
				System.out.println(");");
			}
			
			System.out.println();
			
			//获得类的所有的方法，包括父类，不包括构造方法
			Method[] methods1 = class1.getMethods();
			String modifiers1 = null;
			Class returnType1 = null;
			Class[] parameters1 = null;
			for (int i = 0; i < methods1.length; i++) {
				modifiers1 = Modifier.toString(methods1[i].getModifiers());
				returnType1 = methods1[i].getReturnType();
				parameters1 = methods1[i].getParameterTypes();
				System.out.print(modifiers1 + " " + returnType1 + " " + methods1[i].getName().toString() + "(");
				for (int j = 0; j < parameters1.length; j++) {
					if(j>0){
						System.out.print(", ");
					}
					System.out.print(parameters1[j].getName().toString());
				}
				System.out.println(");");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//利用Class打印类的定义结构，类的主体打印参见上面打印类的构造器，属性和方法
	@Test
	public void test6(){
		String className = "testReflection.Student";
		try {
			Class class1 = Class.forName(className);
			String modifiers = Modifier.toString(class1.getModifiers());
			Class fatherClass = class1.getSuperclass();
			Class[] interfaceClasses = class1.getInterfaces();
			System.out.print(modifiers + " class " + class1.getName().toString());
			if(fatherClass != null && fatherClass != Object.class){
				System.out.print(" extends " + fatherClass);
			}
			if (interfaceClasses != null) {
				System.out.print(" interface ");
				for (int i = 0; i < interfaceClasses.length; i++) {
					System.out.print(interfaceClasses[i].getName().toString());
				}
			}
			System.out.println("{ }");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//测试序列化Student功能
	@Test
	public void test7() throws FileNotFoundException{
		try {
			Student student = (Student)Class.forName("testReflection.Student").getConstructor(String.class, int.class, int.class).newInstance("LEE",23,1);
			FileOutputStream fos = new FileOutputStream("Student.txt");
			FileInputStream fis = new FileInputStream("Student.txt");
			ObjectOutputStream oos = null;
			ObjectInputStream ois = null;
			try {
				oos = new ObjectOutputStream(fos);
				oos.writeObject(student);
				ois =  new ObjectInputStream(fis);
				Object object = ois.readObject();
				Student student2 = null;
				if(object instanceof Student){
					student2 = (Student)object;
					System.out.println(student2.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					ois.close();
					oos.close();
					fis.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
