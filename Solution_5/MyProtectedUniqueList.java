package Solution_5;


import SortList.Item;

import java.util.*;

public class MyProtectedUniqueList<T> implements Iterable<T> {
    //DATA
    private List<T> words = new ArrayList<>();
    private String key;
    private int counter = 0;

    MyProtectedUniqueList(String key) {
        this.key = key;
    }

    //Func
    public void Add(String password, T s) {
        if (s.equals(null) || s == "") throw new NullPointerException("input is null");
        if (key.equals(password)) {
            words.add(s);
            counter++;
        } else {
            throw new RuntimeException("Invalid key");
        }
    }

    public void Remove(String password, T s) {
        if (s.equals(null) || s == "") throw new NullPointerException("Input is empty");

        if (key.equals(password)) {
            counter--;
            words.remove(s);
        } else {
            throw new RuntimeException("Invalid key");
        }
    }

    public void RemoveAt(String password, int index) {
        if (index < 0) throw new ArrayIndexOutOfBoundsException("Input is empty");
        if (key.equals(password)) {
            counter--;
            words.remove(index);
        } else {
            throw new RuntimeException("Invalid key");
        }
    }

    public void Clear(String password) {
        if (key.equals(password)) {
            words.clear();
            counter = 0;
        } else {
            throw new RuntimeException("Invalid key");
        }
    }

    public void Sort(String password) {
        if (key.equals(password)) {
            words.sort((o1, o2) -> words.hashCode());
        } else {
            throw new RuntimeException("Invalid key");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int itrCount = 0;

            @Override
            public boolean hasNext() {
                return itrCount < counter;
            }

            @Override
            public T next() {
                return words.get(itrCount++);
            }
        };
    }

    public String ToString() {
        return toString();
    }

    @Override
    public String toString() {
        return "MyProtectedUniqueList{" +
                "words=" + words +
                ", key='" + key + '\'' +
                ", counter=" + counter +
                '}';
    }
}
