package com.example.designpatterns.momento;

import lombok.Getter;

@Getter
public class TextArea {
    private String text;

    public void set(String text) {
        this.text=text;
    }

    public Momento takeSnapshoot() {
        return new Momento(this.text);
    }

    public void restore(Momento momento) {
        this.text=momento.getSaveText();
    }

    public static class Momento {
        private String text;

        private Momento(String textToSave) {
            text=textToSave;
        }

        public String getSaveText() {
            return text;
        }
    }
}
