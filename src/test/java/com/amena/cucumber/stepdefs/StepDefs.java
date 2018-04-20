package com.amena.cucumber.stepdefs;

import com.amena.PlemGateApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PlemGateApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
