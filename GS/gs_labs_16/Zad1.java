import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zad1 {
	public static void main(String[] args) {
		FileInputStream fileStream = null;
		FileWriter fileWriter = null;
		// N = 4 domyślnie
		// int N = 4;
		int N = 2;
		
		try {
			//fileStream = new FileInputStream("test.bin");
			fileStream = new FileInputStream("Zad1.class");
			//fileStream = new FileInputStream("C:/Users/s29792/Downloads/ppj22p.pdf");
			
		} catch(FileNotFoundException e) {
			System.out.println("[ERROR] Nie znaleziono pliku");
		}
		
		try {
			fileWriter = new FileWriter("Output.txt");
			
			int bajt = 0;
			String slowo = "";
			while(bajt != -1) {
				bajt = fileStream.read();
				
				if((bajt != 32) && (bajt>='A' && bajt<='Z') || (bajt>='a' && bajt<='z'))
					slowo += (char)bajt;
				else {
					if(slowo.length() > N) {
						System.out.println(slowo);
						fileWriter.write(slowo+"\n");
					}
					slowo = "";
				}
			}
			
			fileStream.close();
		} catch (IOException e) {
			System.out.println("[ERROR] Błąd odczytu");
		}
	}
}