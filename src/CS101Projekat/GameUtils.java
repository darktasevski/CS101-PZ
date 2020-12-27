package CS101Projekat;

import java.io.*;
import java.util.ArrayList;

public class GameUtils {
    public static ArrayList<Pitanje> generisiPitanjaIOdgovore() {
        ArrayList<Pitanje> listaPitanja = new ArrayList<>();

        Pitanje pitanje1 = new Pitanje();
        pitanje1.setPitanje("If you want your condition to depend upon two conditions BOTH being true, What is the proper notation to put between the two Boolean statements?");
        Odgovor[] odgovori = {new Odgovor("!", false), new Odgovor("||", false), new Odgovor("&&", true)};
        pitanje1.setOdgovori(odgovori);
        pitanje1.setIndeksTacnogOdgovora(2);
        listaPitanja.add(pitanje1);

        Pitanje pitanje2 = new Pitanje();
        pitanje2.setPitanje("Java keywords are written in lowercase as well as uppercase?");
        Odgovor[] odgovori2 = {new Odgovor("true", false), new Odgovor("false", true)};
        pitanje2.setOdgovori(odgovori2);
        pitanje2.setIndeksTacnogOdgovora(1);
        listaPitanja.add(pitanje2);

        Pitanje pitanje3 = new Pitanje();
        pitanje3.setPitanje("What is the correct syntax for java main method?");
        Odgovor[] odgovori3 = {new Odgovor("public static void main(string[] args)", false), new Odgovor("public static void main()", false), new Odgovor("public void main(String[] args)", false), new Odgovor("none of the above", true)};
        pitanje3.setOdgovori(odgovori3);
        pitanje3.setIndeksTacnogOdgovora(3);
        listaPitanja.add(pitanje3);

        Pitanje pitanje4 = new Pitanje();
        pitanje4.setPitanje(" Choose the appropriate data type for this field: isSwimmer");
        Odgovor[] odgovori4 = {new Odgovor("double", false), new Odgovor("boolean", true), new Odgovor("string", false), new Odgovor("int", false)};
        pitanje4.setOdgovori(odgovori4);
        pitanje4.setIndeksTacnogOdgovora(1);
        listaPitanja.add(pitanje4);

        Pitanje pitanje5 = new Pitanje();
        pitanje5.setPitanje("Choose the appropriate data type for this value: 5.5");
        Odgovor[] odgovori5 = {new Odgovor("int", false), new Odgovor("double", true), new Odgovor("string", false), new Odgovor("boolean", false)};
        pitanje5.setOdgovori(odgovori5);
        pitanje5.setIndeksTacnogOdgovora(1);
        listaPitanja.add(pitanje5);

        Pitanje pitanje6 = new Pitanje();
        pitanje6.setPitanje("Object-Oriented Programming means ...");
        Odgovor[] odgovori6 = {new Odgovor(" Being objective about what you develop", false), new Odgovor(" Designing the application based on the objects discovered when analysing the problem", true), new Odgovor(" Writing an algorithm before writing your program and having a test plan", false), new Odgovor(" Writing a program composed of Java classes", false)};
        pitanje6.setOdgovori(odgovori6);
        pitanje6.setIndeksTacnogOdgovora(1);
        listaPitanja.add(pitanje6);

        Pitanje pitanje7 = new Pitanje();
        pitanje7.setPitanje("A UML Association is");
        Odgovor[] odgovori7 = {new Odgovor("implemented as a Java attribute member", true), new Odgovor(" implemented as a Java method", false), new Odgovor(" implemented as a Java Class", false)};
        pitanje7.setOdgovori(odgovori7);
        pitanje7.setIndeksTacnogOdgovora(0);
        listaPitanja.add(pitanje7);

        Pitanje pitanje8 = new Pitanje();
        pitanje8.setPitanje(" Which of the following is not a Java keyword?");
        Odgovor[] odgovori8 = {new Odgovor("static", false), new Odgovor("try", false), new Odgovor("Integer", true), new Odgovor("new", false)};
        pitanje8.setOdgovori(odgovori8);
        pitanje8.setIndeksTacnogOdgovora(2);
        listaPitanja.add(pitanje8);

        Pitanje pitanje9 = new Pitanje();
        pitanje9.setPitanje(" What is an assignment statement ?");
        Odgovor[] odgovori9 = {new Odgovor(" Adding a number to an int", false), new Odgovor(" Assigning a multiplication", false), new Odgovor(" Assigning a value to a variable", true), new Odgovor(" Assigning a name to a variable", false)};
        pitanje9.setOdgovori(odgovori9);
        pitanje9.setIndeksTacnogOdgovora(2);
        listaPitanja.add(pitanje9);

        Pitanje pitanje10 = new Pitanje();
        pitanje10.setPitanje("Which is NOT a section of all types of loops ?");
        Odgovor[] odgovori10 = {new Odgovor("  Initialization", false), new Odgovor(" Test statement", false), new Odgovor(" The keyword while", true), new Odgovor("Loop body", false)};
        pitanje10.setOdgovori(odgovori10);
        pitanje10.setIndeksTacnogOdgovora(2);
        listaPitanja.add(pitanje10);

        Pitanje pitanje11 = new Pitanje();
        pitanje11.setPitanje("Java runs on _______.");
        Odgovor[] odgovori11 = {new Odgovor("  Windows", false), new Odgovor(" Unix/Linux", false), new Odgovor(" Mac OS", false), new Odgovor("All of the above", true)};
        pitanje11.setOdgovori(odgovori11);
        pitanje11.setIndeksTacnogOdgovora(3);
        listaPitanja.add(pitanje11);

        Pitanje pitanje12 = new Pitanje();
        pitanje12.setPitanje(" What is the size of a Char in Java?");
        Odgovor[] odgovori12 = {new Odgovor("4 bits", false), new Odgovor("7 bits", false), new Odgovor("8 bits", false), new Odgovor("16 bits", true)};
        pitanje12.setOdgovori(odgovori12);
        pitanje12.setIndeksTacnogOdgovora(3);
        listaPitanja.add(pitanje12);

        Pitanje pitanje13 = new Pitanje();
        pitanje13.setPitanje("Following code 'int a1 = 5; double a2 = (float)a1;' will result in:");
        Odgovor[] odgovori13 = {new Odgovor("Compilation Error", false), new Odgovor("Runtime Error", false), new Odgovor("No Error", true), new Odgovor("Runtime Exception", false)};
        pitanje13.setOdgovori(odgovori13);
        pitanje13.setIndeksTacnogOdgovora(2);
        listaPitanja.add(pitanje13);

        Pitanje pitanje14 = new Pitanje();
        pitanje14.setPitanje("What is essential in making sure that your loop is not infinite ?");
        Odgovor[] odgovori14 = {new Odgovor(" That your Boolean statement will at some point be false", false), new Odgovor(" That there is a Boolean statement somewhere in your code", false), new Odgovor(" That your Boolean statement will at some point be true", false), new Odgovor(" All of the choices", true)};
        pitanje14.setOdgovori(odgovori14);
        pitanje14.setIndeksTacnogOdgovora(3);
        listaPitanja.add(pitanje14);

        Pitanje pitanje15 = new Pitanje();
        pitanje15.setPitanje("What is the default value of the local variables?");
        Odgovor[] odgovori15 = {new Odgovor("null", false), new Odgovor("0", false), new Odgovor("depends on data type", false), new Odgovor("no default value for local variables", true)};
        pitanje15.setOdgovori(odgovori15);
        pitanje15.setIndeksTacnogOdgovora(3);
        listaPitanja.add(pitanje15);

        Pitanje pitanje16 = new Pitanje();
        pitanje16.setPitanje("Can you compare a boolean to an integer");
        Odgovor[] odgovori16 = {new Odgovor("Yes", false), new Odgovor("No", true)};
        pitanje16.setOdgovori(odgovori16);
        pitanje16.setIndeksTacnogOdgovora(1);
        listaPitanja.add(pitanje16);

        return listaPitanja;
    }

    public static ArrayList<Pitanje> kreirajFajlSaPitanjima() throws IOException {
        ArrayList<Pitanje> listaPitanja = generisiPitanjaIOdgovore();
        ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("pitanja.dat")));
        try {
            for (Pitanje pitanje : listaPitanja) {
                System.out.println(pitanje.toString());
                output.writeObject(pitanje);
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
        output.close();
        return listaPitanja;
    }

    public static ArrayList<Pitanje> ucitajFajlSaPitanjima() throws IOException {
        ArrayList<Pitanje> listaPitanja = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("pitanja.dat")));
        try{
            while (true) {
                Pitanje pitanje = (Pitanje) input.readObject();
                listaPitanja.add(pitanje);
                System.out.println(pitanje.toString());
            }
        }
        catch (EOFException ex) {
            System.out.println("Sva pitanja su učitana");
        }
        catch(IOException ex){
            ex.getStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Greška pri učitavanju klasa iz objekta.");
            e.printStackTrace();
        }
        input.close();
        return listaPitanja;
    }
}