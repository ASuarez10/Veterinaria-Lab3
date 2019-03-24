package ui;

import model.*;
import java.util.Scanner;

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
                System.out.println("2. Agregar mas mascotas a un cliente");
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
            ArrayList<Animal> PetsAlejandro = new ArrayList<Animal>();
            PetsMarcela.add(Alejandro);

            rooms[0] = new HRoom(true, 1, null);
            rooms[1] = new HRoom(false, 2, new Animal("Izak", 3.0,"Gato", new ClinicHistory(1, "Fisura tipo 3", "Dolor", new Date(10,2,2019))));
            rooms[2] = new HRoom(true, 3, null );
            rooms[3] = new HRoom(true, 4, null);
            rooms[4] = new HRoom(false, 5, new Animal("Restrepo", 9.0,"Perro", new ClinicHistory(1, "Mordida en la cola", "Sangrado", new Date(21,3,2019))));
            rooms[5] = new HRoom(true, 6, null);
            rooms[6] = new HRoom(false, 7,new Animal("Chispi", 7.0,"Otro", new ClinicHistory(1, "Fractura de pata", "Dolor", new Date(10,3,2019))));
            rooms[7] = new HRoom(true, 8, null);

        }
}
