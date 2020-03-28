package com.mianshi.test.serial;

import java.io.*;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public class SerializeableMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("吴溢豪",18);
        String path = ".";
        File file = new File(path+File.separator + ".dat");
        write(file, student);
        Student stu = (Student) read(file);
        System.out.println(stu);
        scanner.close();
    }

    public static Object read(File file){
        ObjectInputStream ois = null;
        try {
            FileInputStream fileInputStream  = new FileInputStream(file);
            ois = new ObjectInputStream(fileInputStream);
            Object object = ois.readObject();
            ois.close();
            return object;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }

    public static void write(File file, Object object){
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject((Student)object);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
