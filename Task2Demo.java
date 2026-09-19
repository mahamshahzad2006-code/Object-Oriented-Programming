class Task2Demo {
    public static void main(String[] args) {
        int degreeCredits = 133;

        Student first = new Student();
        first.studentId = "SP26-BAI-027";
        first.name = "Maham";
        first.completedCredits = 18;

        Student second = new Student();
        second.studentId = "SP26-BAI-025";
        second.name = "Ali Ishtiaq";
        second.completedCredits = 21;

        System.out.println("=== INITIAL STATE ===");
        System.out.println(first.summary());
        System.out.println(second.summary());

        first.addCredits(6);
        second.addCredits(3);

        System.out.println();
        System.out.println("=== AFTER addCredits ===");
        System.out.println(first.summary());
        System.out.println(second.summary());

        int firstRemaining = first.remainingCredits(degreeCredits);
        int secondRemaining = second.remainingCredits(degreeCredits);

        System.out.println();
        System.out.println("=== REMAINING CREDITS (degree = " + degreeCredits + ") ===");
        System.out.println(first.name + " still needs " + firstRemaining + " credits");
        System.out.println(second.name + " still needs " + secondRemaining + " credits");
    }
}
