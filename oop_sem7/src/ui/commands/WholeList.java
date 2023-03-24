package oop_sem7.src.ui.commands;


import oop_sem7.src.ui.Console;

public class WholeList extends Command{
    public WholeList(Console console) {
        super(console);
    }

    @Override
    public String description() {return "Генеалогическое древо";}

    @Override
    public void execute() {
        getConsole().wholeList();

    }
}