package StepDefinitions;

import Utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void preconditions(){
        openBrowserAndLaunchApplication();

    }

    @After
    public void postConditions(Scenario scenario) {
        byte[] pic;
        if (scenario.isFailed()) {
            pic = takeScreenshot("failed/" + scenario.getName());
        } else {
            pic = takeScreenshot("passed/" + scenario.getName());
        }

    }
}
