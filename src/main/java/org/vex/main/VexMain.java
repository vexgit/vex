package org.vex.main;

public interface VexMain {

    static void main(String[] args) throws InterruptedException {
        new VexMainContext().refresh();
    }

}
