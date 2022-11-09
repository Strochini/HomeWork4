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



        var workingHours = 640;
        var employeesWorkingHours = 8;

        var totalEmployees = workingHours / employeesWorkingHours;
        System.out.println("Всего работников в компании " + totalEmployees + " Человек");

        totalEmployees = totalEmployees + 94;
        var ifTotalEmployees = workingHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего по " + ifTotalEmployees + " часов работы может быть поделено между сотрудниками");
    }
}