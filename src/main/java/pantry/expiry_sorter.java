package main.java.pantry;
import java.util.Comparator;
public class expiry_sorter implements Comparator<Item> 
{
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getExpDate().compareTo(o2.getExpDate());
    }
}
