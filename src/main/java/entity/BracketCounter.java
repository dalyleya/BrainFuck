package entity;

import compiler.exception.NegativeBracketCountException;

class BracketCounter {
    private int count = 0;

    boolean hasMoreBrackets() {
        return count > 0;
    }

    boolean hasNoMoreBrackets() {
        return count == 0;
    }

    void increaseBracketCounter() {
        count++;
    }

    void decreaseBracketCounter() throws NegativeBracketCountException {
        if (count <= 0){
            throw new NegativeBracketCountException();
        }
        count--;
    }

    int getCount() {
        return count;
    }

    void setCount(int count) {
        this.count = count;
    }
}
