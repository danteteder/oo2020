public String Encryption(String input, int key){
    StringBuilder encrypted = new StringBuilder(input);
    //id char lauses
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabet2 = alphabet.toLowerCase();
    String keyedalphabet = alphabet.substring(key) + alphabet.substring(0, key);
    //loopid through
    for (int i = 0; i < encrypted.length(); i++) {
        char currChar = encrypted.charAt(i);
        int index = alphabet.indexOf(currChar);
        //saa aru miks index != -1
        if (index != -1) {
            char newChar = keyedalphabet.charAt(index);
            encrypted.setCharAt(i, newChar);
        }
    index = alphabet2.indexOf(currChar);
        if (index != -1) {
            String keyedalphabet2 = keyedalphabet.toLowerCase();                
            char newChar = keyedalphabet2.charAt(index);                
            encrypted.setCharAt(i, newChar);            
        }
}
//output    
return encrypted.toString();    
}
