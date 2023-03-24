package oop_sem7.src.ui.commands.interfaces;


import java.io.IOException;

public interface Option {
    String description();
    void execute() throws IOException, ClassNotFoundException;
}

