package Step1Files;

public class Scroll extends Item {
    private String name;
    private int room;
    private int serial;
    private ItemActions effect = null;
    public Scroll(String _name, int _room, int _serial){
        System.out.println("New scroll being created");
        name = _name;
        System.out.println("Scroll name is " + name);
        room = _room;
        System.out.println("Room number is " + room);
        serial = _serial;
        System.out.println("Serial number is " + serial);
        this.setType('?');
    }

    public String getName(){
        return name;
    }

    public void setScrollAction(ItemActions _effect){
        effect = _effect;
    }

    public ItemActions getScrollAction(){
        return effect;
    }

    
}
