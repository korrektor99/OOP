package oop_sem7.src.ui.commands;

import oop_sem7.src.ui.Console;

public class Search extends Command{
    public Search(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск";
    }

    @Override
    public void execute() {
        getConsole().search();

    }
}
