
public class Player {
    private String name;
    private byte step = 0;

    public String getName() {
	return name;
    }

    public Player(String name) {
	this.name = name;
    }

    public Player(Player player) {
	this.name = player.name;
	this.step = player.step;
    }

    public Player(String name, byte step) {
	this.name = name;
	this.step = step;
    }

    public Player(String[] playerInfo) {
	switch (playerInfo.length) {
	case 1:
	    this.name = playerInfo[0];
	case 2:
	    this.name = playerInfo[0];
	    this.step = Byte.parseByte(playerInfo[1]);
	default:
	    break;
	}
    }

    public byte getStep() {
	return step;
    }

    public void setLevel(byte step) {
	this.step = step;
    }
}
