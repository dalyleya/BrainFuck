package entity;

/**
 * Contain array of BF directives and current index
 * Array considered to contain unlimited amount of elements ['+', '-', '<', '>', '.', '[', ']']
 */
public class DirectivesData {
    private char[] directives;
    private int dirIndex;

    public DirectivesData(char[] directives) {
        this.directives = directives;
        dirIndex = 0;
    }

    public int getDirIndex() {
        return dirIndex;
    }

    public void setDirIndex(int dirIndex) {
        this.dirIndex = dirIndex;
    }

    public void increaseDirIndex() {
        dirIndex++;
    }

    public void decreaseDirIndex() {
        dirIndex--;
    }

    public char getDirectiveByCurrentIndex() {
        return directives[dirIndex];
    }

    public void setDirectives(char[] directives) {
        this.directives = directives;
    }
}
