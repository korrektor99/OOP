package oop_sem7.src.ui.interfaces;

import oop_sem7.src.presenter.Presenter;

import java.io.IOException;

public interface View {
    void setPresenter(Presenter presenter);
    void start() throws IOException, ClassNotFoundException;
    void print(String text);
}