package org.example.oops.inhertitance;

public class RiceCooker extends Cooker{

    private String name;
    private int items;

    public RiceCooker(){
    }

    public RiceCooker(String name){
        super(name); // super keyword used in the first line of the constructor
        System.out.println("Inside Rice Cooker name... constructor ");
    }

    public RiceCooker(int items){
        super(items);
        super.abc = "abc";
        System.out.println("Inside Rice cooker Items... constructor");
    }

    public RiceCooker(String name, int items){
//        this(items);
//        this(name);
        super(name, items);
        System.out.println("Rice cooker ... All Args constructor ");
    }



    @Override
    public void name() {
        System.out.println("Inside Rice cooker class name() ");
        super.name();
//        System.out.println("Rice Cooker!!");
    }

    public void cook(){
        System.out.println("Inside Rice cooker class item() ");
        super.cook();
//        System.out.println("Cooks Rice!!");
    }

    public void getAbc(){
        System.out.println(super.abc);
    }
}
