class stu {
    int roll;
    double marks;
    String name;
    void display() {
        System.out.print("Roll no: " + roll);
        System.out.print("Marks: " + marks);
        System.out.print("Name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("Student Information");
        stu st = new stu();
        st.display();
    }
}