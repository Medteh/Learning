package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Wirehouse wirehouse1 = new Wirehouse();
        Courier courier1 = new Courier(wirehouse1);
        Picker picker1 = new Picker(wirehouse1);

        Task1.businessProcess(courier1);
        Task1.businessProcess(picker1);
        System.out.println("--------------------------------------------------");

        System.out.println(wirehouse1);
        System.out.println(courier1);
        System.out.println(picker1);

        Wirehouse wirehouse2 = new Wirehouse();
        Courier courier2 = new Courier(wirehouse2);
        Picker picker2 = new Picker(wirehouse2);

        courier2.doWork();
        picker2.doWork();
        System.out.println("--------------------------------------------------");

        System.out.println(wirehouse1);
        System.out.println(courier1);
        System.out.println(picker1);



    }
}
