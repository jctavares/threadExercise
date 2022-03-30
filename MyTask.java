public class MyTask extends Thread {
    private String anyData;

    public MyTask(String anyData) {
        this.anyData = anyData;
        this.run();
    }

    public void run() {
            new Thread("Teste");
            System.out.println("[" + Thread.currentThread().getName() + Thread.currentThread().getId() + "] [data=" + this.anyData + "] Message ");
    }
}
