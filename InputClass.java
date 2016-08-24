import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputClass {
    private BufferedReader reader;
    private Stories stories = new Stories();

    public String getInputString() {
	reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    return reader.readLine();
	} catch (IOException ex) {
	    System.out.println("Ошибка с чтением данных.");
	}
	return null;
    }

    public String[] getUserInformation() {
	try {
	    reader = new BufferedReader(new FileReader(PathTo.USER_INFORMATION));
	    String[] playerInfo = reader.readLine().split("/");
	    return playerInfo;
	} catch (IOException ex) {
	    System.out.println("Ошибка с чтением файла.");
	}
	return null;
    }
}
