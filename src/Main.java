public class Main {
    public static void main(String[] args) {
        BodyMassIndex bmiCalculator = new BodyMassIndex(80, 1.52);
        System.out.println(bmiCalculator.getResult());
    }
}

class BodyMassIndex {
    private double weight; // Weight of human in kg
    private double height; // Height of human in meters
    private double bmi;

    public BodyMassIndex(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values.");
        }
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBmi();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be a positive value.");
        }
        this.weight = weight;
        this.bmi = calculateBmi();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be a positive value.");
        }
        this.height = height;
        this.bmi = calculateBmi();
    }

    public double getBmi() {
        return bmi;
    }

    private double calculateBmi() {
        return weight / (height * height);
    }

    public String getResult() {
        if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30) {
            return "Obesity";
        } else {
            return "Underweight";
        }
    }
}
