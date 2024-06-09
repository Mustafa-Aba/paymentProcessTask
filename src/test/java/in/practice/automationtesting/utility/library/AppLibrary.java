package in.practice.automationtesting.utility.library;

import lombok.Getter;

@Getter
public class AppLibrary {
    private PageLibrary pageLibrary;
    private FlowsLibrary flowsLibrary;

    public AppLibrary() {
        pageLibrary = new PageLibrary();
        flowsLibrary = new FlowsLibrary();

    }

}
