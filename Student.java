class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 80) return "Grade A";
        else if (marks >= 60) return "Grade B";
        else if (marks >= 40) return "Grade C";
        else return "Grade F";
    }

    public static void main(String[] args) {
        Student student = new Student("John", 101, 85);
        System.out.println(student.name + " scored " + student.calculateGrade());
    }
}
