package com.FinfirmProject.FinfirmProject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.pages.AccessDeniedPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.time.Duration;

public class WicketApplication extends WebApplication {
    @Override
    public Class<? extends WebPage> getHomePage() {
        return HelloPage.class;
    }

    @Override
    public void init() {
        super.init();
        mountPage("/login", LoginPage.class);
        mountPage("/hello", HelloPage.class);
        /*getComponentInstantiationListeners().add(new SpringComponentInjector(this));

        // Configure Wicket settings
        getApplicationSettings().setPageExpiredWarningDuration(Duration.seconds(30));
        getApplicationSettings().setAccessDeniedPage(AccessDeniedPage.class);*/
    }
}
