public class DeadLock {
    private static final String deadLockObject1 = "Resource 1";
    private static final String deadLockObject2 = "Resource 2";

    public static void main(String[] args) {
        Thread threadOne = new Thread() {
            public void run() {
                synchronized (deadLockObject1) {
                    System.out.println("1 поток заблокировал " + deadLockObject1);

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {}

                    synchronized (deadLockObject2) {
                        System.out.println("1 поток заблокировал " + deadLockObject2);
                    }
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                synchronized (deadLockObject2) {
                    System.out.println("2 поток заблокировал " + deadLockObject2);

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {}

                    synchronized (deadLockObject1) {
                        System.out.println("2 поток заблокировал " + deadLockObject1);
                    }
                }
            }
        };

        threadOne.start();
        threadTwo.start();
    }
}
