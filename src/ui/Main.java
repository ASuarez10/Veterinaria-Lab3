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
                System.out.println("5. Hospitalizar y crear una historia clinica");
                System.out.println("-----------------------------------------------------------");
                System.out.println("6. Dar de alta a una mascota");
                System.out.println("-----------------------------------------------------------");
                System.out.println("7. Ver historial de historias clinicas");
                System.out.println("-----------------------------------------------------------");
                System.out.println("8. Salir.");
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

                      break;
                    case 5:

                      break;
                    case 6:

                      break;
                    case 7:

                      break;

                }
              }while(a != 8);

          }

          public void init(){

            /**HumanClient Alberto = new HumanClient("Alberto", "17887987", "312543547", "Cra 65 #14c 90");
            HumanClient Andres = new HumanClient("Andres", "100457457", "3159876794", "Cra 44 #23 45");
            HumanClient Marcela = new HumanClient("Marcela", "1007707024", "312543345", "Calle 13d #52 34");
            Animal Juan = new Animal("Juan", 2.0, "Gato", 2, "Persa");
            Animal Juana =  new Animal("Juana", 10.0, "Perro", 3, "Labrador");
            Animal Alejandro = new Animal("Alejandro", 1.0, "Ave", 1, "Loro");*/

        }
}
