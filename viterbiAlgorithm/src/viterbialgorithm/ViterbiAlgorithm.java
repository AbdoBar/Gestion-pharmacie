/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viterbialgorithm;

import java.util.Arrays;

public class ViterbiAlgorithm {

    private double[][][] calculateViterbi(int[] observations, int[] states, double[] startProb, double[][] transitionProb, double[][] emissionProb) {
        int T = observations.length;
        int N = states.length;
        double[][] viterbi = new double[T][N];
        double[][] sigma = new double[T][N];
        double[][] W = new double[T][N];

        // Initialisation
        for (int s = 0; s < N; s++) {
            viterbi[0][s] = startProb[s] * emissionProb[s][observations[0]];
            sigma[0][s] = startProb[s] * emissionProb[s][observations[0]];
            W[0][s] = -1;
        }

        // Récursion
        for (int t = 1; t < T; t++) {
            for (int s = 0; s < N; s++) {
                double maxProb = Double.NEGATIVE_INFINITY;
                int maxState = 0;
                for (int s2 = 0; s2 < N; s2++) {
                    double prob = viterbi[t - 1][s2] * transitionProb[s2][s] * emissionProb[s][observations[t]];
                    if (prob > maxProb) {
                        maxProb = prob;
                        maxState = s2;
                    }
                }
                viterbi[t][s] = maxProb;
                sigma[t][s] = maxProb;
                W[t][s] = maxState;
            }
        }

        // Backtracking
        int[] bestPath = new int[T];
        double maxProb = Double.NEGATIVE_INFINITY;
        int maxState = 0;
        for (int s = 0; s < N; s++) {
            if (viterbi[T - 1][s] > maxProb) {
                maxProb = viterbi[T - 1][s];
                maxState = s;
            }
        }
        bestPath[T - 1] = maxState;

        for (int t = T - 2; t >= 0; t--) {
            bestPath[t] = (int) W[t + 1][bestPath[t + 1]];
            sigma[t][bestPath[t]] = 1;
        }

        double[][][] output = {viterbi, sigma, W};
        return output;
    }

    public static void main(String[] args) {
        int[] observations = {0, 0, 0,1}; // exemple d'observations
        int[] states = {0, 1,2,3}; // exemple d'états
        double[] startProb = {0.6,0.4,0,0}; // exemple de probabilités de départ
        double[][] transitionProb = {{0.5,0.5, 0,0}, {0, 0.5,0.5,0},{0,0, 0.5,0.5},{0.5,0,0,0.5}}; // exemple de probabilités de transition
        double[][] emissionProb = {{0.5, 0.5}, {0.7, 0.3},{0.5,0.5},{0.3,0.7}}; // exemple de probabilités d'émission

        ViterbiAlgorithm viterbi = new ViterbiAlgorithm();
        /*double[][] output = viterbi.calculateViterbi(observations, states, startProb, transitionProb, emissionProb);
        double[] sigma = output[1];
        double[] W = output[2];*/

  double[][][] output = viterbi.calculateViterbi(observations, states, startProb, transitionProb, emissionProb);
double[][] sigma = output[1];
double[][] W = output[2];

System.out.println("Sigma:");
for (int t = 0; t < observations.length; t++) {
    for (int s = 0; s < states.length; s++) {
        System.out.print(sigma[t][s] + " ");
    }
    System.out.println();
}

System.out.println("W:");
for (int t = 0; t < observations.length; t++) {
    for (int s = 0; s < states.length; s++) {
        System.out.print(W[t][s] + " ");
    }
    System.out.println();
}
    }}

