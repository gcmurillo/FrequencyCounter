/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author geancarlo
 */
public class Frequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        File tiny = new File("src/frequency/tinyTale.txt");
        Scanner scanTiny = new Scanner(tiny);
       
        //Para tinyTale.txt con BinarySearch
        BinarySearchST<String, Integer> stTiny = new BinarySearchST<String, Integer>();
        System.out.println("Binary Search: tinyTale.txt");
        binaryScanText(scanTiny, 3, stTiny);
        
        scanTiny = new Scanner(tiny);
        stTiny = new BinarySearchST<String, Integer>();
        binaryScanText(scanTiny, 6, stTiny);
        
        scanTiny = new Scanner(tiny);
        stTiny = new BinarySearchST<String, Integer>();
        binaryScanText(scanTiny, 9, stTiny);
        
        scanTiny = new Scanner(tiny);
        stTiny = new BinarySearchST<String, Integer>();
        binaryScanText(scanTiny, 12, stTiny);
        System.out.println("\n\n");
        
        //Para tale.txt con BinarySearch
        File tale = new File("src/frequency/tale.txt");
        Scanner scanTale = new Scanner(tale);
        BinarySearchST<String, Integer> stTale = new BinarySearchST<String, Integer>();
        System.out.println("Binary Search: tale.txt");
        binaryScanText(scanTale, 3, stTale);
        
        scanTale = new Scanner(tale);
        stTale = new BinarySearchST<String, Integer>();
        binaryScanText(scanTale, 6, stTale);
        
        scanTale = new Scanner(tale);
        stTale = new BinarySearchST<String, Integer>();
        binaryScanText(scanTale, 9, stTale);
        
        scanTale = new Scanner(tale);
        stTale = new BinarySearchST<String, Integer>();
        binaryScanText(scanTale, 12, stTale);
        System.out.println("\n\n");
        
        //Para Leipzig.txt con binarySearch
        File leipzig = new File("src/frequency/Leipzig1M.txt");
        Scanner scanLeiz = new Scanner(leipzig);
        BinarySearchST<String, Integer> stLeiz = new BinarySearchST<String, Integer>();
        System.out.println("Binary Search: Leizpig1M.txt");
        
        binaryScanText(scanLeiz, 3, stLeiz);
        
        scanLeiz = new Scanner(leipzig);
        stLeiz = new BinarySearchST<String, Integer>();
        binaryScanText(scanLeiz, 6, stLeiz);
        
        scanLeiz = new Scanner(leipzig);
        stLeiz = new BinarySearchST<String, Integer>();
        binaryScanText(scanLeiz, 9, stLeiz);
        
        scanLeiz = new Scanner(leipzig);
        stLeiz = new BinarySearchST<String, Integer>();
        binaryScanText(scanLeiz, 12, stLeiz);
        System.out.println("\n\n");
        /*while (!StdIn.isEmpty()){
            String word = StdIn.readString();
            if(word.length() < minlen) continue;
            if(!st.contains(word)) st.put(word, 1);
            else                   st.put(word, st.get(word) + 1);
        }*/
        
        //Para tinyTale.txt con RedBlackBST
        RedBlackBST<String, Integer> RBTiny = new RedBlackBST<String, Integer>();
        scanTiny = new Scanner(tiny);
        System.out.println("RedBlackBST: tinyTale.txt");
        RBScanText(scanTiny, 3, RBTiny);
        
        RBTiny = new RedBlackBST<String, Integer>();
        scanTiny = new Scanner(tiny);
        RBScanText(scanTiny, 6, RBTiny);
        
        RBTiny = new RedBlackBST<String, Integer>();
        scanTiny = new Scanner(tiny);
        RBScanText(scanTiny, 9, RBTiny);
        
        RBTiny = new RedBlackBST<String, Integer>();
        scanTiny = new Scanner(tiny);
        RBScanText(scanTiny, 12, RBTiny);
        System.out.println("\n\n");
        
        //Para tale.txt con RedBlackBST
        RedBlackBST<String, Integer> RBTale = new RedBlackBST<String, Integer>();
        scanTale = new Scanner(tale);
        System.out.println("RedBlackBST: tale.txt");
        RBScanText(scanTale, 3, RBTale);
        
        RBTale = new RedBlackBST<String, Integer>();
        scanTale = new Scanner(tale);
        RBScanText(scanTale, 6, RBTale);
        
        RBTale = new RedBlackBST<String, Integer>();
        scanTale = new Scanner(tale);
        RBScanText(scanTale, 9, RBTale);
        
        RBTale = new RedBlackBST<String, Integer>();
        scanTale = new Scanner(tale);
        RBScanText(scanTale, 12, RBTale);
        System.out.println("\n\n");
        
        //Para Leipzig1M.txt con RedBlackBST
        RedBlackBST<String, Integer> RBLeipzig = new RedBlackBST<String, Integer>();
        scanLeiz = new Scanner(leipzig);
        System.out.println("RedBlackBST: Leipzig1M.txt");
        RBScanText(scanLeiz, 3, RBLeipzig);
        
        RBLeipzig = new RedBlackBST<String, Integer>();
        scanLeiz = new Scanner(leipzig);
        RBScanText(scanLeiz, 6, RBLeipzig);
        
        RBLeipzig = new RedBlackBST<String, Integer>();
        scanLeiz = new Scanner(leipzig);
        RBScanText(scanLeiz, 9, RBLeipzig);
        
        RBLeipzig = new RedBlackBST<String, Integer>();
        scanLeiz = new Scanner(leipzig);
        RBScanText(scanLeiz, 12, RBLeipzig);
        System.out.println("\n\n");
        
        //Para tinyTale.txt con HashTable
        LinearProbingHashST<String, Integer> HTTiny = new LinearProbingHashST<String, Integer>(); 
        scanTiny = new Scanner(tiny);
        System.out.println("HashTable ST: tinyTale.txt");
        HTScanText(scanTiny, 3, HTTiny);
        
        HTTiny = new LinearProbingHashST<String, Integer>(); 
        scanTiny = new Scanner(tiny);
        HTScanText(scanTiny, 6, HTTiny);
        
        HTTiny = new LinearProbingHashST<String, Integer>(); 
        scanTiny = new Scanner(tiny);
        HTScanText(scanTiny, 9, HTTiny);
        
        HTTiny = new LinearProbingHashST<String, Integer>(); 
        scanTiny = new Scanner(tiny);
        HTScanText(scanTiny, 12, HTTiny);
        System.out.println("\n\n");
        
        //Para tinyTale.txt con HashTable
        LinearProbingHashST<String, Integer> HTTale = new LinearProbingHashST<String, Integer>(); 
        scanTale = new Scanner(tale);
        System.out.println("HashTable ST: tale.txt");
        HTScanText(scanTale, 3, HTTale);
        
        HTTale = new LinearProbingHashST<String, Integer>();
        scanTale = new Scanner(tale);
        HTScanText(scanTale, 6, HTTale);
        
        HTTale = new LinearProbingHashST<String, Integer>();
        scanTale = new Scanner(tale);
        HTScanText(scanTale, 9, HTTale);
        
        HTTale = new LinearProbingHashST<String, Integer>();
        scanTale = new Scanner(tale);
        HTScanText(scanTale, 12, HTTale);
        System.out.println("\n\n");
        
        //Para Leipzig1M.txt con HashTable
        LinearProbingHashST<String, Integer> HTLeiz = new LinearProbingHashST<String, Integer>(); 
        scanLeiz = new Scanner(leipzig);
        System.out.println("HashTable ST: Leipzig1M.txt");
        HTScanText(scanLeiz, 3, HTLeiz);
        
        HTLeiz = new LinearProbingHashST<String, Integer>(); 
        scanLeiz = new Scanner(leipzig);
        HTScanText(scanLeiz, 6, HTLeiz);
        
        HTLeiz = new LinearProbingHashST<String, Integer>(); 
        scanLeiz = new Scanner(leipzig);
        HTScanText(scanLeiz, 9, HTLeiz);
        
        HTLeiz = new LinearProbingHashST<String, Integer>(); 
        scanLeiz = new Scanner(leipzig);
        HTScanText(scanLeiz, 12, HTLeiz);
        
        
    }
    
    public static void binaryScanText(Scanner scan, int minlen, BinarySearchST<String, Integer> st){
        Long startTime;
        Long endTime;
        
        startTime = System.nanoTime();
        
        while (scan.hasNext()){
            
            String word = scan.next();
            if (word.length() < minlen) continue;
            if(!st.contains(word)) st.put(word, 1);
            else                   st.put(word, st.get(word) + 1);
        }
        
        String max = "";
        st.put(max, 0);
        for (String word : st.keys())
            if (st.get(word) > st.get(max))
                max = word;
        
        StdOut.println(max + " " + st.get(max));
        
        endTime = System.nanoTime() - startTime;
        String mensaje = "Binary Search, " + Integer.toString(minlen) + " letras, " + " Tiempo: " + Long.toString(endTime) + " ns";
        System.out.println(mensaje);
        
    }
    
    public static void RBScanText(Scanner scan, int minlen, RedBlackBST<String, Integer> st){
        Long startTime;
        Long endTime;
        
        startTime = System.nanoTime();
        
        while (scan.hasNext()){
            
            String word = scan.next();
            if (word.length() < minlen) continue;
            if(!st.contains(word)) st.put(word, 1);
            else                   st.put(word, st.get(word) + 1);
        }
        
        String max = "";
        st.put(max, 0);
        for (String word : st.keys())
            if (st.get(word) > st.get(max))
                max = word;
        
        StdOut.println(max + " " + st.get(max));
        
        endTime = System.nanoTime() - startTime;
        String mensaje = "Red Black, " + Integer.toString(minlen) + " letras, " + " Tiempo: " + Long.toString(endTime) + " ns";
        System.out.println(mensaje);
        
    }
    
    public static void HTScanText(Scanner scan, int minlen, LinearProbingHashST<String, Integer> st){
        Long startTime;
        Long endTime;
        
        startTime = System.nanoTime();
        
        while (scan.hasNext()){
            
            String word = scan.next();
            if (word.length() < minlen) continue;
            if(!st.contains(word)) st.put(word, 1);
            else                   st.put(word, st.get(word) + 1);
        }
        
        String max = "";
        st.put(max, 0);
        for (String word : st.keys())
            if (st.get(word) > st.get(max))
                max = word;
        
        StdOut.println(max + " " + st.get(max));
        
        endTime = System.nanoTime() - startTime;
        String mensaje = "HashTable, " + Integer.toString(minlen) + " letras, " + " Tiempo: " + Long.toString(endTime) + " ns";
        System.out.println(mensaje);
        
    }
    
}
