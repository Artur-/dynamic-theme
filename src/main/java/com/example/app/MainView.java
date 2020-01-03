package com.example.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new Button("Make buttons red",
        e -> {
            getStyle().set("--_lumo-button-background-color", "red");
            getStyle().set("--_lumo-button-color", "white");
        }));
        add(new Button("Make buttons blue",
        e -> {
            getStyle().set("--_lumo-button-background-color", "lightblue");
            getStyle().set("--_lumo-button-color", "black");
        }));
        add(new Button("Make this button black",
        e -> {
            e.getSource().getStyle().set("--_lumo-button-background-color", "black");
            e.getSource().getStyle().set("--_lumo-button-color", "white");
        }));
    }

}
