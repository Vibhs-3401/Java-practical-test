package com.company.aopdemo;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

public class Increment {

    int squares = 81;

    public static void main(String[] args) {
        new Increment().go();
    }

    void go() {
        incr(++squares);
        System.out.println(squares);
    }

    void incr(int squares) {
        squares += 10;
    }
}
