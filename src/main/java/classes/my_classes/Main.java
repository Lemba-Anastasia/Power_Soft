package main.java.classes.my_classes;

import java.io.FileNotFoundException;

/**
 * Created by Lemba on 10.08.2018.
 */
public class Main {
    public static void main(String[] args){

        System.out.print("Путь к файлу:");
        System.out.println("E:\\Power_Soft\\input.txt");
        myFileManipulation fileManipulation=new myFileManipulation();
        try {
            WorkerBase wB= fileManipulation.readFile("E:\\Power_Soft\\input.txt");
            System.out.print("Ответ:"+fileManipulation.giveAnswer(wB));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
