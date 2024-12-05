package com.FinfirmProject.FinfirmProject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.springframework.security.core.context.SecurityContextHolder;
import org.apache.wicket.markup.html.basic.Label;

public class HelloPage extends WebPage {

    @Override protected void onInitialize() { super.onInitialize();
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        add(new Label("message", Model.of("Welcome, " + username + "!"))); }
}
