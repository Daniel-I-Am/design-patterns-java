public class LevelContext {
    private ILevel currentLevel;

    public LevelContext(ILevel level) {
        this.currentLevel = level;
    }

    public void drawLevel() {
        this.currentLevel.draw();
    }
}
