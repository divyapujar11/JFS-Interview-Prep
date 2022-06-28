class Finalkey{
    final int speedlimit=90;
    void run(){
        // error compile time error
        // speedlimit=100;
        System.out.println("run() will not execute because of compile error");
    }
    public static void main(String[] args) {
        Finalkey key = new Finalkey();
        key.run();
    }
}