class Info {
    boolean valueSet = false;
    synchronized void InfoThread(int id) {
        if (id == 1) {
            while(valueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Ошибка!");
                }
            }
            System.out.println(Thread.currentThread().getName());
            valueSet = true;
            notify();
        }
        else if (id == 2) {
            while(!valueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Ошибка!");
                }
            }
            System.out.println(Thread.currentThread().getName());
            valueSet = false;
            notify();
        }
    }
}

class NewThread implements Runnable {
    Thread t;
    Info info;
    int id;
    NewThread(int id_p, Info info) {
        id = id_p;
        this.info = info;
        t = new Thread(this, "Поток" + id);
        System.out.println("Поток создан: " + t);
        t.start();
    }
    public void run() {
        while(true) {
            try {
                info.InfoThread(id);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван.");
            }
        }
    }
}

class Main {
    public static void main(String args[]) {
        Info info = new Info();
        new NewThread(1, info);
        new NewThread(2, info);
    }
}
