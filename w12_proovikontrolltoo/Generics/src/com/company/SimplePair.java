package com.company;

public class SimplePair<K,V> implements Pair<K,V>{

    private K key;
    private V value;

    // Geneerika tüübid olemas nagu ?, E, T, K , V,
    //? ei täpsusta
    //e - element
    //T - Type
    //K - key
    //V - Value

    public SimplePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
}
