// --== CS400 File Header Information ==--
// Name: Briggs Clarke
// Email: bmclarke@wisc.edu
// Team: CA
// TA: Yeping Wang
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
public class TestHashTable {


  /**
   * Tests to ensure values are added sequentially and that the pairs are stored as they should be
   * 
   * @return true if all tests function as intended, false if otherwise
   */
  public static boolean test1() {
    HashTableMap test1 = new HashTableMap();
    test1.put(0, "zero");
    test1.put(1, "one");
    test1.put(2, "two");

    if (test1.get(0).equals("zero") && test1.get(1).equals("one") && test1.get(2).equals("two")) {
      System.out.println("Tets 1 functions CORRECTLY");
      return true;
    } else {
      System.out.println("Test 1 functions INCORRECTLY");
      return false;
    }
  }

  /**
   * Tests to ensure remove method works as intended, ensuring the size and key/value pair are
   * removed
   * 
   * @return true if all tests function as intended, false if otherwise
   */
  public static boolean test2() {
    HashTableMap test2 = new HashTableMap();
    test2.put(0, "zero");
    test2.put(1, "one");
    test2.put(2, "two");

    test2.remove(2);
    if (test2.size() == 2 || !test2.containsKey(3)) {
      System.out.println("Test 2 functions CORRECTLY");
      return true;
    } else {
      System.out.println("Test 2 functions INCORRECTLY");
      return false;
    }


  }

  /**
   * Tests to ensure duplicates are not allowed in the table
   * 
   * @return true if all tests function as intended, false if otherwise
   */
  public static boolean test3() {

    HashTableMap test3 = new HashTableMap();
    test3.put(0, "zero");
    if (!test3.put(0, "zero")) {
      System.out.println("Test 3 functions CORRECTLY");
      return true;
    } else {
      System.out.println("Test 3 functions INCORRECTLY");
      return false;
    }


  }

  /**
   * Tests to ensure nothing is removed when a key that is not in the table is used
   * 
   * @return true if all tests function as intended, false if otherwise
   */
  public static boolean test4() {
    HashTableMap test4 = new HashTableMap();
    test4.put(0, "zero");
    test4.put(1, "one");
    test4.put(2, "two");
    test4.put(3, "three");
    test4.remove(5);

    if (test4.size() == 4) {
      System.out.println("Test 4 functions CORRECTLY");
      return true;
    } else {
      System.out.println("Test 4 functions INCORRECTLY");
      return false;
    }
  }

  /**
   * 
   * Tests to ensure the table is doubled in size when the load factor approaches 80%
   * 
   * @return true if all tests function as intended, false if otherwise
   */
  public static boolean test5() {
    HashTableMap test3 = new HashTableMap(10);
    test3.put(0, "zero");
    test3.put(1, "one");
    test3.put(2, "two");
    test3.put(3, "three");
    test3.put(4, "four");
    test3.put(5, "five");
    test3.put(6, "six");
    test3.put(7, "seven");
    test3.put(8, "eight");
    test3.put(9, "nine");
    if (test3.capacity == 20) {
      System.out.println("Test 5 functions CORRECTLY");
      return true;
    } else {
      System.out.println("Test 5 functions INCORRECTLY");
      return false;
    }
  }

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();

  }
}
