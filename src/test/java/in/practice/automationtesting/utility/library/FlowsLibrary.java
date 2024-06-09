package in.practice.automationtesting.utility.library;

import in.practice.automationtesting.utility.Driver;

public class FlowsLibrary {

    public void navigateToUrl(String url){
        Driver.getDriver().get(url);
    }

    public String getCurrentPageTitle(){
       return Driver.getDriver().getTitle();
    }

    public String getCurrentPageUrl(){
        return Driver.getDriver().getCurrentUrl();
    }
}
