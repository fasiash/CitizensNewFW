package com.anhtester.utils;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StateSelectorListener implements IAlterSuiteListener {

    private static final List<String> STATES = StatesLoader.getStates();
    private static final AtomicInteger globalStateIndex = new AtomicInteger(0); // Use AtomicInteger for thread safety

    @Override
    public void alter(List<XmlSuite> suites) {
        for (XmlSuite suite : suites) {
            // Get and update the state index atomically
            int stateIndex = globalStateIndex.getAndUpdate(index -> (index + 1) % STATES.size());
            String state = STATES.get(stateIndex);

            // Add the state parameter to the suite
            suite.getParameters().put("state", state);
        }
    }
}
