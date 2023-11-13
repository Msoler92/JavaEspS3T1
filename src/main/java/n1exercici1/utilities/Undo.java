package n1exercici1.utilities;

import java.util.ArrayDeque;

public class Undo {
    private static Undo instance;
    private ArrayDeque<String> history;
    private ArrayDeque<String> undone;

    private Undo() {
        history = new ArrayDeque<>();
        undone = new ArrayDeque<>();
    }
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public String addCmd(String cmd) {
        history.add(cmd);
        undone.clear();
        return cmd;
    }

    public String undoCmd() {
        return pollAndAdd(history, undone);
    }

    public String redoCmd() {
        return pollAndAdd(undone, history);
    }

    public ArrayDeque<String> getHistory() {
        return history;
    }

    private String pollAndAdd(ArrayDeque<String> originDQ, ArrayDeque<String> destinationDQ) {
        String cmd = originDQ.pollLast();
        if (cmd != null) {
            destinationDQ.add(cmd);
        }
        return cmd;
    }
}
