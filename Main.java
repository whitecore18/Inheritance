public class Main {
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("Иван", "Спартак", 25);
        Footballer footballer2 = new Footballer("Дмитрий", "Спартак", 28);

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Сергей", "Динамо", 30);
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Александр", "Динамо", 29);

        Skier skier1 = new Skier("Алексей", "Торпедо", 22);
        Skier skier2 = new Skier("Николай", "Торпедо", 24);

        System.out.println("Информация о футболисте 1:");
        System.out.println("Имя: " + footballer1.getName());
        System.out.println("Команда: " + footballer1.getTeam());
        System.out.println("Возраст: " + footballer1.getAge());
        footballer1.kickBall();
        System.out.println();
        System.out.println("Информация о футболисте 2:");
        System.out.println("Имя: " + footballer2.getName());
        System.out.println("Команда: " + footballer2.getTeam());
        System.out.println("Возраст: " + footballer2.getAge());
        footballer2.kickBall();
        System.out.println();
        System.out.println("Информация о хоккеисте 1:");
        System.out.println("Имя: " + hockeyPlayer1.getName());
        System.out.println("Команда: " + hockeyPlayer1.getTeam());
        System.out.println("Возраст: " + hockeyPlayer1.getAge());
        hockeyPlayer1.kickPuck();
        System.out.println();
        System.out.println("Информация о хоккеисте 2:");
        System.out.println("Имя: " + hockeyPlayer2.getName());
        System.out.println("Команда: " + hockeyPlayer2.getTeam());
        System.out.println("Возраст: " + hockeyPlayer2.getAge());
        hockeyPlayer2.kickPuck();
        System.out.println();
        System.out.println("Информация о лыжнике 1:");
        System.out.println("Имя: " + skier1.getName());
        System.out.println("Команда: " + skier1.getTeam());
        System.out.println("Возраст: " + skier1.getAge());
        skier1.skiRide();
        System.out.println();
        System.out.println("Информация о лыжнике 2:");
        System.out.println("Имя: " + skier2.getName());
        System.out.println("Команда: " + skier2.getTeam());
        System.out.println("Возраст: " + skier2.getAge());
        skier2.skiRide();
    }
}

