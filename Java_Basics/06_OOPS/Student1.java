class Student{

    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(){
        return m1+ m2+ m3;
    }

    public double average(){
        return (float)total() /3;
    }

    public char grade(){
        if (average() >= 60){
            return 'A';
        }else{
            return 'B';
        }
    }

    public String toString(){
        return "Roll no: "+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }

}



class Student1{

    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 33;
        s.name = "John";
        s.course = "Computer Science";
        s.m1 = 55;
        s.m2 = 75;
        s.m3 = 45;

        System.out.println("Total Score: "+s.total());
        System.out.println("Average: "+s.average());
        System.out.println("Grade: "+s.grade());
        System.out.println("Details:\n "+s);
    }


}