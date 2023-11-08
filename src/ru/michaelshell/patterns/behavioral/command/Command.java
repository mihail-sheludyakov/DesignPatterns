package ru.michaelshell.patterns.behavioral.command;

public interface Command {
    void execute();
    void undo();
}
