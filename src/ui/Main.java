/** Laboratorio de Alejandro Suarez
    Codigo A00369653
    Algoritmos y programacion 1
*/
package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

          private Scanner reader;
          private Veterinary veterinary;

          public Main (){

            init();
            reader = new Scanner(System.in);
          }

            public static void main(String[] args) {

              Main m = new Main ();
              m. showMessageExample();
          }


          public void showMessageExample () {

              System.out.println("-----------------------------------------------------------");
              System.out.println("-----------------------------------------------------------");
              System.out.println("----------------Bienvenidos a la veterinaria---------------");
              System.out.println("-------------------Mi pequeña mascota--.........-----------");
              System.out.println("-----------------------------------------------------------");
              System.out.println("-----------------------------------------------------------");
              int a;
              Scanner Menu = new Scanner(System.in);

              do{
                System.out.println("--------------Introduce una opcion valida------------------");
                System.out.println("-----------------------------------------------------------");
                System.out.println("1. Registrar un cliente y crear historia clinica");
                System.out.println("-----------------------------------------------------------");
                System.out.println("2. Ver informacion de contacto de un cliente");
                System.out.println("-----------------------------------------------------------");
                System.out.println("3. Ver disponibilidad del cuarto");
                System.out.println("-----------------------------------------------------------");
                System.out.println("4. Calcular del costo de la hospitalizacion");
                System.out.println("-----------------------------------------------------------");
                System.out.println("5. Dar de alta a una mascota");
                System.out.println("-----------------------------------------------------------");
                System.out.println("6. Salir.");
                System.out.println("-----------------------------------------------------------");

                a = Menu.nextInt();



                switch (a){
                    case 1:
                    String uResponse = "";
                    System.out.println("Digite el nombre del usuario");
                    String nameR = reader.nextLine();

                    System.out.println("Digite su identificacion");
                    String iden = reader.nextLine();

                    System.out.println("Digite su dirección ");
                    String addres = reader.nextLine();

                    System.out.println("Digite su celular");
                    String celular = reader.nextLine();

                    HumanClient client = new HumanClient(nameR,iden,addres,celular);

                    System.out.println("Digite el numero de mascotas que quiere tener");
                    int numberOfUser = reader.nextInt();
                    reader.nextLine();

                    ArrayList<Animal> clientsPets = new ArrayList<Animal>();

                    for(int i = 0; i < numberOfUser; i++){
                    System.out.println("Digite el nombre de su mascota ");
                    String nameP = reader.nextLine();

                    System.out.println("Digite la edad de su mascota ");
                    int ageOfM = reader.nextInt();
                    reader.nextLine();

                    System.out.println("Digite el tipo de su mascota: \n Gato\n Perro\n Ave\n Otro ");


                    String typeOfM = reader.nextLine();

                    System.out.println("Digite el peso de su mascota ");

                    uResponse = reader.nextLine();
                    double weightOfM = Double.valueOf(uResponse);

                    Animal pet3 = new Animal(nameP, ageOfM, typeOfM, weightOfM);
                    clientsPets.add(pet3);
                    veterinary.addClient(client,clientsPets);
                    System.out.println("Se ha añadido la mascota con exito");
                      break;
                    case 2:
                        System.out.println("Ingrese la identificacion del cliente");
                        String iDN = reader.nextLine();

                        System.out.println(veterinary.contact(iDN));
                      break;

                    case 3:
                        System.out.println(veterinary.roomAviability());
                      break;
                    case 4:
                      String uResponse = "";

                      System.out.println("Ingrese el tipo de mascota:\n Gato\n Perro\n Ave\n Otro");
                      String typeA = reader.nextLine();

                      System.out.println("Ingrese el peso");
                      uResponse = reader.nextLine();
                      double weightA = Double.valueOf(uResponse);

                      System.out.println("Ingrese dias en hospitalizacion");
                      int days = reader.nextInt();
                      reader.nextLine();

                      System.out.println("El costo de la hospitalizacion es de "+ veterinary.hospitalizationCost(typeA, weightA, days) + " pesos");

                      break;
                    case 5:
                    System.out.println(veterinary.showClients());

                    System.out.println("Digite la id del cliente");
                    String idClientt = reader.nextLine();

                    System.out.println("Por favor digite el nombre de la mascota");
                    String nampe = reader.nextLine();

                    System.out.println("Digite el dia de ingreso");
                    int dai = reader.nextInt();
                    reader.nextLine();

                    System.out.println("Digite el mes de ingreso");
                    int mon = reader.nextInt();
                    reader.nextLine();

                    System.out.println("Digite el año de ingreso ");
                    int yea = reader.nextInt();
                    reader.nextLine();

                    Date dateIn = new Date(dai, mon, yea);

                    System.out.println("Digite el dia de salida");
                    int dai2 = reader.nextInt();
                    reader.nextLine();

                    System.out.println("Digite el mes de salida");
                    int mon2 = reader.nextInt();
                    reader.nextLine();

                    System.out.println("Digite el año de salida ");
                    int yea2 = reader.nextInt();
                    reader.nextLine();

                    Date dateOut = new Date(dai2, mon2, yea2);

                    System.out.println("Digite el nombre del dueño");
                    String nameClie = reader.nextLine();

                    System.out.println("Digite el id del dueño");
                    String idClie = reader.nextLine();

                    System.out.println("Digite el nombre de la mascota");
                    String namePe = reader.nextLine();

                    System.out.println("Digite los sintomas");
                    String symp = reader.nextLine();

                    System.out.println("Digite el diagnostico ");
                    String diag = reader.nextLine();

                    System.out.println("Digite el estado\n -true\n -false");
                    boolean stat = reader.nextBoolean();
                    reader.nextLine();

                    System.out.println("Digite el nombre del medicamento");
                    String medi = reader.nextLine();

                    System.out.println("Digite la dosis");
                    double dos = reader.nextDouble();
                    reader.nextLine();

                    System.out.println("Digite el precio por dosis");
                    double totaldos = reader.nextDouble();
                    reader.nextLine();


                    Animal pet2 = veterinary.findPet(nameClie, idClie, namePe);

                    ClinicHistory newMedRec = new ClinicHistory( nameClie, namePe , symp, diag, stat, dateIn,dateOut, pet2);

                    Medicine medics = new Medicine(medi, dos, totaldos);

                    veterinary.hospitalizeAPet(nameClie, idClie, namePe, newMedRec, medics);


                    System.out.println(veterinary.findToHospitalize(idClientt,nampe));
                      break;
                }
              }while(a != 6);

          }

          public void init(){

            veterinary = new Veterinary("Mi pequeña mascota");

            HumanClient Alberto = new HumanClient("Alberto", "17887987", "312543547", "Cra 65 #14c 90");
            Animal Juan = new Animal("Juan", 2.0, "Gato", 1, "Persa", null);
            ArrayList<Animal> PetsAlberto = new ArrayList<Animal>();
            PetsAlberto.add(Juan);
            Medicine Dolex = new Medicine("Dolex", 2.0, 15000.0);
            ArrayList<Medicine> DolexM=new ArrayList<Medicine>();
            DolexM.add(Dolex);

            HumanClient Andres = new HumanClient("Andres", "100457457", "3159876794", "Cra 44 #23 45");
            Animal Juana =  new Animal("Juana", 10.0, "Perro", 2, "Labrador", null);
            ArrayList<Animal> PetsAndres = new ArrayList<Animal>();
            PetsAndres.add(Juana);
            Medicine Mirrapell = new Medicine("Mirrapell", 3.0, 15000.0);
            ArrayList<Medicine> MirrapellM=new ArrayList<Medicine>();
            DolexM.add(Mirrapell);

            HumanClient Marcela = new HumanClient("Marcela", "1007707024", "312543345", "Calle 13d #52 34");
            Animal Alejandro = new Animal("Alejandro", 1.0, "Ave", 2, "Loro", null);
            ArrayList<Animal> PetsMarcela = new ArrayList<Animal>();
            PetsMarcela.add(Alejandro);
            Medicine Doloran = new Medicine("Doloran", 2.0, 30000.0);
            ArrayList<Medicine> DoloranM=new ArrayList<Medicine>();
            DolexM.add(Doloran);
              String id = "";
		          String petName ="";

            HRoom rooms1 = new HRoom(false, 1, new Animal("Abdul", 3.0,"Gato", 3, "Siames", new ClinicHistory(1, "Fisura tipo 2", "Dolor")));
            HRoom rooms2 = new HRoom(false, 2, new Animal("Izak", 3.0,"Gato", 2, "Siames", new ClinicHistory(1, "Fisura tipo 3", "Dolor")));
            HRoom rooms3 = new HRoom(false, 3, new Animal("Kazan", 3.0,"Perro", 2, "Labrador", new ClinicHistory(1, "Hongo en la piel", "Sangrado")));
            HRoom rooms4 = new HRoom(false, 4, new Animal("Diego", 1.0,"Ave", 5, "Canario", new ClinicHistory(1, "Ala rota", "Dolor")));
            HRoom rooms5 = new HRoom(false, 5, new Animal("Restrepo", 9.0,"Otro", 3, "Dragon" ,new ClinicHistory(1, "Mordida en la cola", "Sangrado")));
            HRoom rooms6 = new HRoom(false, 6, new Animal("Tor", 86.0,"Otro", 2, "Kanguro", new ClinicHistory(1, "Fisura tipo 3", "Dolor")));
            HRoom rooms7 = new HRoom(false, 7,new Animal("Chispi", 7.0,"Otro", 4, "Iguana", new ClinicHistory(1, "Fractura de pata", "Dolor")));
            HRoom rooms8 = new HRoom(false, 8, new Animal("Lyan", 3.0,"Gato", 2, "Siames", new ClinicHistory(1, "Fisura tipo 3", "Dolor")));


      }
    }
  }
