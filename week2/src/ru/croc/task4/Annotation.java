package ru.croc.task4;

public class Annotation {

        private Figure figure;
        private String data;

        public Annotation(String data, Figure figure) {
            this.data = data;
            this.figure = figure;
        }

        public String getData() {
            return data;
        }
        public void setData(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return  data + figure.toString() ;
        }

        public Figure getFigure() {
            return figure;
        }

        public void setFigure(Figure figure) {
            this.figure = figure;
        }

}

