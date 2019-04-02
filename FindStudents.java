/**
 * CIS 4570-0numbers
 * FindStudents Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner; 
 import java.util.ArrayList;
 
 public class FindStudents {
 
 public static void main(String [] args) {
 
 ArrayList<String> studentList = new ArrayList<String>();
 
 studentList.add(newStudent ("Diann Palomba", "23", "Los Angeles"));
 studentList.add("Diann Palomba 23 Los Angeles");
 studentList.add("Abram anwart 45 Tarnov");
 studentList.add("Addie Abdullah 19 Mill City");
 studentList.add("Alex Audette 31 Seven Springs");
 studentList.add("Alfreda Dever 10 Beasley");
 studentList.add("Alia Pittman 59 Edmonston");
 studentList.add("Andera Pegram  37 Hickory Hills");
 studentList.add("Audrey Ramsdell 48 North Judson");
 studentList.add("Beverly Espey 58 Santa Ana");
 studentList.add("Billi Schillinger 14 New Paris");
 studentList.add("Britney Barco 34 Lorimor");
 studentList.add("Brittny Brownstein 26 Los Angeles");
 studentList.add("Caitlyn Colin 6 Palm Springs");
 studentList.add("Camie Freeburg 32 Tarnov");
 studentList.add("Chadwick Gram 54 Mill City");
 studentList.add("Cherry Curnutte 40 Seven Springs");
 studentList.add("Corrie Lor 51 Beasley");
 studentList.add("Cristine Catanzaro 35 Edmonston");
 studentList.add("Dagmar Koziel 57 Hickory Hills");
 studentList.add("Danyelle Diener 28 North Judson");
 studentList.add("Darby Defazio 52 Santa Ana");
 studentList.add("Dario Volz 17 New Paris");
 studentList.add("Daysi Deveau 43 Lorimor");
 studentList.add("Diann Palomba 23 Los Angeles");
 studentList.add("Dwight Dambrosio 56 Palm Springs");
 studentList.add("Elizebeth Yerger 15 Tarnov");
 studentList.add("Elwanda Sprankle 12 Mill City");
 studentList.add("Ena Ellefson 21 Seven Springs");
 studentList.add("Ernesto Pouncy 38 Beasley");
 studentList.add("Eugenie Osier 55 Edmonston");
 studentList.add("Forest Forst 50 Hickory Hills");
 studentList.add("Francine Faulkenberry 9 North Judson");
 studentList.add("Georgette Armstong 8 Santa Ana");
 studentList.add("Gordon Takahashi 5 New Paris");
 studentList.add("Hugh Hungerford 16 Lorimor");
 studentList.add("Irma Igoe 33 Los Angeles");
 studentList.add("Isaac Ingraham 46 Palm Springs");
 studentList.add("Jacqualine Tabon 13 Tarnov");
 studentList.add("Janella Witherite 29 Mill City");
 studentList.add("Ji Jessen 27 Seven Springs");
 studentList.add("Jonah Gaulding 44 Beasley");
 studentList.add("Jonnie Jelley 53 Edmonston");
 studentList.add("Karisa Kogan 49 Hickory Hills");
 studentList.add("Keely Klump 25 North Judson");
 studentList.add("Kelsie Stagner 24 Santa Ana");
 studentList.add("Kena Keesling 18 New Paris");
 studentList.add("Kieth Kepler 30 Lorimor");
 studentList.add("Lachelle Lott 60 Los Angeles");
 studentList.add("Laquanda Lovins 41 Palm Springs");
 studentList.add("Laquita Weitzel 36 Tarnov");
 studentList.add("Leonardo Pergande 11 Mill City");
 studentList.add("Leta Landwehr 7 Seven Springs");
 studentList.add("Lezlie Letsinger 39 Beasley");
 studentList.add("Lola Levingston 42 Edmonston");
 studentList.add("Lorina Buster 47 Hickory Hills");
 studentList.add("Luciano Lahey 20 North Judson");
 studentList.add("Lucien Leroux 22 Santa Ana");
 studentList.add("Lucrecia Lefevre 40 New Paris");
 studentList.add("Lyman Laseter 44 Lorimor");
 studentList.add("Lynda Lowe 27 Los Angeles");
 studentList.add("Maragaret Morita 48 Palm Springs");
 studentList.add("Mardell Recio 53 Tarnov");
 studentList.add("Marguerite Marek 56 Mill City");
 studentList.add("Marianna Cesar 41 Seven Springs");
 studentList.add("Marilyn Papa 23 Beasley");
 studentList.add("Marlo Mcclaine 50 Edmonston");
 studentList.add("Marsha Godsey 28 Hickory Hills");
 studentList.add("Martha Mccuen 38 North Judson");
 studentList.add("Melody Horace 31 Santa Ana");
 studentList.add("Miki Mcilrath 43 New Paris");
 studentList.add("Nadene Noga 37 Lorimor");
 studentList.add("Paulita Schanz 26 Los Angeles");
 studentList.add("Pearlene Kerfien 42 Palm Springs");
 studentList.add("Rachele Ferree 45 Tarnov");
 studentList.add("Reginald Roepke 14 Mill City");
 studentList.add("Roman Rubalcaba 32 Seven Springs");
 studentList.add("Rosanne Drummond 9 Beasley");
 studentList.add("Salley Schneller 8 Edmonston");
 studentList.add("Sandi Stacey 35 Hickory Hills");
 studentList.add("Sang Bronstein 54 North Judson");
 studentList.add("Shena Schaner 13 Santa Ana");
 studentList.add("Shin Strawder 25 New Paris");
 studentList.add("Simone Murga 11 Lorimor");
 studentList.add("Spring Ulrey 16 Los Angeles");
 studentList.add("Stewart Pederson 24 Palm Springs");
 studentList.add("Sudie Sang 59 Tarnov");
 studentList.add("Susan Schnee 34 Mill City");
 studentList.add("Tabetha Cutsforth 60 Seven Springs");
 studentList.add("Tamie Thompkins 18 Beasley");
 studentList.add("Ted Tynan 33 Edmonston");
 studentList.add("Tillie Tedrow 49 Hickory Hills");
 studentList.add("Timika Tolson 46 North Judson");
 studentList.add("Torri Talor 30 Santa Ana");
 studentList.add("Trena Brotzman 10 New Paris");
 studentList.add("Trinity Lucian 20 Lorimor");
 studentList.add("Ty Kearl 57 Los Angeles");
 studentList.add("Wilford Ertel 19 Palm Springs");
 studentList.add("Wilhelmina Fiorillo 36 Tarnov");
 studentList.add("Willette Laury 47 Mill City");
 studentList.add("Yang Yao 21 Seven Springs");
 studentList.add("Yoshie Rogan 58 Beasley");

 Scanner in = new Scanner(System.in);
 System.out.print("Enter the age (an int): ");
 int age = in.nextInt();
 in.nextLine();
 
 System.out.print("Enter the city: ");
 String city = in.nextLine();
 
 System.out.print(studentList.get(0));
 /**
 if(studentList.contains(age) > age && studentList.contains(city)) {
	System.out.print(studentList);
 } */
 
 }
 }