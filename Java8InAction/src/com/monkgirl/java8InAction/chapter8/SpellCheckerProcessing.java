package com.monkgirl.java8InAction.chapter8;

public class SpellCheckerProcessing extends ProcessingObject<String>{
    public String handWork(String text){
	return text.replaceAll("labda", "lambda");
    }
}
