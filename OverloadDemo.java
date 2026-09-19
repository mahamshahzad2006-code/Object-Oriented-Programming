class OverloadDemo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course " + courseCode + " (default section)");
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course " + courseCode + " section " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled using numeric course code " + numericCourseCode);
    }

    // Invalid overload: same signature as enroll(String), differs only by return type.
    // int enroll(String courseCode) {
    //     return 1;
    // }

    void show(long value) {
        System.out.println("show(long) selected with " + value);
    }

    void show(double value) {
        System.out.println("show(double) selected with " + value);
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

        // demo.enroll();
        // demo.enroll("241", "2");

        demo.show(10);
    }
}
