package com.example;

public class Main {
    public static void main(String[] args) {
        // 创建学生对象
        // Student student1 = new Student("张三", 18, "S001");
        // Student student2 = new Student("李四", 19, "S002");
        // Student student3 = new Student("王五", 18, "S003");

        // 创建教师对象
        // Teacher teacher = new Teacher("赵老师", "数学");

        // 添加学生到教师班级
        // teacher.addStudent(student1);
        // teacher.addStudent(student2);
        // teacher.addStudent(student3);

        // 输出教师和学生信息
        // System.out.println("教师信息: " + teacher);
        // System.out.println("根据学号查找学生: " + teacher.findStudentById("S002"));
        // System.out.println("查找年龄为18岁的学生: " + teacher.getStudentsByAge(18));

        // 输出Java版本信息
        System.out.println("\nJava版本信息:");
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        
        // 输出Maven相关信息（通过系统属性）
        System.out.println("\n构建工具信息:");
        System.out.println("当前为Maven项目，但无法在运行时直接获取Maven版本信息");
    }
}