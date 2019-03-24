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
                System.out.println("1. Registrar un cliente y sus mascotas");
                System.out.println("-----------------------------------------------------------");
                System.out.println("2. Ver informacion de contacto de un cliente");
                System.out.println("-----------------------------------------------------------");
                System.out.println("3. Ver la informacion de los clientes y mascotas");
                System.out.println("-----------------------------------------------------------");
                System.out.println("4. Ver disponibilidad del cuarto");
                System.out.println("-----------------------------------------------------------");
                System.out.println("5. Calcular del costo de la hospitalizacion");
                System.out.println("-----------------------------------------------------------");
                System.out.println("6. Hospitalizar y crear una historia clinica");
                System.out.println("-----------------------------------------------------------");
                System.out.println("7. Dar de alta a una mascota");
                System.out.println("-----------------------------------------------------------");
                System.out.println("8. Ver historial de historias clinicas");
                System.out.println("-----------------------------------------------------------");
                System.out.println("9. Salir.");
                System.out.println("-----------------------------------------------------------");

                a = Menu.nextInt();



                switch (a){
                    case 1:

                      break;
                    case 2:

                      break;
                    case 3:
                        System.out.println("Digite el ID del cliente");
                        String clientIdentifier = reader.nextLine();

                        System.out.println(veterinary.clientsInfo(clientIdentifier));
                      break;
                    case 4:
                        System.out.println(veterinary.roomAviability());
                      break;
                    case 5:
                      String uResponse = "";
                      System.out.println("Ingrese el numero de la habitacion de la cual desea saber el precio de hospitalizacion");
                      int idNew = reader.nextInt();
                      reader.nextLine();

                      System.out.println("Ingrese el tipo de mascota: Gato, Perro, Ave, Otro");
                      String typeA = reader.nextLine();

                      System.out.println("Ingrese el peso");
                      uResponse = reader.nextLine();
                      double weightA = Double.valueOf(uResponse);

                      System.out.println("Ingrese el dia actual");
                      int aDay = reader.nextInt();
                      reader.nextLine();

                      System.out.println("Ingrese el numero del mes actual");
                      int aMonth = reader.nextInt();
                      reader.nextLine();

                      System.out.println("Ingrese el año actual");
                      int aYear = reader.nextInt();
                      reader.nextLine();

                      System.out.println(veterinary.hospitalizationCost(idNew, typeA, weightA, aDay, aMonth, aYear));

                      break;
                    case 6:

                      break;
                    case 7:

                      break;
                    case 8:

                      break;

                }
              }while(a != 9);

          }

          public void init(){

            veterinary = new Veterinary("Mi pequeña mascota");

            HumanClient Alberto = new HumanClient("Alberto", "17887987", "312543547", "Cra 65 #14c 90");
            Animal Juan = new Animal("Juan", 2.0, "Gato", 1, "Persa", null);
            ArrayList<Animal> PetsAlberto = new ArrayList<Animal>();
            PetsAlberto.add(Juan);

            HumanClient Andres = new HumanClient("Andres", "100457457", "3159876794", "Cra 44 #23 45");
            Animal Juana =  new Animal("Juana", 10.0, "Perro", 2, "Labrador", null);
            ArrayList<Animal> PetsAndres = new ArrayList<Animal>();
            PetsAndres.add(Juana);

            HumanClient Marcela = new HumanClient("Marcela", "1007707024", "312543345", "Calle 13d #52 34");
            Animal Alejandro = new Animal("Alejandro", 1.0, "Ave", 2, "Loro", null);
            ArrayList<Animal> PetsMarcela = new ArrayList<Animal>();
            PetsMarcela.add(Alejandro);

            HRoom rooms1 = new HRoom(true, 1, null);
            HRoom rooms2 = new HRoom(false, 2, new Animal("Izak", 3.0,"Gato", 2, "Siames", new ClinicHistory(1, "Fisura tipo 3", "Dolor", new Date(10,2,2019))));
            HRoom rooms3 = new HRoom(true, 3, null );
            HRoom rooms4 = new HRoom(true, 4, null);
            HRoom rooms5 = new HRoom(false, 5, new Animal("Restrepo", 9.0,"Otro", 3, "Dragon" ,new ClinicHistory(1, "Mordida en la cola", "Sangrado", new Date(21,3,2019))));
            HRoom rooms6 = new HRoom(true, 6, null);
            HRoom rooms7 = new HRoom(false, 7,new Animal("Chispi", 7.0,"Otro", 4, "Iguana", new ClinicHistory(1, "Fractura de pata", "Dolor", new Date(10,3,2019))));
            HRoom rooms8 = new HRoom(true, 8, null);

        }
}
