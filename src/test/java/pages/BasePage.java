package pages;

import utilis.Interactions;

public abstract class BasePage {
    protected Interactions driver;

    public BasePage(Interactions driver) {
        this.driver = driver;
    }
}
