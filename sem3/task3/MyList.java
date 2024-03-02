package sem3.task3;

import java.util.Iterator;

public class MyList implements Iterable<Integer> {
    private int[] elements;
    
    public MyList(int[] elements) {
        this.elements = elements;
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator();
    }
    
    private class MyListIterator implements Iterator<Integer> {
        private int currentIndex = 0;
        
        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }
        
        @Override
        public Integer next() {
            return elements[currentIndex++];
        }
    }
}
