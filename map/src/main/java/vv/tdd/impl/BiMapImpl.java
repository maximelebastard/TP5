package vv.tdd.impl;

/**
 * Created by Simon on 30/09/14.
 */
public class BiMapImpl<K,V> extends SimpleMapImpl<K,V> implements vv.tdd.BiMap<K,V> {

    @Override
    public K getByValue(Object value) {
        K result = null;
        for(Object o:map.keySet()){
            if(map.get(o).equals(value)) {
                result = (K) o;
                break;
            }
        }
        return result;
    }

    @Override
    public K removeValue(Object value) {
        K result = null;
        for(Object o:map.keySet()){
            if(map.get(o).equals(value)) {
                map.remove(o, value);
                result = (K) o;
                break;
            }
        }
        return result;
    }

    @Override
    public V put(K key, V value) {
        K existingKey = getByValue(value);
        if(existingKey != null) {
            remove(existingKey);
        }
        return super.put(key, value);
    }
}
