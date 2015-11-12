package myjava.designpattern.iterator;

public class DinerMenu {
	static final int Max_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu()
    {
        menuItems = new MenuItem[Max_ITEMS];
        addItem("香菇豆腐饭", "香菇豆腐", false, 10.5);
        addItem("蛋炒饭","哈哈",false,8.5);
        addItem("鱼香肉丝","你猜",true,15.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems>Max_ITEMS)
        {
            System.out.println("菜单已满");
        }
        else
        {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    
    public Iterator createIterator(){
    	return new DinerMenuIterator(menuItems);
    }
    
    
    public MenuItem[] GetMenuItems()
    {
        return menuItems;
    }
}
