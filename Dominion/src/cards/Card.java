/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public abstract class Card implements Comparable<Card> {
    
    private String name;
    private String description;
    private int type;
    private int price;
    
    public Card(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    public abstract void play(Dominion model);
    public abstract Card duplicate();
    
    public int getType() {
        return type;
    }
    
    @Override
    public int compareTo(Card other) {
        if(type == other.type) {
            if(price == other.price) {
                if(name.equals(other.name)) {
                    return 0;
                }
                return name.compareTo(other.name);
            }
            return price - other.price;
        }
        return type - other.type;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
