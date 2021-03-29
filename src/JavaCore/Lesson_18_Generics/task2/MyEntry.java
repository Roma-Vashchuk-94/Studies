package JavaCore.Lesson_18_Generics.task2;
;
import java.util.Map;

public class MyEntry<K, V> {

    private K key;

    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyEntry: {" + "key = " + key + ", value = " + value + '}';
    }


    public static <K,V> void addToMap(Map<K,V> map, MyEntry<K,V> myEntry) {
        map.put(myEntry.getKey(), myEntry.getValue());
    }

    public static <K,V> void removeFromMapByKey(Map<K,V> map, MyEntry<K,V> myEntry) {
        map.remove(myEntry.getKey());
    }

    public static <K,V> void removeFromMapByValue(Map<K,V> map, MyEntry<K,V> myEntry) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(myEntry.getValue())) {
                map.remove(entry.getKey());
            }
        }
    }

    public static <K,V> void printKeys(Map<K,V> map) {
        System.out.println(map.keySet());
    }

    public static <K,V> void printValues(Map<K,V> map) {
        System.out.println(map.values());
    }

    public static <K,V> void printAllMap(Map<K,V> map) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println("Key - " + entry.getKey() + "; value - " + entry.getValue());
        }
    }
}
