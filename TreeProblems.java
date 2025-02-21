/*
 * *** BRIANNA FARINANGO / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    // create two temporary TreeSets as copies of the input sets
    TreeSet<Integer> result = new TreeSet<>(setA);
    TreeSet<Integer> temp = new TreeSet<>(setB);
    
    // get all elements that are in both sets
    TreeSet<Integer> intersection = new TreeSet<>(setA);
    intersection.retainAll(setB);
    
    // add all elements from setB to result
    result.addAll(temp);
    
    // remove all elements that are in both sets
    result.removeAll(intersection);
    
    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    // use an iterator to remove elements while iterating
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
    
    // while loop goes through each entry in the map
    while (iterator.hasNext()) {
        Map.Entry<Integer, String> entry = iterator.next();
        // if the key is even, remove the entry
        if (entry.getKey() % 2 == 0) {
            iterator.remove();
        }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {
    // check if the maps are equal using the equals() method
    return tree1.equals(tree2);
  }

} // end treeProblems class
