package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

    public class DeserializeStudent {
        public static void main(String[] args) {
            try {
                // Open a FileInputStream to read the binary data
                FileInputStream fileIn = new FileInputStream("studentObject.txt");

                // Create an ObjectInputStream to read the object
                ObjectInputStream in = new ObjectInputStream(fileIn);

                // Deserialize the object
                Student student = (Student) in.readObject();

                // Close the streams
                in.close();
                fileIn.close();

                // Access the attributes of the deserialized object
                int age = student.getAge();
                String gender = student.getGender();
                String name = student.getName();

                // Do something with the data
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



