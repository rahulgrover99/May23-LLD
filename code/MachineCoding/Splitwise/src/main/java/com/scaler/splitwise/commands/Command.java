package com.scaler.splitwise.commands;

public interface Command {

    boolean matches(String string);
    void execute(String string);
}
