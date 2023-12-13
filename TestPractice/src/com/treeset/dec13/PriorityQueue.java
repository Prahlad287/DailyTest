package com.treeset.dec13;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Stud {
    int id;
    String name;

    public Stud(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud [id=" + id + ", name=" + name + "]";
    }
}

class SortingByName implements Comparator<Stud> {
	private int sortBy; // 1 for sorting by ID, 2 for sorting by name

    public SortingByName(int sortBy) {
        this.sortBy = sortBy;
    }

    @Override
    public int compare(Stud s1, Stud s2) {
        if (sortBy == 1) {
            // Sort by ID
            return Integer.compare(s1.id, s2.id);
        } else if (sortBy == 2) {
            // Sort by name
            return s1.name.compareTo(s2.name);
        } else {
            // Default to comparing by ID
            return Integer.compare(s1.id, s2.id);
        }
    }
}

class SortingById implements Comparator<Stud> {

	@Override
	public int compare(Stud s1, Stud s2) {
		return Integer.compare(s1.id, s2.id);
	}
}

public class PriorityQueue {

    public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
          System.out.println("Enter 1 for sorting by ID, 2 for sorting by name:");
    	  int Userchoice=scanner.nextInt();
         TreeSet<Stud> adByName = new TreeSet<>(new SortingByName(Userchoice));

         while (true) {
             System.out.println("Enter 1 for insert Data");
             System.out.println("Enter 2 for Remove Data");
             System.out.println("Enter 3 for Print Data");
             System.out.println("Enter 4 for Exit program");

           
             int key = scanner.nextInt();
             switch (key) {
                 case 1: {
                     System.out.println("Enter Priority Id");
                     int id = scanner.nextInt();
                     System.out.println("Enter Name");
                     String nameString = scanner.next();
                     Stud stud = new Stud(id, nameString);
   //                  adById.add(stud);
                     adByName.add(stud);
                     break;
                 }
                 case 2: {
                     System.out.println("If you want to remove by ID, enter 1. If you want to remove by name, enter 2.");
                     int option = scanner.nextInt();
                     if (option == 1) {
                         System.out.println("Enter ID for remove ");
                         int id = scanner.nextInt();
                         Stud temp = new Stud(id, "1");
    //                     adById.remove(temp);
                         adByName.remove(temp);
                         System.out.println();
                     } else if (option == 2) {
                         System.out.println("Enter Name for remove ");
                         String nameToRemove = scanner.next();
                         Stud temp = new Stud(0, nameToRemove);
    //                     adById.remove(temp);
                         adByName.remove(temp);
                         System.out.println();
                     } else {
                         System.out.println("Invalid option");
                     }
                     break;
                 }
                case 3: {
                    if (adByName.isEmpty()) {
                        System.out.println("No available elements");
                    } else {
                        adByName.forEach(System.out::println);
                        System.out.println();
                    }
                    break;
                }
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + key);
            }
        }
    }
}
