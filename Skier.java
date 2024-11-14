public class Skier extends Sportsman {
       public Skier (String name, String team, int age) {
           super (name, team, age);
       }
    public void skiRide() {
        System.out.println(getName() + " едет на лыжах.");
    }
}
