package com.gyc.creational;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

        //        new Thread(new T()).start();
//        new Thread(new T()).start();
//        System.out.println("主线程结束");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single-file"));
//        oos.writeObject(instance);
//        File file = new File("single-file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//        Class objectClass = LazySingleton.class;
//        Constructor constructor = (Constructor) objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        //获取实例和反射实例先后顺序不一样，结果也不一样
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();


//        EnumInstance instance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single-file"));
//        oos.writeObject(instance);
//        File file = new File("single-file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        //枚举序列化测试
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single-file"));
//        oos.writeObject(instance);
//        File file = new File("single-file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

//        // 枚举无法进行反射攻击
//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        constructor.newInstance("Sam",666);

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();
    }


}
