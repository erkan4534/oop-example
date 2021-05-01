package service;

import model.Instuctor;

public class InstuctorManager extends UserManager{

    private Instuctor instuctor;

    public InstuctorManager(Instuctor instuctor) {
        this.instuctor=instuctor;
    }

    @Override
    public void add() {
        System.out.println(instuctor.getName() +" "+ instuctor.getSurname()+" isimli yeni egitmen eklendi");
    }

    @Override
    public void update() {
        System.out.println(instuctor.getName() +" "+ instuctor.getSurname()+" isimli egitmenin bilgileri guncellendi");
    }

    @Override
    public void delete() {
        System.out.println(instuctor.getName() +" "+ instuctor.getSurname()+" isimli egitmen sistemden silindi");
    }
}
