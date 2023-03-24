package oop_sem7.src.ui.commands;


import oop_sem7.src.ui.Console;

import java.io.IOException;

public class Read extends Command{
    public Read(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохраненный список";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {{
            getConsole().read();
        }
    }
}
