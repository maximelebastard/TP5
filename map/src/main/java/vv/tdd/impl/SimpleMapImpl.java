package vv.tdd.impl;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class SimpleMapImpl<K,V> implements Map<K,V> {

    protected Map<K,V> map = new HashMap<K,V>();


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return map.get(key);
    }

    @Override
    public V put(K key, V value) {
        return map.put(key,value);
    }

    @Override
    public V remove(Object key){
        return map.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public ArrayList<V> values() {
        return new ArrayList<V>(map.values());
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        if(map.size() == 0)
        {
            throw new NotImplementedException();
        }
        return map.entrySet();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleMapImpl<?, ?> simpleMap = (SimpleMapImpl<?, ?>) o;

        return map.equals(simpleMap.map);

    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }
}
