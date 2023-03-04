package com.serenitydojo.datatypes;

import org.junit.Test;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStringsTest {

    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";
        String lowerCaseTitle = bookTitle.toLowerCase();
        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";
        String upperCaseTitle = bookTitle.toUpperCase();
        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";
        String trimmedTitle = bookTitle.trim();
        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";
        int length = bookTitle.length();
        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";
        String updatedTitle = bookTitle.replace("Cat","Dog");
        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
