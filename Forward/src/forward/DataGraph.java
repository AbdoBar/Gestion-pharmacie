/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forward;

/**
 *
 * @author dadab
 */
public class DataGraph {
        double[] initialStateProbabilities ;
        Double[][] transitionMatrix ;
        double[][] emissionMatrix ;
        int[] observations ;
        
    public double[] getInitialStateProbabilities() {
        return initialStateProbabilities;
    }

    public void setInitialStateProbabilities(double[] initialStateProbabilities) {
        this.initialStateProbabilities = initialStateProbabilities;
    }

    public Double[][] getTransitionMatrix() {
        return transitionMatrix;
    }

    public void setTransitionMatrix(Double[][] transitionMatrix) {
        this.transitionMatrix = transitionMatrix;
    }

    public double[][] getEmissionMatrix() {
        return emissionMatrix;
    }

    public void setEmissionMatrix(double[][] emissionMatrix) {
        this.emissionMatrix = emissionMatrix;
    }

    public int[] getObservations() {
        return observations;
    }

    public void setObservations(int[] observations) {
        this.observations = observations;
    }
   
}
