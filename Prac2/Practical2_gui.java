package com.mycompany.practical2_gui;

import javax.swing.*;
import java.awt.*;

// Interface
interface NumberOperations {
    double square(double n);
    double cube(double n);
    double doubleNumber(double n);
    double halfNumber(double n);
}

// Class implementing the interface
class NumberCalculator implements NumberOperations {

    @Override
    public double square(double n) {
        return n * n;
    }

    @Override
    public double cube(double n) {
        return n * n * n;
    }

    @Override
    public double doubleNumber(double n) {
        return n * 2;
    }

    @Override
    public double halfNumber(double n) {
        return n / 2;
    }
}

public class Practical2_gui extends JFrame {

    private JTextField txtNumber;
    private JLabel lblResult;

    NumberOperations calculator = new NumberCalculator();

    public Practical2_gui() {

        setTitle("Number Operations");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtNumber = new JTextField(10);
        lblResult = new JLabel("Result: ");

        JButton btnSquare = new JButton("Square");
        JButton btnCube = new JButton("Cube");
        JButton btnDouble = new JButton("Double");
        JButton btnHalf = new JButton("Half");

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Enter Number:"));
        topPanel.add(txtNumber);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSquare);
        buttonPanel.add(btnCube);
        buttonPanel.add(btnDouble);
        buttonPanel.add(btnHalf);

        JPanel resultPanel = new JPanel();
        resultPanel.add(lblResult);

        add(topPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);

        btnSquare.addActionListener(e -> performOperation("square"));
        btnCube.addActionListener(e -> performOperation("cube"));
        btnDouble.addActionListener(e -> performOperation("double"));
        btnHalf.addActionListener(e -> performOperation("half"));

        setVisible(true);
    }

    private void performOperation(String operation) {

        try {
            double num = Double.parseDouble(txtNumber.getText());
            double result = 0;

            switch (operation) {
                case "square":
                    result = calculator.square(num);
                    break;

                case "cube":
                    result = calculator.cube(num);
                    break;

                case "double":
                    result = calculator.doubleNumber(num);
                    break;

                case "half":
                    result = calculator.halfNumber(num);
                    break;
            }

            lblResult.setText("Result: " + result);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter a valid number!"
            );
        }
    }

    public static void main(String[] args) {
        new Practical2_gui();
    }
}