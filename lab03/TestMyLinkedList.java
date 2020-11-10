import java.util.*;

public class TestMyLinkedList {
	
		  public static void main(String[] args) {
		    new TestMyLinkedList();
		  }

		  public TestMyLinkedList() {
		    String[] name1 = {"Tom", "George", "Peter", "Jean", "Jane","Peter","Alex"};
		    String[] name2 = {"George", "Michael", "Michelle", "Daniel"};
		    String[] name3 = {"Tom", "Peter"};
		    
		    MyList<String> list1 = new MyLinkedList<String>(name1);   
		    MyList<String> list2 = new MyLinkedList<String>(name2);  
		    MyList<String> list3 = new MyLinkedList<String>(name3); 
		  
		     
		    System.out.println("list1:" + list1);
		    System.out.println("list1 indexOf Peter is:" + list1.indexOf("Peter"));
		    System.out.println("list1 lastIndexOf Peter is:" + list1.lastIndexOf("Peter"));
		    System.out.println("list1 indexOf John is:" + list1.indexOf("John"));
		    System.out.println("list1 lastIndexOf John is:" + list1.lastIndexOf("John"));
		    list1.set(5, "Larry");
		    System.out.println("list1 element at index 5 is "+list1.get(5));
		    System.out.println("\nlist2:" + list2);
		    System.out.println("list2 contains Michelle is:" + list2.contains("Michelle"));
		    System.out.println("list2 indexOf John is:" + list2.indexOf("John"));
		    System.out.println("list2 contains John is:" + list2.contains("John"));
		    System.out.println("\nlist3:" + list3);
		    System.out.println("list3 element at index 1 is "+list3.get(1));
		   
		    System.out.println("\n\nlist1 contains all of list3? "+ list1.containsAll(list3));
		    System.out.println("\n\nlist2 contains all of list3? "+ list2.containsAll(list3));
		    System.out.println("\n\nlist1 removed all of list3? "+ list1.removeAll(list3));
		    System.out.println("list1:" + list1);
		    System.out.println("\n\nlist2 removed all of list3? "+ list2.removeAll(list3));
		    System.out.println("list2:" + list2);
		    list1 = new MyLinkedList<String>(name1);   
		    list2 = new MyLinkedList<String>(name2);  
		    list3 = new MyLinkedList<String>(name3); 		    
        System.out.println("\n\nlist1 retains all of list3? "+ list1.retainAll(list3));
		    System.out.println("list1 After retainAll:" + list1 + "\n");
		    list1 = new MyLinkedList<String>(name1);
		    list1.add("Bahram");
		    System.out.println("list1:" + list1);
		    System.out.println("list2:" + list2);
		    list1.addAll(list2);
		    System.out.println("After addAll:" + list1 + "\n");
		    Object[] nameArray1 = list1.toArray();
		 
		    System.out.println(new ArrayList(Arrays.asList(nameArray1)));
		    
		    String[] nameArray2 = new String[list1.size()];
		    nameArray2 = list1.toArray(nameArray2);
		   
		    System.out.println(new ArrayList<String>(Arrays.asList(nameArray2))+"\n");
		   
		   MyLinkedList<String> l = new MyLinkedList<>(name1);
		 
		   System.out.println("l is " + l);
		   l.printList();
		
		  }

}
