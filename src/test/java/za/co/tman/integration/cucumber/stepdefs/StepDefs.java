package za.co.tman.integration.cucumber.stepdefs;

import za.co.tman.integration.IntegrationmoduleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IntegrationmoduleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
