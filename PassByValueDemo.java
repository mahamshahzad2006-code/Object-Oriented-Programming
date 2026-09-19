class PassByValueDemo {

    void changeNumber(int x) {
        System.out.println("  Inside changeNumber, x received = " + x);
        x = 99;
        System.out.println("  Inside changeNumber, x after assignment = " + x);
    }

    void changeStudent(Student st) {
        System.out.println("  Inside changeStudent, credits received = " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("  Inside changeStudent, credits after mutation = " + st.completedCredits);
    }

    void replaceStudent(Student st) {
        System.out.println("  Inside replaceStudent, name received = " + st.name);
        st = new Student();
        st.name = "Temporary";
        System.out.println("  Inside replaceStudent, parameter now points to = " + st.name);
    }

    public static void main(String[] args) {
        PassByValueDemo demo = new PassByValueDemo();

        int credits = 18;
        System.out.println("EXPERIMENT A - primitive");
        System.out.println("  Before : credits = " + credits);
        demo.changeNumber(credits);
        System.out.println("  After : credits = " + credits);

        Student student = new Student();
        student.studentId = "SP26-BAI-027";
        student.name = "Maham";
        student.completedCredits = 18;

        System.out.println();
        System.out.println("EXPERIMENT B - object mutation");
        System.out.println("  Before : " + student.summary());
        demo.changeStudent(student);
        System.out.println("  After : " + student.summary());

        System.out.println();
        System.out.println("EXPERIMENT C - parameter reassignment");
        System.out.println("  Before : " + student.summary());
        demo.replaceStudent(student);
        System.out.println("  After : " + student.summary());

        // In every call the argument value is copied into the parameter.
    }
}
