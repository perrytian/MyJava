package myjava.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu
{
    ArrayList menuItems;
    public PancakeHouseMenu()
    {
        menuItems = new ArrayList();
        addItem("牛奶", "牛奶description", false, 3.0);
        addItem("油条","油条description",false,1.0);
        addItem("馒头","馒头description",true,1.0);
        addItem("豆浆", "DoujiangDescription", true, 1.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem( name,  description,  vegetarian,  price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
    	return menuItems.iterator();
    }
    
    public ArrayList getMenuItems()
    {
        return menuItems;
    }
}
