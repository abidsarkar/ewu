package CodeForProjectCSE110;
import java.io.*;
import java.util.ArrayList;

public class saveFile {
    void write(ArrayList<Car> cars){
        try{
            FileOutputStream writeData = new FileOutputStream("cars.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(cars);
            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    ArrayList<Car> read(){
        ArrayList<Car> cars = null;
        try{
            FileInputStream readData = new FileInputStream("cars.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            cars = (ArrayList<Car>) readStream.readObject();
            readStream.close();
            System.out.println("File loaded successfully");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }
}