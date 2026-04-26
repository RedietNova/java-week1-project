public class Person {
    private String name;
    private int energy;
    private int mood;
    private int knowledge;

    // Constructor
    public Person(String name) {
        this.name = name;
        this.energy = 50;
        this.mood = 50;
        this.knowledge = 0;
    }

    public void study() {
        if (energy < 10) {
            System.out.println("⚠️ You're too tired to study. Go sleep!");
            return;
        }
        knowledge += 10;
        energy -= 10;
        mood -= 5;
        System.out.println("📚 You studied. Knowledge +10");
    }

    public void eat() {
        energy += 15;
        mood += 5;
        System.out.println("🍔 That meal hit different. Energy +15");
    }

    public void sleep() {
        energy += 25;
        mood += 10;
        System.out.println("😴 You slept well. Energy restored!");
    }

    public void showStatus() {
        System.out.println("\n📊 STATUS:");
        System.out.println("Name: " + name);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
        System.out.println("Knowledge: " + knowledge);

        if (energy < 20) {
            System.out.println("⚠️ You're exhausted!");
        }
        if (knowledge > 50) {
            System.out.println("🏆 You're getting smarter!");
        }
    }
}