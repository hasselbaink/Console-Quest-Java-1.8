import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Stories {
    private File[] storiesPath = new File[10];

    public Stories() {
	for (int i = 0; i < storiesPath.length; i++) {
	    storiesPath[i] = new File(PathTo.STORIES + i + ".txt");
	}
    }

    public String[] getStory(byte step) {
	StringBuilder story = new StringBuilder();
	try {
	    BufferedReader reader = new BufferedReader(new FileReader(PathTo.STORIES + step + ".txt"));
	    String line;
	    while ((line = reader.readLine()) != null) {
		story.append(line);
	    }
	    return story.toString().split("/");
	} catch (IOException ex) {
	    System.out.println("Ошибка с чтением файла.");
	}
	return null;
    }
    
    public int getStoryLength() {
	return storiesPath.length;
    }

    public void giveQuestion(String question) {

    }
}
