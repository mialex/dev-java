package org.example.o5_Generics;

public class BoxMulti<K, V> implements IBoxMulti<K, V> {
    private K key;
    private V value;

    public BoxMulti(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey()    {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
