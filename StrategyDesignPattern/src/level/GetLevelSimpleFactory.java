package level;

public class GetLevelSimpleFactory {
    public static ILevel getLevel() {
        switch (LevelContext.currentLevel) {
            case 1:
                return new LevelOne();
            case 2:
                return new LevelTwo();
            case 3:
                return new LevelThree();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
