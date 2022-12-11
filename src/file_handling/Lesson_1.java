package file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Lesson_1 {

	public static void main(String[] args) throws IOException {
		//If destination file do not exist: then that file will be automatically created and contents are copied in it
		//Files.copy(Path.of("E:\\Wile Training\\File Handling\\input.txt"),Path.of("E:\\Wile Training\\File Handling\\output.txt"));
		
		
		//If destination file already exists
		Files.copy(Path.of("E:\\Wile Training\\File Handling\\input.txt"),Path.of("E:\\Wile Training\\File Handling\\output.txt"),StandardCopyOption.REPLACE_EXISTING);
         System.out.println("copied");
         
         //To check if a file (by giving the location of the file) exists or not
//         File file = new File("E:\\Wile Training\\File Handling\\output.txt");
//		if(file.exists()) {
//			System.out.println("File exists");
//			
//		}else {
//			System.out.println("File doesn't exits");
//		}

	}

}
