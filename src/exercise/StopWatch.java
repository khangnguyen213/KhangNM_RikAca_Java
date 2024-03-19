package exercise;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        clock.start();
        System.out.println(clock.startTime);
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        clock.end();
        System.out.println(clock.endTime);
        clock.getElapsedTime();
    }
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        System.out.println("Elapsed time: " + (this.endTime - this.startTime) + " milliseconds");
    }

}
