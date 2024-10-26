package com.ntuc.cmdlineargs;

public class Options {
    public static void main(String[] args) {
        Options o = new Options();
        if (args[0].equalsIgnoreCase("sum")) {
            o.sum();
        } else if (args[0].equalsIgnoreCase("diff")) {
            o.diff();
        }
    }

    void sum() {
        int i = 10, j = 20;
        System.out.println(i + j);
    }

    void diff() {
        int i = 10, j = 20;
        System.out.println(i - j);
    }
}
