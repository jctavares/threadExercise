public class InstantiateUsingOnlyThread {
    public static void main(String[] args) {
/*
        System.out.println("Thread main iniciada");
        Thread thread1 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread2 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        thread1.start();
        thread2.start();
        System.out.println("Thread main finalizada");
 */
/*
        System.out.println("Thread iniciada");
        Thread thread1 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread2 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread3 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread4 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread5 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread6 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread7 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread8 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread9 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        Thread thread10 = new MyTask("quaisquer dados que o thread possa necessitar para processar ");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        System.out.println("Thread main finalizada");
 */
        while (true) {
            new MyTask("Thread automática");
        }
    }
}
