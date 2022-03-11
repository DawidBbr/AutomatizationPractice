package pages;

import utilis.Interactions;

public abstract class BasePage {
    protected Interactions interactions;

    public BasePage(Interactions interactions) {
        this.interactions = interactions;
    }
}
