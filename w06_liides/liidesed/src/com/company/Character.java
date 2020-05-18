package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Override overload
//implementeerime CharacterBehaviour interface, me PEAME KASUTAMA kõiki interface olevas funktsioone
public class Character implements CharacterBehaviour{

    public static void main(String[] args) {
        //klass mis implemendib mingi listi
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        Character c = new Character();
    }


        @Override
        public void move() {

        }

        @Override
        public void changeDirection() {

        }

        @Override
        public void speak() {

        }

        @Override
        public String getName() {
            return null;
        }

    @Override
    public int[] getXY() {
        return new int[0];
    }


    }


