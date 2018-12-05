package com.edgarmarcopolo.cursomvp.models;

import com.edgarmarcopolo.cursomvp.MainActivity;

public class MainActivityModel implements MainActivity.Model {

    private MainActivity.Presenter presenter;
    private String data;

    public MainActivityModel(MainActivity.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void addName(String s) {
        data = s + "Cualquier Cosa";
        presenter.showResult(data);
    }
}
