package org.example.oops.inhertitance;

import javax.crypto.Mac;

public class MachineTest {
    public static void main(String[] args) {
//        Machine machine = new WashingMachine();
//        machine.name();
//        WashingMachine washingMachine = (WashingMachine) machine;
//        washingMachine.wash();
//        System.out.println("==================");
//
//        machine = new Cooker();
//        machine.name();
//        Cooker cooker = (Cooker) machine;
//        cooker.cook();
//        System.out.println("======");
//        cooker = new RiceCooker();
//        cooker.name();
//        cooker.cook();
//        System.out.println("=====");
//        cooker = new PressureCooker();
//        cooker.name();
//        cooker.cook();

        // multiple constructors calling using super keyword
//        RiceCooker riceCooker = new RiceCooker(3);
//        riceCooker.cook();
//        riceCooker.getAbc();

        RiceCooker riceCooker = new RiceCooker("Rice cooker.......", 5);
        riceCooker.name();
        riceCooker.cook();

    }
}
