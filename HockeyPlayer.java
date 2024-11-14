public class HockeyPlayer extends Sportsman {
    public HockeyPlayer (String name, String team, int age) {
        super (name, team, age);
    }
    public void kickPuck() {
        System.out.println(getName() + " бьет по шайбе.");
    }
}
