package file_handling;
/*
 * Reading from a file (reading line by line)
 * -- create a object of file class and put location of file in its argument
 * -- create object of Scanner Class and put file object in its argument
 * -- use nextLine method of scanner object to read the lines while file has next line present
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lesson_3 {

	public static void main(String[] args) {
		try {
        File fileObject=new File("E:\\Wile Training\\File Handling\\input.txt");
        Scanner myReader=new Scanner(fileObject);
        while(myReader.hasNextLine()){
            String data=myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
    catch (IOException e){
        System.out.println("An error occured");
    }

}
}
