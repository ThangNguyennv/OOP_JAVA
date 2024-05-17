package lab6.subclasses;

public class TestStaffStudent {
    public static void main(String[] args){

        Student student1 = new Student("Huy", "Ha Long", "CNTT", 2000, 200);
        System.out.println(student1);
        student1.setAddress("Ha Noi");
        student1.setFee(500);
        student1.setProgram("KTMT");
        student1.setYear(1999);
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        System.out.println(student1.getProgram());
        System.out.println(student1.getYear());
        System.out.println(student1.getFee());

        Staff staff1 = new Staff("Long", "Ninh Binh", "HUS", 300);
        System.out.println(staff1);
        staff1.setAddress("Vinh Phuc");
        staff1.setPay(100);
        staff1.setSchool("UET");
        System.out.println(staff1.getName());
        System.out.println(staff1.getAddress());
        System.out.println(staff1.getSchool());
        System.out.println(staff1.getPay());




    }

}
