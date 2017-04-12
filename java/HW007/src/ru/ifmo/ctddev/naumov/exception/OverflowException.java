package ru.ifmo.ctddev.naumov.exception;

public class OverflowException extends Exception {
    public OverflowException(final String message) {
        super(message);
    }

    public OverflowException() {
        super("overflow");
    }
}