package com.akhil;

import javax.swing.*;

public class ShowInputDialogBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name-:");
        JOptionPane.showMessageDialog(null, "hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "your age is " + age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
        JOptionPane.showMessageDialog(null, "you are " + height + " cm tall");
    }
    }
