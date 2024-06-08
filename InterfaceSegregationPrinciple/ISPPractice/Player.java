package ISPPractice;

public class Player {
    private String name;
    private String version;

    public Player(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void start() {
        System.out.println("start the music...");
    }

    public void stop() {
        System.out.println("stop the music...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void pause() {
        System.out.println("pause the music...");
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
