package ru.croc.task4;

public class Annotation {

        private Figure figure;
        private String data;

        public Annotation(Figure figure, String data) {
            this.figure = figure;
            this.data = data;
        }

        public String getData() {
            return data;
        }
        public void setData(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return figure.toString() + data;
        }

        public Figure getFigure() {
            return figure;
        }

        public void setFigure(Figure figure) {
            this.figure = figure;
        }

}

