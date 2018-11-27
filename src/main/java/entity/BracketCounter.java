package entity;

public class BracketCounter {
    private int count = 0;

    public boolean hasMoreBrackets() {
        return count > 0;
    }

    public boolean hasNoMoreBrackets() {
        return count == 0;
    }

    public void increaseBracketCounter() {
        count++;
    }

    public void decreaseBracketCounter() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
