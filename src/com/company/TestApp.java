package com.company;

public class TestApp  {

    public static void main(String[] args) {
        MenuGlowne MenuGlownestworz = new MenuGlowne();
        MenuGlownestworz.MenuPomocPole.tematPomocy();
        MenuGlownestworz.MenuWidokPole.MenuPowiekszeniePole.normalny();
        MenuGlownestworz.MenuPlikPole.zamknij();
        MenuGlownestworz.MenuEdycjaPole.znajdz();
    }
}

class MenuGlowne{
    MenuPomoc MenuPomocPole = new MenuPomoc();
    MenuWidok MenuWidokPole = new MenuWidok();
    MenuPlik MenuPlikPole = new MenuPlik();
    MenuEdycja MenuEdycjaPole = new MenuEdycja();

}

class MenuPomoc {
    void InformacjeOProgramie() {}
    void tematPomocy() {
        System.out.println("O Pomocy");

    }
}

class MenuEdycja {
    void cofnij() {}
    void kopiuj() {}
    void ponow() {}
    void usun() {}
    void wklej(){}
    void wytnij() {}
    void znajdz() {
        System.out.println("Znajduje");
    }

}
class MenuPlik {
    void otworz() {}
    void zakoncz() {}
    void zamknij() {
        System.out.println("Zamykam");
    }
    void zapisz() {}
    void zapiszJako() {}

}
class MenuWidok {
    MenuPowiekszenie MenuPowiekszeniePole = new MenuPowiekszenie();
    void pasekStanu() {}
    void pokazMapeBitowa() {}
    void powiekszenie() {}
    void przybornik() {}
    void selektorKoloru() {}

}
class MenuPowiekszenie {
    void duzy() {}
    void niestandardowy() {}
    void normalny() {
        System.out.println("A ja jestem normalny");
    }
    void pokazMiniature() {}
    void pokazSiatke() {}


}
