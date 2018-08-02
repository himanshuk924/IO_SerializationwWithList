package serializationndlist;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class WritingArrayListIntoFile {

	public static void main(String[] args) {
		
		ArrayList<MyClass> listwrite = new ArrayList<>();
		ArrayList<MyClass> listfetch = new ArrayList<>();
		listwrite.add(new MyClass("hk", 2000));
		listwrite.add(new MyClass("rn", 1000));
		listwrite.add(new MyClass("ad", 3000));
		listwrite.add(new MyClass("ss", 2000));
		listwrite.add(new MyClass("kk", 2000));
		
		//writing list to file employee.ser
		try (FileOutputStream fileOutputStream = new FileOutputStream("Myclass.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
				objectOutputStream.writeObject(listwrite);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//fetching object from file employee.ser
		try (FileInputStream fileInputStream = new FileInputStream("Myclass.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
			listfetch = (ArrayList) objectInputStream.readObject();
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		listfetch.stream().forEach(System.out::println);
	}

}
