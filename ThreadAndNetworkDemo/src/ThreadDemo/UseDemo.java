package ThreadDemo;

public class UseDemo {
    public static void main(String[] args) {
        GetNameThreadDemo ctd1 = new GetNameThreadDemo("李白");
//        CreateThreadDemo ctd2 = new CreateThreadDemo();
        // 运行多线程
        ctd1.start();
//        ctd2.start();
    }
}

// 1. 创建多线程类：
// 1.1 方法一：继承Throws类--->并且重写run方法------->实例化后-------->启动start()方法。
class CreateThreadDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }
}

// 2 设置或者获取线程的名字
// 2.1 方法一：重写一个空构造方法和一个携带name参数的构造方法，该方法调用super(name)方法。就可以在创建实例的时候指定进程名字。
class GetNameThreadDemo extends Thread {
    public GetNameThreadDemo() {
    }

    public GetNameThreadDemo(String name) {
        super(name);
    }

    // 2.2 方法二：通过thread自带的setName和getName方法设置线程名和获取线程名
    private void test(String name) {
        this.setName(name);
        System.out.println("this.getName() = " + this.getName());
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName() + ":" + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 3. 线程的优先级设置，优先级只是为了让该线程更大几率进行执行,数值越大越好1-10。
class prioriThreadDemo {
    public static void main(String[] args) {
        GetNameThreadDemo gtd1 = new GetNameThreadDemo("李白");
        GetNameThreadDemo gtd2 = new GetNameThreadDemo("王安石");
        GetNameThreadDemo gtd3 = new GetNameThreadDemo("杜甫");

        //设置优先级
        gtd1.setPriority(10);
        gtd2.setPriority(1);
        gtd3.setPriority(5);

        gtd1.start();
        gtd2.start();
        gtd3.start();

    }
}

// 4. 线程的控制,线程会依托于主进程的存在.并且可以对线程的状态进行控制
// 4.1 Thread.sleep(1000)：暂停1000ms,并且同一时间的几个线程也会进行抢占事件
class sleepThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ":" + i);
            try {
                //4.1 休息1s
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class sleepThreadDemo {
    public static void main(String[] args) {
        sleepThread gtd1 = new sleepThread();
        sleepThread gtd2 = new sleepThread();
        sleepThread gtd3 = new sleepThread();
        gtd1.setName("王安石");
        gtd2.setName("李白");
        gtd3.setName("杜甫");
        gtd1.start();
        gtd2.start();
        gtd3.start();
    }
}

// 4.2 Thread.join()：等待这个线程死亡，其他线程才能开始执行。
class joinThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }
}

class joinThreadDemo {
    public static void main(String[] args) {
        joinThread gtd1 = new joinThread();
        joinThread gtd2 = new joinThread();
        joinThread gtd3 = new joinThread();
        gtd1.setName("王安石");
        gtd2.setName("李白");
        gtd3.setName("杜甫");
        gtd1.start();
        try {
            gtd1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gtd2.start();
        gtd3.start();
    }
}

// 4.3 Thread.setDaemon用来设置守护线程的，其中当java虚拟机运行的线程都是守护线程时，将停止运行
class daemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }
}

class daemonThreadDemo {
    public static void main(String[] args) {
        daemonThread gtd1 = new daemonThread();
        daemonThread gtd2 = new daemonThread();
        daemonThread gtd3 = new daemonThread();
        gtd1.setName("王安石");
        gtd2.setName("李白");
        gtd3.setName("杜甫");
        // 设置守护线程
        gtd1.setDaemon(true);
        gtd2.setDaemon(true);
        gtd3.setDaemon(true);

        gtd1.start();
        gtd2.start();
        gtd3.start();
        for (int i = 0; i < 9; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);

        }
    }
}