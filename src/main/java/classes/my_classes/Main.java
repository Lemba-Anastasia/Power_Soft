package main.java.classes.my_classes;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args){

        System.out.print("Путь к файлу:");
        System.out.println("E:\\Power_Soft\\input.txt");
        MyUtils fileManipulation=new MyUtils();
        try {
            List<TimeWorker> wB= fileManipulation.readFile("E:\\Power_Soft\\input.txt");
            System.out.print("Ответ:"+fileManipulation.giveAnswer(wB));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}