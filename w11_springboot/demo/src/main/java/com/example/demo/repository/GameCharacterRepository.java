package com.example.demo.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.GameCharacter;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters(){
        characters = List.of(
            new GameCharacter("Dante", "M", "Warrior"),
            new GameCharacter("Toomas", "M", "Vikingr"),
            new GameCharacter("Maria", "F", "Wizard"),
            new GameCharacter("Johnny", "M", "Healer")
            );
        return characters;
    
    
        }




}