package homework50;

import java.util.Deque;

public enum Robot {
    N('N') {
        public void controlStack(Deque<Character> newLine) {
            if (Character.valueOf('S').equals(newLine.peek())) {
                newLine.pop();
            } else newLine.push('N');
        }
    }, S('S') {
        public void controlStack(Deque<Character> newLine) {
            if (Character.valueOf('N').equals(newLine.peek())) {
                newLine.pop();
            } else newLine.push('S');
        }
    }, W('W') {
        public void controlStack(Deque<Character> newLine) {
            if (Character.valueOf('E').equals(newLine.peek())) {
                newLine.pop();
            } else newLine.push('W');
        }
    }, E('E') {
        public void controlStack(Deque<Character> newLine) {
            if (Character.valueOf('W').equals(newLine.peek())) {
                newLine.pop();
            } else newLine.push('E');
        }
    };
    private Character charValue;

    Robot(Character charValue) {
        this.charValue = charValue;
    }

    public abstract void controlStack(Deque<Character> newLine);

    @Override
    public String toString() {
        return charValue.toString();
    }
}
