public class HookThread {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            System.out.println("Shutdown hook started");
            
        try{
             Thread.sleep(2000);
            System.out.println("Cleanup Task Completed");
        } catch (InterruptedException e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }

        System.out.println("shutdawn hook thread finished");


        }));

        System.out.println("Application started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
        System.out.println("application Finished");
    }
    
}
