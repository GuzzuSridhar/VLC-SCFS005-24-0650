package com.ntuc.generics.classes;

// Generic class with One type
public class GenericClass<T> {
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}

// Generic Class with 2 types
class MyGeneric<K, V> {
    private K k;
    private V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

}
