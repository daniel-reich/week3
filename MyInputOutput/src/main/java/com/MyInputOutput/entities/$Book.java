package com.MyInputOutput.entities;

/**
 * Created by Daniel on 11/28/16.
 */
public class $Book {

        private String author;
        private String title;
        private String yearOfPublication;
        private String genre;

    public $Book(String title, String author, String yearOfPublication, String genre) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public $Book(){

    }

    public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public String getYearOfPublication() {
            return yearOfPublication;
        }

        public String getGenre() {
            return genre;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setYearOfPublication(String yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }
    }

