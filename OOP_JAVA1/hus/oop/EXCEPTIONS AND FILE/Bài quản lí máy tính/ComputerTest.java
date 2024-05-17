import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ComputerTest {

    // hàm ghi ra file dưới dạng Object, trong đó filename là tên file truyền vào, coms là danh sách các Computer muốn ghi ra file
 	public static void outputObject(String fileName, ArrayList<Computer> coms) {
 		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
 		    for(Computer computer : coms){
 		        outputStream.writeObject(computer);
 		    }
 		}
 		catch (IOException e){
 		    e.printStackTrace();
 		}
		
 	}
	
	public static void inputObject(String fileName, ArrayList<Computer> coms) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)) ) {
		    while(true) {
		        try {
		            Computer computer = (Computer) inputStream.readObject();
		            coms.add(computer);
		        }
		        catch (EOFException e) {
		            break;
		        }
		    }
		}
		catch (IOException | ClassNotFoundException e){
		    e.printStackTrace();
		}
		
	}
	
	// Hàm in ra màn hình thông tin của các máy tính trong danh sách computers
	public static void output(ArrayList<Computer> computers)
	{
		for(int i =0; i < computers.size(); i ++)
			System.out.println(computers.get(i).toString());
	}
	
	// Hàm trả về giá trung bình của các máy tính trong danh sách coms
	public static double getAvgPrice(ArrayList<Computer> coms)
	{
	        int count=0;
	        double sum=0;
	       for(int i = 0; i < coms.size(); i++){
	           count++;
	           sum+=coms.get(i).getPrice();
	       }
	       return sum/count;
	}
	
	// Hàm trả về các máy tính có giá lớn nhất
	public static ArrayList<Computer> getMaxPrice(ArrayList<Computer> coms)
	{
	    ArrayList<Computer> result = new ArrayList <Computer> ();
	    double maxComputer = Integer.MIN_VALUE;
	    for(int i = 0; i < coms.size(); i++){
	        if(coms.get(i).getPrice() > maxComputer) {
	            result.add(coms.get(i));
	        }
	    }
	    return result;
	
	}
	
	// Hàm trả về danh sách các máy tính có hãng sản xuất là Dell
	public static ArrayList<Computer> getDell(ArrayList<Computer> coms)
	{
	    ArrayList <Computer> result = new ArrayList <Computer> ();
	    for(int i = 0; i < coms.size(); i++){
	        if(coms.get(i).getManu().equals("Dell")){
	            result.add(coms.get(i));
	        }
	    }
	    return result;
	
	}
	
	// Hàm sắp xếp và in ra danh sách các máy tính sau khi sắp xếp
	public static void sort(ArrayList<Computer> coms)
	{
		
	}
	
	public static void main(String[] args) {
		ComputerTest test = new ComputerTest();
		ArrayList<Computer> newC = new ArrayList<>();
		test.inputObject("computer.dat", newC);
		ArrayList<Computer> dell = test.getDell(newC);
		test.outputObject("dell.dat", dell);
	}

}
