/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kmeans2;

import java.util.*;

public class KMeans {
    public static void main(String[] args) {
        // Set up data points
        List<DataPoint> dataPoints = new ArrayList<>();
        dataPoints.add(new DataPoint(1.0, 3.0));
        dataPoints.add(new DataPoint(2.0, 2.0));
        dataPoints.add(new DataPoint(2.0, 3.0));
        dataPoints.add(new DataPoint(2.0, 4.0));
        dataPoints.add(new DataPoint(4.0, 2.0));
        dataPoints.add(new DataPoint(5.0, 2.0));
        dataPoints.add(new DataPoint(6.0, 2.0));
        dataPoints.add(new DataPoint(7.0, 3.0));
        
        // Set up initial centroids
        List<DataPoint> centroids = new ArrayList<>();
        centroids.add(new DataPoint(2.0, 2.0));
        centroids.add(new DataPoint(2.0, 4.0)); 
        
        // Run k-means algorithm
        int numIterations = 10;
        int u=0;
        for (int i = 0; i < numIterations; i++) {
            Map<DataPoint, List<DataPoint>> clusters = new HashMap<>();
            for (DataPoint centroid : centroids) {
                
                clusters.put(centroid, new ArrayList<>());
                 //System.out.println(centroid.getX()+">"+u);
                 u++;
            }
            
            for (DataPoint dataPoint : dataPoints) {
                double minDistance = Double.MAX_VALUE;
                DataPoint closestCentroid = null;
                for (DataPoint centroid : centroids) {
                    double distance = dataPoint.distanceTo(centroid);
                    if (distance < minDistance) {
                        minDistance = distance;
                        closestCentroid = centroid;
                    }
                }
                clusters.get(closestCentroid).add(dataPoint);
            }
            for (DataPoint centroid : centroids) {
                List<DataPoint> assignedDataPoints = clusters.get(centroid);
                if (!assignedDataPoints.isEmpty()) {
                    double sumX = 0.0;
                    double sumY = 0.0;
                    for (DataPoint assignedDataPoint : assignedDataPoints) {
                        sumX += assignedDataPoint.getX();
                        sumY += assignedDataPoint.getY();
                    }
                    centroid.setX(sumX / assignedDataPoints.size());
                    centroid.setY(sumY / assignedDataPoints.size());
                }
            }
       // }
       
        // Print results
        for (DataPoint centroid : centroids) {
            if(i==9){
            System.out.println("Centroid: (" + centroid.getX() + ", " + centroid.getY() + ")");
            System.out.println("Assigned data points:");
            
            List<DataPoint> assignedDataPoints = clusters.get(centroid);
            
            for (DataPoint assignedDataPoint : assignedDataPoints) {
                System.out.println("(" + assignedDataPoint.getX() + ", " + assignedDataPoint.getY() + ")");
            }
            }
            System.out.println();
        }
        }
    }
}

class DataPoint {
    private double x;
    private double y;
    
    public DataPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double distanceTo(DataPoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y=y;
                }
}