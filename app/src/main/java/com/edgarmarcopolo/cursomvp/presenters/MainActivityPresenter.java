package com.edgarmarcopolo.cursomvp.presenters;

import com.edgarmarcopolo.cursomvp.MainActivity;
import com.edgarmarcopolo.cursomvp.models.MainActivityModel;

public class MainActivityPresenter implements MainActivity.Presenter {

    private MainActivity.View view;
    private MainActivity.Model model;

    public MainActivityPresenter(MainActivity.View view){
        this.view = view;
        this.model = new MainActivityModel(this);
    }

    @Override
    public void showResult(String s) {
        if(view !=null){
            view.showResult(s);
        }
    }

    @Override
    public void addName(String s) {
        if(view !=null){
            model.addName(s);
        }

    }
}
