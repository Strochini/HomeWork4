public class Main {
    public static void main(String[] args) {

        var firstBoxerWeight = 78.2;
        System.out.println("First boxer weight " + firstBoxerWeight);
        var secondBoxerWeight = 82.7;
        System.out.println("Second boxer Weight " + secondBoxerWeight);

        var bothBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Both boxers weight " + bothBoxersWeight);

        var bothBoxersWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Both boxers weight difference " + bothBoxersWeightDifference);

        var weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Weight difference " + weightDifference);



    }
}