/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forwardalgorithmdiagram2;

import java.awt.Color;
import java.util.Arrays;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;

public class ForwardAlgorithm {

    // Define the HMM parameters
    private final int numStates;
    private final int numObservations;
    private final double[] initialStateProbabilities;
    private final double[][] transitionMatrix;
    private final double[][] emissionMatrix;

    // Constructor to initialize the HMM parameters
    public ForwardAlgorithm(int numStates, int numObservations, double[] initialStateProbabilities, double[][] transitionMatrix, double[][] emissionMatrix) {
        this.numStates = numStates;
        this.numObservations = numObservations;
        this.initialStateProbabilities = initialStateProbabilities;
        this.transitionMatrix = transitionMatrix;
        this.emissionMatrix = emissionMatrix;
    }

    // Implement the Forward Algorithm
    public double[][] computeForwardVariable(int[] observations) {
        int T = observations.length; // length of the observation sequence
        double[][] alpha = new double[numStates][T]; // initialize the forward variable

        // Compute the forward variable for time t=0
        for (int i = 0; i < numStates; i++) {
            alpha[i][0] = initialStateProbabilities[i] * emissionMatrix[i][observations[0]];
        }

        // Compute the forward variable for times t=1 to T-1
        for (int t = 1; t < T; t++) {
            for (int j = 0; j < numStates; j++) {
                double sum = 0.0;
                for (int i = 0; i < numStates; i++) {
                    sum += alpha[i][t-1] * transitionMatrix[i][j];
                }
                alpha[j][t] = sum * emissionMatrix[j][observations[t]];
            }
        }

        return alpha;
    }
private static double[] convertToIntArray(int[] arr) {
    double[] newArr = new double[arr.length];
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = (double) arr[i];
    }
    return newArr;
}

    // Main method to test the Forward Algorithm and plot the alpha values
    public static void main(String[] args) {
        int numStates = 2;
        int numObservations = 4;
        double[] initialStateProbabilities = {0.6, 0.4,0};
        double[][] transitionMatrix = {{1, 0.0}, {0.5, 0.5},{0, 1}};
        double[][] emissionMatrix = {{0.3, 0.5, 0.2}, {0, 0.3, 0.7},{0, 0, 1}};
        int[] observations = {0, 0, 1,1};
        ForwardAlgorithm forward = new ForwardAlgorithm(numStates, numObservations, initialStateProbabilities, transitionMatrix, emissionMatrix);
        double[][] alpha = forward.computeForwardVariable(observations);

        // Create a dataset for the alpha values
        DefaultXYDataset dataset = new DefaultXYDataset();
        for (int i = 0; i < numStates; i++) {
            double[] values = Arrays.copyOfRange(alpha[i], 0, observations.length);
            dataset.addSeries("State " + i, new double[][]{convertToIntArray(observations), values});
           // dataset.addSeries("State " + i, new double[][]{observations, values});
        }

        // Create a line chart of the alpha values
        JFreeChart chart = ChartFactory.createXYLineChart("Forward Algorithm", "Time", "Alpha Values", dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.white);
        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);

        // Add the chart to a frame and
ChartFrame frame = new ChartFrame("Forward Algorithm", chart);
frame.pack();
frame.setVisible(true);
}
}