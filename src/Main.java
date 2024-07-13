public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(91815, 20, "Kushal", "Dahal");
        employee1.setHeight(180);

        System.out.println(employee1);

        // after getting 15% pay increase
        System.out.println("Your new salary is "+employee1.getRaise() +"$/hr");

        // getting the weekly income
        System.out.println("Your total earnings for this week is "+employee1.payDay(24)+"$");
    }
}