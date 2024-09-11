package org.patterns.factoryMethod;

public class Developer implements Interviewer{

    @Override
    public void askQuestions() {
        System.out.println("Ask design patterns related questions");
    }
}
