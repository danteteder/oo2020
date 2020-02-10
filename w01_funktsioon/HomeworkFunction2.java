/*
Step 1: Identify the character within the sentence.
Step 2: Find that character’s location within the alphabet.
Step 3: Identify that characters location + the key in the alphabet.
Note* if the location + key > 26, loop back around and begin counting at one.
Step 4: Build a new sentence using the new characters in place of the original characters.
Step 5: repeat until sentence length is reached. (For loop).
Step 6: return result.
*/
public String Encryption(String input, int key){        
    StringBuilder encrypted = new StringBuilder(input);        
    
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";        
    String alphabet2 = alphabet.toLowerCase();        
    String keyedalphabet = alphabet.substring(key) + alphabet.substring(0, key);        
    for (int q = 0; q < encrypted.length(); q++) {            
        char currChar = encrypted.charAt(q);            
        int index = alphabet.indexOf(currChar);            
        if (index != -1) {                
            char newChar = keyedalphabet.charAt(index);                
            encrypted.setCharAt(q, newChar);            
        }            
    index = alphabet2.indexOf(currChar);            
        if (index != -1) {                
            String keyedalphabet2 = keyedalphabet.toLowerCase();                
            char newChar = keyedalphabet2.charAt(index);                
            encrypted.setCharAt(q, newChar);            
        }        
}        
return encrypted.toString();    
}

//help from https://www.freecodecamp.org/news/how-to-code-the-caesar-cipher-an-introduction-to-basic-encryption-3bf77b4e19f7/