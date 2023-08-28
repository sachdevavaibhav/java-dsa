package ch5;

public class StaticMember {
    String name;
    int id;
    private static int playerCount = 0; // static variable - shared by all objects of the class and can be accessed without creating an object
    StaticMember(String name) {
        this.name = name;
        this.id = ++playerCount;
    }

    static int getPlayerCount() {
        return playerCount;
    }

}

class TestStaticMember {
    public static void main(String[] args) {
        new StaticMember("John");
        new StaticMember("Jane");
        System.out.println("Total players: " + StaticMember.getPlayerCount());
    }
}
