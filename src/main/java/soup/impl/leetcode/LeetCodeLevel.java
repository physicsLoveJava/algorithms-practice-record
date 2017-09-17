package soup.impl.leetcode;

public enum LeetCodeLevel {

    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private String level;

    LeetCodeLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }
}
