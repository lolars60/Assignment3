class Runner {
    String name;
    String milePr;

    public Runner(String name, String milePr) { 
        this.name = name;
        this.milePr = milePr;
    }

    public void displayInfo() {
        System.out.println("Runner: " + name);
        System.out.println("Mile PR: " + milePr);
        System.out.println();
    }
}

public class assignmentThree {
    public static void main(String[] args) {
        Runner[] runners = {
            new Runner("Aidan", "4:04"),
            new Runner("Juan", "4:04"),
            new Runner("Lanse", "4:07")
        };

        for (Runner runner : runners) {
            runner.displayInfo();
        }
    }
}
