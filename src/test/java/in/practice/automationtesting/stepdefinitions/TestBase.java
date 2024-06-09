package in.practice.automationtesting.stepdefinitions;

import in.practice.automationtesting.utility.library.AppLibrary;

public class TestBase {
    private AppLibrary appLibrary;

    public TestBase() {
        this.appLibrary = new AppLibrary();
    }

    public AppLibrary getAppLibrary() {
        return appLibrary;
    }

}
