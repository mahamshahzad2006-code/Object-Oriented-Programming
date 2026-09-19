class Task1Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "SP26-BAI-027";
        s1.name = "Maham";
        s1.completedCredits = 18;

        s2.studentId = "SP26-BAI-025";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 21;

        s3.studentId = "SP26-BAI-026";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 15;

        System.out.println("=== BEFORE CHANGE ===");
        System.out.println(s1.studentId + " " + s1.name + " credits = " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " credits = " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " credits = " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 9;
        System.out.println();

        System.out.println("=== AFTER CHANGING ONLY s2 ===");
        System.out.println(s1.studentId + " " + s1.name + " credits = " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " credits = " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " credits = " + s3.completedCredits);

        // s1, s2 and s3 refer to three different objects, and each object keeps its own
        // copy of completedCredits, so writing through s2 changes only that object.
    }
}
