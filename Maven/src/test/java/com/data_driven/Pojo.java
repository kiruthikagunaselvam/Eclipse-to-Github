package com.data_driven;

public class Pojo {
public static void main(String[] args) {
	 Pojo_A s = new Pojo_A();
	 int age= s.getAge();
	 System.out.println(age);
	 
	 s.setAge(35);
	 int age2 = s.getAge();
	 System.out.println(age2);
}
}
