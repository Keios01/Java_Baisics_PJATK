import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zad2 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FileReader("People.txt");
		br = new BufferedReader(fr);
		} catch(FileNotFoundException e) {
			System.out.println("[ERROR] Brak pliku");
		}
		
		try {
			
			int bajt = 0;
			String slowo = "";
			while(bajt != -1) {
				bajt = br.read();
				
				if(bajt != 32 && bajt != 13)
					slowo += (char)bajt;
				else if(bajt == 32){
					System.out.print(slowo + " ");
					slowo = "";
				} else if(bajt == 13) {
					System.out.println(slowo);
					slowo = "";
				}
			}
			
			fr.close();
			br.close();
		} catch (IOException e) {
			System.out.println("[ERROR] Blad odczytu");
		}
	}
}