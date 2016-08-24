
public class Controller {
    private Player player;
    private InputClass input = new InputClass();
    private Stories stories = new Stories();

    public Controller() {
	String[] userinfo = input.getUserInformation();
	if (userinfo == null) {
	    System.out.println("Как вас зовут?: ");
	    player = new Player(input.getInputString());
	} else {
	    player = new Player(userinfo);
	    userinfo = null;
	}
	System.out.println("Добро пожаловать в игру, " + player.getName());
	while (player.getStep() <= stories.getStoryLength()) {
	    String[] story = stories.getStory(player.getStep());
	    System.out.println(story[0]);
	    System.out.println(story[1]);
	    stories.giveQuestion(input.getInputString());
	}
    }

    public static void main(String[] args) {
	Controller control = new Controller();
    }
}
