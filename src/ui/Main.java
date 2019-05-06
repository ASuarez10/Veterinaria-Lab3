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
                System.out.println("-----------------Introduce una opcion valida---------------------");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("1. Registrar un cliente y crear historia clinica");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("2. Ver informacion de contacto de un cliente");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("3. Ver disponibilidad del cuarto");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("4. Calcular del costo de la hospitalizacion");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("5. Ver informacion de una mascota en un cuarto");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("6. Ver informacion de las mascotas de un cliente");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("7. Ver informacion de un cliente");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("8. Cambiar la direccion y el numero telefonico de un cliente");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("9. Agregar una medicina a una mascota en hostitalizacion");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("10. Agregar un nuevo diagnostico a una mascota en hostitalizacion");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("11. Agregar un nuevo sintoma a una mascota en hostitalizacion");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("12. Ver ingresos por cada servicio");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("13. Ver ingresos por todos los servicios");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("14. Agregar un nuevo servicio");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("15. Ver promedio de ingresos por cada servicio");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("16. Salir.");
                System.out.println("-----------------------------------------------------------------");

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

                    HumanClient client = new HumanClient(nameR,iden,celular,addres);

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

                    System.out.println("Digite el tipo de su mascota exactamente como aparece a continuacion: \n Gato\n Perro\n Ave\n Otro ");


                    String typeOfM = reader.nextLine();

                    System.out.println("Digite la altura de su mascota en metros");
                    uResponse = reader.nextLine();
                    double heightOfM = Double.valueOf(uResponse);

                    System.out.println("Digite el peso de su mascota en kilogramos");
                    uResponse = reader.nextLine();
                    double weightOfM = Double.valueOf(uResponse);

                    System.out.println("Digite la raza de su mascota ");
                    String breed1 = reader.nextLine();

                    Animal pet3 = new Animal(nameP, heightOfM, weightOfM, typeOfM, ageOfM, breed1, null);
                    clientsPets.add(pet3);
                    veterinary.addClient(client,clientsPets);
                    System.out.println("Se ha añadido la mascota con exito");
                    }
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

                      System.out.println("Ingrese el nombre de la mascota para ver la info");
                      String bName = reader.nextLine();

                      System.out.println(veterinary.infoPetCuarto(bName));

                      break;
                    case 6:

                      System.out.println("Ingrese la identificacion del cliente");
                      String idInfo = reader.nextLine();

                      System.out.println(veterinary.infoPetClient(idInfo));

                      break;
                    case 7:

                    System.out.println("Ingrese la identificacion del cliente");
                    String clientIdentifier = reader.nextLine();

                    System.out.println(veterinary.clientsInfo(clientIdentifier));

                    break;
                  case 8:

                    System.out.println("Ingrese la identificacion del cliente");
                    String cID = reader.nextLine();

                    System.out.println("Ingrese la nueva direccion del cliente");
                    String cAdress = reader.nextLine();

                    System.out.println("Ingrese el nuevo numero telefonico del cliente");
                    String cNumber = reader.nextLine();

                    System.out.println(veterinary.changeClientData(cID, cAdress, cNumber));

                    break;
                  case 9:

                    System.out.println("Ingrese el nombre de la mascota a la cual se le va a agregar la medicina");
                    String pMName = reader.nextLine();

                    System.out.println("Ingrese el nombre del medicamento");
                    String mName = reader.nextLine();

                    System.out.println("Ingrese la dosis del medicamento");
                    uResponse = reader.nextLine();
                    double mDose = Double.valueOf(uResponse);

                    System.out.println("Ingrese el precio por dosis del medicamento");
                    uResponse = reader.nextLine();
                    double mDP = Double.valueOf(uResponse);

                    System.out.println("Ingrese la frecuencia de la medicina");
                    String mFreq = reader.nextLine();

                    System.out.println(veterinary.addNewMedicine(pMName, mName, mDose, mDP, mFreq));

                    break;
                  case 10:

                    System.out.println("Ingrese el nombre de la mascota para agregar diagnostico");
                    String petnamen = reader.nextLine();

                    System.out.println("Ingrese el nuevo diagnostico");
                    String nDiagnosis = reader.nextLine();

                    System.out.println(veterinary.addNewDiagnosis(petnamen, nDiagnosis));

                    break;
                  case 11:

                    System.out.println("Ingrese el nombre de la mascota para agregar sintomas");
                    String petnamen2 = reader.nextLine();

                    System.out.println("Ingrese el nuevo diagnostico");
                    String nSymptom = reader.nextLine();

                    System.out.println(veterinary.addNewSymptom(petnamen2, nSymptom));

                    break;
                  case 12:

                    System.out.println(veterinary.cPS());

                    break;
                  case 13:

                    System.out.println(veterinary.tIncome());

                    break;
                  case 14:

                    System.out.println("Ingrese el nombre del servicio exactamento como aparece a continuacion: Lavado de perros \n Lavado de mascotas a domicilio \n Corte de uñas \n Profilaxia dental \n Aplicacion de vacunas");
                    String sN = reader.nextLine();

                    System.out.println("Ingrese el precio");
                    uResponse = reader.nextLine();
                    double sC = Double.valueOf(uResponse);

                    System.out.println("Ingrese la fecha en que se realizo el servicio");
                    String dN = reader.nextLine();

                    System.out.println("Ingrese una ID para la mascota");
                    String iPP = reader.nextLine();

                    System.out.println("Ingrese la ID del cliente");
                    String iPC = reader.nextLine();

                    System.out.println("Ingrese el nombre de la mascota");
                    String nP = reader.nextLine();

                    System.out.println("Ingrese la altura de la mascota");
                    uResponse = reader.nextLine();
                    double hP = Double.valueOf(uResponse);

                    System.out.println("Ingrese el peso de la mascota");
                    uResponse = reader.nextLine();
                    double wP = Double.valueOf(uResponse);

                  System.out.println("Ingrese que tipo de animal es exactamente como dice aqui:\n Gato \n Perro \n Ave \n Otro");
                    String tP = reader.nextLine();

                    System.out.println("Ingrese la edad de la mascota");
                    int eP = reader.nextInt();

                    System.out.println("Ingrese la raza de la mascota");
                    String rP = reader.nextLine();

                    Service nService = new Service(sN, sC, dN, iPP, iPC, new Animal(nP, hP, wP, tP, eP, rP, null));
                    veterinary.addService(nService);

                    System.out.println("Se ha agregado el nuevo servicio");

                    break;
                  case 15:

                    System.out.println(veterinary.promIncomes());

                    break;

                }
              }while(a != 16);

          }

          public void init(){

            veterinary = new Veterinary("Mi pequeña mascota");

            HRoom rooms1 = new HRoom(false, 1, 1, new Animal("Abdul", 1.0, 1.0,"Gato", 3, "Siames", new ClinicHistory(1, "Fisura tipo 2", "Dolor")));
            HRoom rooms2 = new HRoom(false, 2, 2, new Animal("Izak", 0.7, 0.5,"Gato", 2, "Siames", new ClinicHistory(1, "Fisura tipo 3", "Dolor")));
            HRoom rooms3 = new HRoom(false, 3, 3, new Animal("Kazan", 0.7, 3.0,"Perro", 2, "Labrador", new ClinicHistory(1, "Hongo en la piel", "Sangrado")));
            HRoom rooms4 = new HRoom(false, 4, 4, new Animal("Diego",0.1, 0.1,"Ave", 5, "Canario", new ClinicHistory(1, "Ala rota", "Dolor")));
            HRoom rooms5 = new HRoom(false, 5, 5, new Animal("Restrepo", 1.0, 9.0,"Otro", 3, "Dragon" ,new ClinicHistory(1, "Mordida en la cola", "Sangrado")));
            HRoom rooms6 = new HRoom(false, 6, 6, new Animal("Tor", 1.5, 86.0,"Otro", 2, "Kanguro", new ClinicHistory(1, "Fisura tipo 3", "Dolor")));
            HRoom rooms7 = new HRoom(false, 7, 7,new Animal("Chispi", 1.0, 7.0,"Otro", 4, "Iguana", new ClinicHistory(1, "Fractura de pata", "Dolor")));
            HRoom rooms8 = new HRoom(false, 8, 8, new Animal("Lyan", 1.0, 3.0,"Gato", 2, "Siames", new ClinicHistory(1, "Fisura tipo 3", "Dolor")));

            veterinary.addMiniRoom(rooms1, rooms2, rooms3, rooms4, rooms5, rooms6, rooms7, rooms8);

      }
    }
