package it.be.epicode.esercizio2.exceptions;

public class exceptions {

    public static class ValoriErrati extends RuntimeException {

        public ValoriErrati(String message) {
            super(message);
        }
    }
}