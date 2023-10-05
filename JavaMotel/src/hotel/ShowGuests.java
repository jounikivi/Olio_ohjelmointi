package hotel;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ShowGuests {
	public static void main(String[] args) {
		int[] quest = new int [10];
		var diskScanner = new Scanner("questlist");
		
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			quest[roomNum] = diskScanner.nex.int();
		}
	}
}
