package com.garudabyte.master_class.thread_deadlock;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while(empty) {
            try {
                wait();
            } catch(InterruptedException e) {

            }

        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while(!empty) {
            try {
                wait();
            } catch(InterruptedException e) {

            }

        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for(int i=0; i<messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished");
            latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
    }
}


//public class Main {
//
//    public static Object lock1 = new Object();
//    public static Object lock2 = new Object();
//
//    public static void main(String[] args) {
//        new Thread1().start();
//        new Thread2().start();
//
//    }
//
//    private static class Thread1 extends Thread {
//        public void run() {
//            synchronized (lock1) {
//                System.out.println("Thread 1: Has lock1");
//                try {
//                    Thread.sleep(100);
//                } catch(InterruptedException e) {
//
//                }
//                System.out.println("Thread 1: Waiting for lock 2");
//                synchronized (lock2) {
//                    System.out.println("Thread 1: Has lock1 and lock2");
//                }
//                System.out.println("Thread 1: Released lock2");
//            }
//            System.out.println("Thread 1: Released lock1. Exiting...");
//        }
//    }
//
//    private static class Thread2 extends Thread {
//        public void run() {
//            synchronized (lock1) {
//                System.out.println("Thread 2: Has lock1");
//                try {
//                    Thread.sleep(100);
//                } catch(InterruptedException e) {
//
//                }
//                System.out.println("Thread 2: Waiting for lock2");
//                synchronized (lock2) {
//                    System.out.println("Thread 2: Has lock1 and lock2");
//                }
//                System.out.println("Thread 2: released lock2");
//            }
//            System.out.println("Thread 2: Released lock1. Exiting...");
//        }
//    }
//}



//
//public class Main {
//
//    public static void main(String[] args) {
//        final PolitePerson jane = new PolitePerson("Jane");
//        final PolitePerson john = new PolitePerson("John");
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                jane.sayHello(john);
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                john.sayHello(jane);
//            }
//        }).start();
//    }
//
//    // 1. Thread1 acquires the lock on the jane object and enters the sayHello() method.
//    // It prints to the console, then suspends.
//    // 2. Thread2 acquires the lock on the john object and enters the sayHello() method.
//    // It prints to the console, then suspends.
//    // 3. Thread1 runs again and wants to say hello back to the john object. It tries to call the sayHelloBack() method
//    // using the john object that was passed into the sayHello() method,
//    // but Thread2 is holding the john lock, so Thread1 suspends.
//    // 4. Thread2 runs again and wants to say hello back to the jane object. It tries to call the sayHelloBack() method
//    // using the jane object that was passed into the sayHello() method,
//    // but Thread1 is holding the jane lock, so Thread2 suspends.
//
//    static class PolitePerson {
//        private final String name;
//
//        public PolitePerson(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public synchronized void sayHello(PolitePerson person) {
//            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
//            person.sayHelloBack(this);
//        }
//
//        public synchronized void sayHelloBack(PolitePerson person) {
//            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
//        }
//    }
//}
//
////    A method marked with synchronized locks the critical-section (the method) using this as the lock. To enter a critical section (and lock it), a thread needs to acquire the corresponding lock. If the section is already locked, the thread is blocked at the entrance and waits for the lock to be released.
////
////        A and B are threads:
////
////        A calls jane.sayHello(john) and locks jane.
////        B calls john.sayHello(jane) and locks john.
////        Notice that sayHello is marked with synchronized.
////
////        A calls person.sayHelloBack(this), where person is john.
////        B calls person.sayHelloBack(this), where person is jane.
////        Notice that sayHelloBack is also marked with synchronized.
////
////        B holds john, so A's call john.sayHelloBack is blocked.
////
////        A holds jane, so B's call jane.sayHelloBack is blocked.
////
////        A is waiting for B to release the lock and vice versa.
////
////        Deadlock.








