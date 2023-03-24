package oop_sem7.src.ui.commands;

import oop_sem7.src.ui.Console;
import oop_sem7.src.ui.commands.interfaces.Option;

abstract class Command implements Option {
    private Console console;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}
