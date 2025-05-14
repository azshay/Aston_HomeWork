public class LiveLock {
    private static final String liveLockObject = "Resource 1";
    private static boolean firstThreadNotBusy = true;

    public static void main(String[] args) {
        Thread threadOne = new Thread() {
            public void run() {
                while (true) {
                    synchronized (liveLockObject) {
                        if (!firstThreadNotBusy) {
                            try {
                                liveLockObject.wait();
                            } catch (InterruptedException e) {}
                        }

                        System.out.println("1");
                        firstThreadNotBusy = false;
                        liveLockObject.notify();
                    }
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                while (true) {
                    synchronized (liveLockObject) {
                        if (firstThreadNotBusy) {
                            try {
                                liveLockObject.wait();
                            } catch (InterruptedException e) {}
                        }

                        System.out.println("2");
                        firstThreadNotBusy = true;
                        liveLockObject.notify();
                    }
                }
            }
        };

        threadOne.start();
        threadTwo.start();
    }
}
