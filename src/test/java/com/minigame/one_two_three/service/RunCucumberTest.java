package com.minigame.one_two_three.service;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report/htmlReport.html", "json:target/report/jsonReport.json"},
    glue = "com.minigame.one_two_three.stepdefinitions",
    features = "src/test/java/com/minigame/one_two_three/feature/randomobject/randomobject.feature"
)
public class RunCucumberTest {
}
