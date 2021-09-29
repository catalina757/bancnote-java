import javax.swing.JFrame;

class Main {
  
  public static void main(String[] args) {
    //creeaza o rama
    JFrame window = new JFrame();
    //optiunea privind butonul de inchidere a ramei - setat sa nu faca nimic
    window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    //pozitia si dimensiunea containerului
    window.setBounds(0, 0, 500, 200);
    //creeaza containerul parinte si adauga componenta dreptunghi
    window.getContentPane().add(new Dreptunghi());
    //vizibilitate rama
    window.setVisible(true);
  }

  public static int[] Bancnote() {
    //declarare si initializare array cu valoarea bancnotelor si array cu numarul bancnotelor de fiecare fel de afisat, si variabilele minim, maxim si interval folosite la calculul sumei aleatoare
    int[] bancnote = {10, 5, 1};
    int[] nrBancnote = {0, 0, 0};
    int min = 0;
    int max = 60;
    int interval = (max-min) + 1;
      
    //Generez aleator si afisez o valoare intreaga intre 0 si 60 folosindu-ma de metoda Math.random()
    //Math.random() returneaza o valoare aleatoare intre 0.0 si 1.0, astfel ca trebuie inmultit cu variabila interval pentru a genera valori intre 0 si 60
    //(int) converteste valoarea double returnata de Math.random() in int
    int aleator_int = (int)(Math.random() * interval) + min;
    System.out.println("Suma aleatoare este: " + aleator_int);
    System.out.println("Bancnotele aferente sumei aleatoare:");

    //iterez prin array de bancnote si impart valoarea aleatoare, rezultata mai sus, la valoarea bancnotei pentru a afla numarul de bancnote iar restul acestei impartiri devine noua valoare aleatoare care se imparte la valoarea bancnotei urmatoare din array
    for (int i = 0; i < bancnote.length; i++) {
      int restImpartire = aleator_int % bancnote[i];

      nrBancnote[i] = (aleator_int - restImpartire) / bancnote[i];

      aleator_int = restImpartire;

      System.out.println(nrBancnote[i] + " x " + bancnote[i] + " lei");
    }
     return nrBancnote;
  }
}
