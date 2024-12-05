package com.FinfirmProject.FinfirmProject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.validation.IFormValidator;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.form.TextField;

import java.awt.*;

public class LoginPage extends WebPage {
    private String username;
    private String password;

    public LoginPage() {
        Form<?> loginForm = new Form<Void>("loginForm") {
            @Override
            protected void onSubmit() {
                // Handle the login
            }
        };
        TextField<String> usernameField = new TextField<String>("username", new PropertyModel<>(this, "username"));
        PasswordTextField passwordField = new PasswordTextField("password", new PropertyModel<>(this, "password"));
        loginForm.add(usernameField);
        loginForm.add(passwordField);
    }
}
