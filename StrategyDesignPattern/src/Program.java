import level.*;

public class Program {
    public static void main(String[] args) {
        LevelContext.currentLevel = 1;

        ILevel level = GetLevelSimpleFactory.getLevel();
        level.draw();

        LevelContext.currentLevel = 2;

        level = GetLevelSimpleFactory.getLevel();
        level.draw();

        LevelContext.currentLevel = 3;

        level = GetLevelSimpleFactory.getLevel();
        level.draw();
    }
}
