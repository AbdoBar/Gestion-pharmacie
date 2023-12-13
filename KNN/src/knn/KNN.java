
package knn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KNN {
    private int k;

    public KNN(int k) {
        this.k = k;
    }

    public int predict(List<DataPoint> trainingSet, DataPoint testInstance) {
        List<DataPoint> neighbors = getNeighbors(trainingSet, testInstance);
        int[] classCounts = new int[2]; // Assuming binary classification
        for (DataPoint neighbor : neighbors) {
            classCounts[neighbor.getClassLabel()]++;
        }
        return (classCounts[0] > classCounts[1]) ? 0 : 1;
    }

    private List<DataPoint> getNeighbors(List<DataPoint> trainingSet, DataPoint testInstance) {
        List<DataPoint> distances = new ArrayList<>();
        for (DataPoint trainingInstance : trainingSet) {
            double distance = euclideanDistance(trainingInstance, testInstance);
            distances.add(new DataPoint(trainingInstance.getFeatures(), trainingInstance.getClassLabel(), distance));
        }
        Collections.sort(distances, Comparator.comparing(DataPoint::getDistance));
        List<DataPoint> neighbors = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            neighbors.add(distances.get(i));
        }
        return neighbors;
    }

    private double euclideanDistance(DataPoint instance1, DataPoint instance2) {
        double sum = 0.0;
        for (int i = 0; i < instance1.getFeatures().length; i++) {
            double diff = instance1.getFeatures()[i] - instance2.getFeatures()[i];
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }
}
