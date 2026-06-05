public class App {
    public static void main(String[] args) {
        Worker worker = new Worker("Джон");
        worker.atWork();

        try {
            worker.work();
        } catch (WorkerIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}
