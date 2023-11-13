package n1exercici1;

import n1exercici1.utilities.*;

public class Main {
    public static void main (String[] args) {
        boolean run = true;
        Undo history = Undo.getInstance();
        String cmd;

        while (run) {
            cmd = menuSelection().toLowerCase();
            switch (cmd) {
                case "undo":
                    cmd = history.undoCmd();
                    System.out.println(validateStringNotNull(cmd,
                            "Could not undo",
                            "Command " + cmd + " successfully undone."));
                    break;
                case "redo":
                    cmd = history.redoCmd();
                    System.out.println(validateStringNotNull(cmd,
                            "Could not redo",
                            "Command " + cmd + " successfully executed."));
                    break;
                case "history":
                    for (String s: history.getHistory()) {
                        System.out.println(s);
                    }
                    break;
                case "exit":
                        run = false;
                    break;
                default:
                    history.addCmd(cmd);
                    System.out.println("Command successfully executed.");
                    break;
            }
        }
    }

    static String menuSelection() {
        System.out.println("'n1exercici1.utilities.Undo' - n1exercici1.utilities.Undo last command");
        System.out.println("'Redo' - Redo last undone command");
        System.out.println("'History' - Show all commands in history (undone commands and n1exercici1.utilities.Undo/Redo commands won't be shown)");
        System.out.println("'Exit' - Exit the application");

        return Entrada.llegirString("Enter a command (any string) or:");
    }

    static String validateStringNotNull (String s, String falseMsg, String trueMsg) {
        if (s == null) {
            return falseMsg;
        }
        return trueMsg;
    }

}
