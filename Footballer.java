public class Footballer extends Sportsman {
    public Footballer (String name, String team, int age) {
        super(name, team, age);
    }
        public void kickBall() {
            System.out.println(getName() + " бьет по мячу.");
        }
}
