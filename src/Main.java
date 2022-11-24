import java.time.LocalDate;
class Student{
    private int id,course;
    private String surname,name,fathername,adress,phone_number,faculty,group;
    private LocalDate birthdate;
    Student(int id,int course,String surname,String name,String fathername,String adress,String phone_number,String faculty,String group,LocalDate birthdate){
        this.id=id;
        this.course=course;
        this.surname=surname;
        this.name=name;
        this.fathername=fathername;
        this.adress=adress;
        this.phone_number=phone_number;
        this.faculty=faculty;
        this.group=group;
        this.birthdate=birthdate;
    }
    String Get_faculty(){
        return faculty;
    }
    int Get_year(){
        return birthdate.getYear();
    }
    String Get_group(){
        return group;
    }
    void Out(){
        System.out.println(id+" "+group+" "+faculty+" "+birthdate);
    }

    @Override
    public String toString() {
        return "Student: " +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + adress + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'';
    }
}
public class Main {
    static int N=3;
    static Student[] students = new Student[N];

    public static void main(String[] args) {
        students[0]=new Student(1,2,"Zerbino","Dmitro","Dmitrovich","adress1","101","inem","KH-203",LocalDate.of(2001,12,3));
        students[1]=new Student(2,1,"Melnyk","Alexander","Alexandrovich","adress2","102","ikni","KH-107",LocalDate.of(1999,12,3));
        students[2]=new Student(3,1,"Mask","X Æ A-12","Ilonivich","adress3","103","inem","KH-107",LocalDate.of(2005,12,3));

        System.out.println("Повний список:");
        for(int i=0;i<3;i++){
            System.out.println(students[i].toString());
        }
        System.out.println("\nСписок факультету inem:");
        for(int i=0;i<3;i++){
            if(students[i].Get_faculty()=="inem"){
                System.out.println(students[i].toString());
            }
        }
        System.out.println("\nСписок групи КН-107:");
        for(int i=0;i<3;i++){
            if(students[i].Get_group()=="KH-107"){
                System.out.println(students[i].toString());
            }
        }
        System.out.println("\nСписок список студентів які народилися після 2000 року:");
        for(int i=0;i<3;i++){
            if(students[i].Get_year()>2000){
                System.out.println(students[i].toString());
            }
        }
    }
}