package com.siit.homeworks.homework05.strings;

import com.siit.homeworks.homework05.strings.Strings;
//import org.assertj.core.internal.Strings;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class StringsTest {

    private Strings sut;

    // Write a method to check if a string contains only digits. #1
    @Test
    public void given_string_input_when_compute_check_digits_then_true_returned() {
        //Given
        String input ="1222331";

        //When
        Boolean returnedValue = sut.checkDigits(input);

        //Then
        assertThat(returnedValue).isEqualTo(true);
    }

    // Write a method to check if a string contains only digits. #2
    @Test
    public void given_string_input_when_compute_check_digits_then_false_returned() {
        //Given
        String input ="Flower";

        //When
        Boolean returnedValue = sut.checkDigits(input);

        //Then
        assertThat(returnedValue).isEqualTo(false);
    }

    // Write a method to check if a string contains only digits. #3
    @Test
    public void given_string_with_digits_input_when_compute_check_digits_then_false_returned() {
        //Given
        String input = "Flower1234";

        //When
        Boolean returnedValue = sut.checkDigits(input);

        //Then
        assertThat(returnedValue).isEqualTo(false);
        //
    }

    // Write a method to check if a string contains only digits. #4
    @Test
    public void given_empty_string_input_when_compute_check_digits_then_false_returned() {
        //Given
        String input = "";

        //When
        Boolean returnedValue = sut.checkDigits(input);

        //Then
        assertThat(returnedValue).isEqualTo(false);

    }

    // Write a method to remove a given character from String. #1
    @Test
    public void given_string_input_when_compute_remove_character_then_string_without_character_returned() {
        //Given
        String input = "Flower";
        char c = 'o';

        //When
        String returnedValue = sut.removeChar(input,c);

        //Then
        assertThat(returnedValue).isEqualTo("Flwer");

    }

    // Write a method to remove a given character from String. #2
    @Test
    public void given_empty_string_input_when_compute_remove_character_then_empty_string_returned() {
        //Given
        String input = "";
        char c = 'a';

        //When
        String returnedValue = sut.removeChar(input,c);

        //Then
        assertThat(returnedValue).isEqualTo("");

    }

    // Write a method to remove a given character from String. #3
    @Test
    public void given_string_different_char_input_when_compute_remove_character_then_string_returned() {
        //Given
        String input = "Flower";
        char c = 'x';

        //When
        String returnedValue = sut.removeChar(input,c);

        //Then
        assertThat(returnedValue).isEqualTo(input);

    }

    // Write a method to count a number of vowels and consonants in a given string. #1
    @Test
    public void given_string_input_when_compute_count_vowels_then_count_returned() {
        //Given
        String input = "Flower";


        //When
        int returnedValue = sut.countVowels(input);

        //Then
        assertThat(returnedValue).isEqualTo(2);

    }

    // Write a method to count a number of vowels and consonants in a given string. #2
    @Test
    public void given_string_without_vowels_input_when_compute_count_vowels_then_count_returned() {
        //Given
        String input = "Flwr";

        //When
        int returnedValue = sut.countVowels(input);

        //Then
        assertThat(returnedValue).isEqualTo(0);

    }
    // Write a method to count a number of vowels and consonants in a given string. #3
    @Test
    public void given_empty_string_input_when_compute_count_vowels_then_count_returned() {
        //Given
        String input = "";

        //When
        int returnedValue = sut.countVowels(input);

        //Then
        assertThat(returnedValue).isEqualTo(0);

    }

    // Write a method to count a number of vowels and consonants in a given string. #1
    @Test
    public void given_string_input_when_compute_count_consonants_then_count_returned() {
        //Given
        String input = "Flower";


        //When
        int returnedValue = sut.countConson(input);

        //Then
        assertThat(returnedValue).isEqualTo(4);

    }

    // Write a method to count a number of vowels and consonants in a given string. #2
    @Test
    public void given_string_without_consonants_input_when_compute_count_consonants_then_count_returned() {
        //Given
        String input = "Aeiou";

        //When
        int returnedValue = sut.countConson(input);

        //Then
        assertThat(returnedValue).isEqualTo(0);

    }
    // Write a method to count a number of vowels and consonants in a given string. #3
    @Test
    public void given_empty_string_input_when_compute_count_consonants_then_count_returned() {
        //Given
        String input = "";

        //When
        int returnedValue = sut.countConson(input);

        //Then
        assertThat(returnedValue).isEqualTo(0);

    }

    // Write a method to count the occurrence of a given character in a string #1
    @Test
    public void given_string_input_when_compute_count_occurrences_then_count_returned() {
        //Given
        String input = "Mamamia";
        char c = 'm';
        //When
        int returnedValue = sut.count(input,c);

        //Then
        assertThat(returnedValue).isEqualTo(2);

    }

    // Write a method to count the occurrence of a given character in a string #2
    @Test
    public void given_empty_string_input_when_compute_count_occurrences_then_count_returned() {
        //Given
        String input = "";
        char c = 'm';
        //When
        int returnedValue = sut.count(input,c);

        //Then
        assertThat(returnedValue).isEqualTo(0);

    }

    // Write a method to count the occurrence of a given character in a string #3
    @Test
    public void given_string_input_when_compute_different_count_occurrences_then_count_returned() {
        //Given
        String input = "Mamamia";
        char c = 'x';
        //When
        int returnedValue = sut.count(input,c);

        //Then
        assertThat(returnedValue).isEqualTo(0);

    }

    //Write a method to check if a given string is a palindrome.#1
    @Test
    public void given_string_input_when_compute_check_palindrome_then_true_returned() {
        //Given
        String input = "abababa";

        //When
        Boolean returnedValue = sut.checkPalindrome(input);

        //Then
        assertThat(returnedValue).isEqualTo(true);

    }

    //Write a method to check if a given string is a palindrome.#2
    @Test
    public void given_empty_string_input_when_compute_check_palindrome_then_false_returned() {
        //Given
        String input = "";

        //When
        Boolean returnedValue = sut.checkPalindrome(input);

        //Then
        assertThat(returnedValue).isEqualTo(false);

    }

    //Write a method to check if a given string is a palindrome.#3
    @Test
    public void given_string_input_when_compute_check_palindrome_then_false_returned() {
        //Given
        String input = "abc";

        //When
        Boolean returnedValue = sut.checkPalindrome(input);

        //Then
        assertThat(returnedValue).isEqualTo(false);

    }

    //Write a method to remove the duplicate character from String. #1
    @Test
    public void given_string_input_when_compute_remove_then_strings_without_duplicates_returned() {
        //Given
        String input ="dsdf";

        //When
        String returnedString = sut.removeDuplicates(input);

        //Then
        assertThat(returnedString).isEqualTo("dsf");
    }

    //Write a method to remove the duplicate character from String. #2
    @Test
    public void given_empty_string_input_when_compute_remove_then_empty_string_returned() {
        //Given
        String input ="";

        //When
        String returnedString = sut.removeDuplicates(input);

        //Then
        assertThat(returnedString).isEqualTo("");
    }

    //Write a method to remove the duplicate character from String. #3
    @Test
    public void given_string_input_when_compute_remove_then_unmodified_string_returned() {
        //Given
        String input ="abc";

        //When
        String returnedString = sut.removeDuplicates(input);

        //Then
        assertThat(returnedString).isEqualTo(input);
    }

    // Write a method to find duplicate characters in a given string.#1
    @Test
    public void given_string_input_when_compute_find_duplicates_then_characters_returned() {
        //Given
        String input ="abcabdfagh";

        //When
        String returnedString = sut.duplicateString(input);

        //Then
        assertThat(returnedString).isEqualTo("ab");
    }

    // Write a method to find duplicate characters in a given string.#2
    @Test
    public void given_empty_string_input_when_compute_find_duplicates_then_empty_string_returned() {
        //Given
        String input ="";

        //When
        String returnedString = sut.duplicateString(input);

        //Then
        assertThat(returnedString).isEqualTo("");

    }

    // Write a method to find duplicate characters in a given string.#3
    @Test
    public void given_string_input_when_compute_find_duplicates_then_empty_string_returned() {
        //Given
        String input ="abcdf";

        //When
        String returnedString = sut.duplicateString(input);

        //Then
        assertThat(returnedString).isEqualTo("");

    }

    // Write a method to check if two strings are anagrams of each other. #1
    @Test
    public void given_string_input_when_compute_check_anagram_then_true_returned() {
        //Given
        String input = "silent";
        String input2 = "listen";

        //When
        boolean returnedValue = sut.anagrams(input,input2);

        //Then
        assertThat(returnedValue).isEqualTo(true);

    }
    // Write a method to check if two strings are anagrams of each other. #2
    @Test
    public void given_string_input_when_compute_check_anagram_then_false_returned() {
        //Given
        String input = "silentt";
        String input2 = "listen";

        //When
        boolean returnedValue = sut.anagrams(input,input2);

        //Then
        assertThat(returnedValue).isEqualTo(false);

    }
    // Write a method to check if two strings are anagrams of each other. #3
    @Test
    public void given_one_empty_string_input_when_compute_check_anagram_then_false_returned() {
        //Given
        String input = "";
        String input2 = "listen";

        //When
        boolean returnedValue = sut.anagrams(input,input2);

        //Then
        assertThat(returnedValue).isEqualTo(false);

    }

    // Write a method to check if two strings are anagrams of each other. #4
    @Test
    public void given_empty_string_input_when_compute_check_anagram_then_false_returned() {
        //Given
        String input = "";
        String input2 = "";

        //When
        boolean returnedValue = sut.anagrams(input,input2);

        //Then
        assertThat(returnedValue).isEqualTo(false);

    }

    // Write a method to check if two strings are anagrams of each other. #5
    @Test
    public void given_digit_string_input_when_compute_check_anagram_then_true_returned() {
        //Given
        String input = "1234";
        String input2 = "4213";

        //When
        boolean returnedValue = sut.anagrams(input,input2);

        //Then
        assertThat(returnedValue).isEqualTo(true);

    }

    @Before
    public void setup() {
        sut = new Strings();
    }

}
