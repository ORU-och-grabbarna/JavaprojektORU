/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;

/**
 *
 * @author jamie
 */
public class Validator {
    
    
    
    public static boolean isValidName (String name) {
        
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        
        //Regex - alla bokstäver små a - z alla stora A - > samt svenska tecken, \\s är mellanslag.
        return name.matches("^[a-zA-ZåäöÅÄÖ ]+$");
        
        
        
    }
    
    
    // Metod för att validera att inga negativa nummer förs in
    public static boolean isPositiveNumber (double number) {
        return number >= 0;
        
    }
    
    
    
    public static boolean isValidPhoneNumber (String phoneNumber) {
        
        return phoneNumber != null && phoneNumber.matches("^\\d{7,15}$");
    }
    
    
    // Metod för att validera att projekt namnet är korrekt man kan föra in bokstäver samt positiva nummer
    public static boolean isValidProjektName (String projektName) {
        
        return projektName != null && projektName.matches("^[a-zA-ZåäöÅÄÖ0-9 ]+$");
    }
    
    
    
    // Metod för att validera att datumet skrivs in i formatet YYYY-MM-DD
    public static boolean isValidDate (String date) {
        return date != null && date.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }
    
    
    
    // Metod för att validera att numret man anger t.ex kostnad är ett positivt nummer:
    public static boolean isPositiveNumber (String number) {
        
        try {
            return number != null && Double.parseDouble(number) >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
        
    }
    
    
    // Metod för att validera att landets namn är korrekt inskrivet (får använda både bokstäver och siffror då i databasen heter länderna t.ex. land 3)
    public static boolean isValidCountryName (String name) {
        
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        
        //Regex - alla bokstäver små a - z alla stora A - > samt svenska tecken, \\s är mellanslag.
        return name.matches("^[a-zA-ZåäöÅÄÖ0-9 ]+$");
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
