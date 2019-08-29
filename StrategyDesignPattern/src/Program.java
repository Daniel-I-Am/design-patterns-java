public class Program {
    public static void main(String[] args) {
        LevelContext context = new LevelContext(new LevelOne());
        context.drawLevel();

        context = new LevelContext(new LevelTwo());
        context.drawLevel();

        context = new LevelContext(new LevelThree());
        context.drawLevel();
    }
}
