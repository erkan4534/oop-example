package service;

import model.Student;

public class StudentManager extends UserManager {

    private Student student;

    public StudentManager(Student student) {
        this.student=student;
    }

    @Override
    public void add() {
        System.out.println(student.getName() +" "+ student.getSurname()+" isimli yeni ogrenci eklendi");
    }

    @Override
    public void update() {
        System.out.println(student.getName() +" "+ student.getSurname()+" isimli ogrenci bilgileri guncellendi");
    }

    @Override
    public void delete() {
        System.out.println(student.getName() +" "+ student.getSurname()+"isimli ogrenci sistemden silindi");
    }
}
