/*
 Written By: Junaid Aslam
 Github Username: 20SW084
 Date: April 4, 2021
 */
import java.io.*;

public class TradeStock {
	public static void main(String[] args) throws IOException {
		if(args.length != 2) {
			System.out.println("Please enter in the format: java TradeStock.jar binaryfile.bin option");
			System.out.println("Options are listed below: ");
			System.out.println("\t0: Brute force method");
			return;
		}
		System.out.println("Successful. Args length = " + args.length);
		
		String fileName = args[0];
		int option = Integer.parseInt(args[1]);
		
		
		
		DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
		int size = dis.readInt();
		float[] prices = new float[size];
		
		for(int i = 0; i < size; i++) {
			prices[i] = dis.readFloat();
		}
		
		
		
		dis.close();
		
		if(option == 0) {
			BruteForce(prices, fileName);
		}
		else {
			System.out.println("Invalid option. Please note that only the Brute Force option (option 0) is functional.");
			return;
		}
		
	}
	
	static void BruteForce(float[] prices, String fileName) {
		float currBuy, currSell;
		float profit = prices[1] - prices[0];
		
		int a = 0;
		int b = 1;
		long startTime = System.nanoTime();
		for(int i = 0; i < prices.length - 1; i++) {
			currBuy = prices[i];
			for(int j = i + 1; j < prices.length; j++) {
				currSell = prices[j];
				if((currSell - currBuy) > profit) {
					profit = currSell - currBuy;
					a = i;
					b = j;
				}
			}
		}
		long endTime = System.nanoTime();
		long time = endTime - startTime;
		double t = (double)time;
		System.out.println("Daniel Peters");
		System.out.println("Input size " + prices.length);
		System.out.println(fileName);
		System.out.println("Brute Force Method");
		System.out.println(a + ", " + b + ", " + profit);
		System.out.println(t / 1000000 + " milliseconds");
	}
}
