package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Lesson_2 {

	public static void main(String[] args) {
        try{
            //FileWrite object creation to write a file
            FileWriter wr=new FileWriter("E:\\Wile Training\\File Handling\\input.txt");
            wr.write("Java is a good programming language");
            wr.close();
            System.out.println("Successfully wrote");
        }
        catch (IOException e){
            System.out.println("An error occured");
            System.out.println(e.getMessage());
        }
       // Note: if the above file does not exist already a new file will be automatically created
        // if we write something from here in the file, whatever is written already in the file will be replaced by this one

	}

}
