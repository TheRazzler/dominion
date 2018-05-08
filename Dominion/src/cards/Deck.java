/**
 * 
 */
package cards;

import java.util.Random;

/**
 * @author Spencer Yoder
 *
 */
public class Deck implements Comparable<Deck> {
    private Node top;
    private Node bottom;
    private int size;
    public Deck(Card type, int amount) {
        for(int i = 0; i < amount; i++) {
            insert(type.duplicate());
        }
    }
    
    public Deck() {
        //Nothing to explicitly initialize
    }
    
    /**
     * @param duplicate
     */
    public void insert(Card c) {
        Node n = new Node(c, top);
        if(top == null) {
            bottom = n;
        }
        top = n;
        size++;
    }
    
    public Card draw() {
        if(top != null) {
            Card c = top.c;
            top = top.next;
            size--;
            return c;
        }
        return null;
    }
    
    public void shuffle(int seed) {
        Random r = new Random(seed);
        for(int i = 1; i <= size * 2; i++) {
            int bound = r.nextInt(size);
            Node current = top;
            for(int j = 1; j <= bound; j++) {
                current = current.next;
            }
            Card c = current.c;
            current.c = top.c;
            top.c = c;
        }
    }
    
    public void combine(Deck other) {
        bottom.next = other.top;
        bottom = other.bottom;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int getPrice() {
        return top.c.getPrice();
    }

    private class Node {
        private Card c;
        private Node next;
        private Node(Card c, Node next) {
            this.c = c;
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Deck other) {
        return top.c.compareTo(other.top.c);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if(top != null) {
            sb.append(top.c.toString());
            Node current = top.next;
            while(current != null) {
                sb.append(", " + current.c.toString());
                current = current.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
