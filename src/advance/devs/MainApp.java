package advance.devs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.models.Person;
import advance.dev.models.Student;
import advance.dev.models.Teacher;

public class MainApp {

	public static void main(String[] args) throws IOException {
		IManager manager = new Manager();
		try {
        FileInputStream fis = new FileInputStream("in.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = br.readLine();
        
        while((line= br.readLine()) !=null) {
       	 if (line.indexOf("#sv") >=0) {
    		 String line1 = br.readLine();
    		 String arr1[] = line1.split(":");
    		 String name = arr1[1];
    		 
    		 String line2 = br.readLine();
    		 String arr2[] = line2.split(":");
    		 int old = Integer.parseInt(arr2[1]);
    		 
    		 String line3 = br.readLine();
    		 String arr3[] = line3.split(":");
    		 float diem = Float.parseFloat(arr3[1]);
    		 
    		 Person p = new Student(name, old, diem);
    		 manager.add(p);
    		     				
    		 System.out.println(line);
    		 System.out.println(line1);
    		 System.out.println(line2);
    		 System.out.println(line3);
		}	    	 
    	 if (line.indexOf("#tc") >=0) {
    		 String line1 = br.readLine();
    		 String arr[] = line1.split(":");
    		 String name = arr[1];
    		 
    		 String line2 = br.readLine();
    		 String arr1[] = line2.split(":");
    		 int old = Integer.parseInt(arr1[1]);
    		 
    		 String line3 = br.readLine();
    		 String arr2[] = line3.split(":");
    		 
    		 float hsl = Float.parseFloat(arr1[1]);	    		 
    		 Person p1 = new Teacher(name, old, hsl);
    		 manager.add(p1);	
    		 System.out.println(line);
    		 System.out.println(line1);
    		 System.out.println(line2);
    		 System.out.println(line3);
     }
     }  	  	
} catch (IOException e) {
	e.printStackTrace();
	// TODO: handle exception
}		
}
static void covert(int number[], String line) {
	String str[] = line.split("#");
	for (int i = 0; i < str.length; i++) {
		number[i] = Integer.parseInt(str[i]);
	}
}
	static void print(int arr[]) {
			for (int i: arr) {
				System.out.format("%d\t",i).print("");
}
System.out.println();
}
}