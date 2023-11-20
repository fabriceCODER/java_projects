package org.example;

import java.io.*;

public class WriterReader {
    public static void main(String[] args){
        Student s1 = new Student("Mike",17,"Male");
        Student s2 = new Student("Peter",18,"Male");

        try{
            FileOutputStream f = new FileOutputStream(new File("studentObject.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(s1);
            o.writeObject(s2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("studentObject.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Student sr1 = (Student) oi.readObject();
            Student sr2 = (Student) oi.readObject();

            System.out.println(sr1.toString());
            System.out.println(sr2.toString());


            oi.close();
            fi.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Error while initializing the stream");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
