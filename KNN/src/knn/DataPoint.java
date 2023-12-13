/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knn;

public class DataPoint {
    private double[] features;
    private int classLabel;
    private double distance;

    public DataPoint(double[] features, int classLabel, double distance) {
        this.features = features;
        this.classLabel = classLabel;
        this.distance = distance;
    }

    public double[] getFeatures() {
        return features;
    }

    public int getClassLabel() {
        return classLabel;
    }

    public double getDistance() {
        return distance;
    }
}
