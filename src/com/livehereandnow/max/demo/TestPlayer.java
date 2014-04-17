/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max.demo;

import com.livehereandnow.max.Agriculture;
import com.livehereandnow.max.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chenp_000
 */
public class TestPlayer {

    public static void main(String[] args) throws IOException {
        Player p1 = new Player();
        p1.get礦場(0);
        System.out.println(p1.get礦場(0));
        p1.get礦場(0).set黃點(999);
        System.out.println(p1.get礦場(0));
        for (int k = 0; k < 4; k++) {
            System.out.println("礦場" + k + " " + p1.get礦場(k));
        }
        for (int k = 0; k < 4; k++) {
            System.out.println("農業" + k + " " + p1.get農業(k));
        }

    }

}
