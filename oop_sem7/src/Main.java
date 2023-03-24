package oop_sem7.src;
import oop_sem7.src.presenter.Presenter;
import oop_sem7.src.ui.Console;
import oop_sem7.src.ui.interfaces.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        View view = new Console();
        new Presenter(view);
        view.start();
    }
}