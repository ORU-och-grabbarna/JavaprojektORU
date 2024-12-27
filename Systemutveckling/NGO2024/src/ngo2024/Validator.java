/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;

/**
 * The Validator class contains static methods for validating different types of input.
 * It ensures that strings, numbers, and other data meet specified conditions before they are processed.
 */
public class Validator {
    
    
    
    
    /**
     * Validates that a name is non-null, non-empty, and contains only letters (including Swedish characters) and spaces.
     *
     * @param name the name to validate.
     * @return true if the name is valid; false otherwise.
     */
    public static boolean isValidName (String name) {
        
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        
        //Regex - alla bokstäver små a - z alla stora A - > samt svenska tecken, \\s är mellanslag.
        return name.matches("^[a-zA-ZåäöÅÄÖ ]+$");
        
        
        
    }
    
    
    
    /**
     * Checks if a number is positive or zero.
     *
     * @param number the number to validate.
     * @return true if the number is positive or zero; false otherwise.
     */
    // Metod för att validera att inga negativa nummer förs in
    public static boolean isPositiveNumber (double number) {
        return number >= 0;
        
    }
    
    
    
    
    /**
     * Validates that a phone number contains only digits and has a length between 7 and 15 characters.
     *
     * @param phoneNumber the phone number to validate.
     * @return true if the phone number is valid; false otherwise.
     */
    public static boolean isValidPhoneNumber (String phoneNumber) {
        
        return phoneNumber != null && phoneNumber.matches("^\\d{7,15}$");
    }
    
    
    
    
    
     /**
     * Validates that a project name contains only letters, digits, and spaces (including Swedish characters).
     *
     * @param projektName the project name to validate.
     * @return true if the project name is valid; false otherwise.
     */
    // Metod för att validera att projekt namnet är korrekt man kan föra in bokstäver samt positiva nummer
    public static boolean isValidProjektName (String projektName) {
        
        return projektName != null && projektName.matches("^[a-zA-ZåäöÅÄÖ0-9 ]+$");
    }
    
    
    
    
    
     /**
     * Validates that a date is in the format YYYY-MM-DD.
     *
     * @param date the date to validate.
     * @return true if the date is in the correct format; false otherwise.
     */
    // Metod för att validera att datumet skrivs in i formatet YYYY-MM-DD
    public static boolean isValidDate (String date) {
        return date != null && date.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }
    
    
    
    
    /**
     * Validates that a string represents a positive number or zero.
     *
     * @param number the string to validate.
     * @return true if the string is a valid positive number; false otherwise.
     */
    // Metod för att validera att numret man anger t.ex kostnad är ett positivt nummer:
    public static boolean isPositiveNumber (String number) {
        
        try {
            return number != null && Double.parseDouble(number) >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
        
    }
    
    
    
    
    /**
     * Validates that a country name contains only letters, digits, and spaces (including Swedish characters).
     *
     * @param name the country name to validate.
     * @return true if the country name is valid; false otherwise.
     */
    // Metod för att validera att landets namn är korrekt inskrivet (får använda både bokstäver och siffror då i databasen heter länderna t.ex. land 3)
    public static boolean isValidCountryName (String name) {
        
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        
        //Regex - alla bokstäver små a - z alla stora A - > samt svenska tecken, \\s är mellanslag.
        return name.matches("^[a-zA-ZåäöÅÄÖ0-9 ]+$");
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
