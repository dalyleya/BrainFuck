package entity;

import compiler.exception.DirectivesIndexOutOfBoundsException;
import compiler.exception.NegativeDirectiveIndexException;

/**
 * Contain array of BF directives and current index
 * Array considered to contain unlimited amount of elements ['+', '-', '<', '>', '.', '[', ']']
 */
class DirectivesData {
    private char[] directives;
    private int dirIndex;

    DirectivesData(char[] directives) {
        this.directives = directives;
        dirIndex = 0;
    }

    int getDirIndex() {
        return dirIndex;
    }

    void setDirIndex(int dirIndex) {
        this.dirIndex = dirIndex;
    }

    void increaseDirIndex() throws DirectivesIndexOutOfBoundsException {
        checkIndex(dirIndex + 1);
        dirIndex++;
    }

    void decreaseDirIndex() throws NegativeDirectiveIndexException {

        if (dirIndex - 1 < 0) {
            throw new NegativeDirectiveIndexException();
        }
        dirIndex--;
    }

    private void checkIndex(int index) throws DirectivesIndexOutOfBoundsException {
        if (index >= directives.length) {
            throw new DirectivesIndexOutOfBoundsException();
        }
    }

    char getDirectiveByCurrentIndex() throws DirectivesIndexOutOfBoundsException {
        checkIndex(dirIndex);
        return directives[dirIndex];
    }

    void setDirectives(char[] directives) {
        this.directives = directives;
    }
}
