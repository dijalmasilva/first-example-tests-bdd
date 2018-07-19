package br.com.dijalmasilva.cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@ContaTest",
    glue = "br.com.dijalmasilva.cucumber.test.steps", monochrome = true)
public class ContaTest {
}
