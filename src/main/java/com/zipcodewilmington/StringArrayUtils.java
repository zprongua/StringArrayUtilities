package com.zipcodewilmington;

import sun.security.util.ArrayUtil;

import java.util.*;

import static java.util.Arrays.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String arrayElements : array) {
            if (arrayElements.contains(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String orgArray = deepToString(array);
        Collections.reverse(asList(array));
        String newArray = deepToString(array);
        if (orgArray.equals(newArray)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String abcs = "";

        String str = Arrays.toString(array).toLowerCase();
        for (char ch='a'; ch<='z'; ch++) {
            if (str.contains(String.valueOf(ch))) {
                if (!abcs.contains(String.valueOf(ch))) {
                    abcs += String.valueOf(ch);
                }
            }
        }
        return alphabet.equals(abcs);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int charCount = 0;
        for (String sa : array) {
            if (sa.equals(value)) {
                charCount += 1;
            }
        }
        return charCount;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList<String>();
        int j = 0;
        for (String s : array) {
            if (!s.equals(valueToRemove)) {
                newArray.add(s);
                j++;
            }
        }
        return newArray.toArray(new String[j]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.add(array[0]);
        for (int i = 1; i<array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                newArray.add(array[i]);
            }
        }
        String[] sa = new String[newArray.size()];
        sa = newArray.toArray(sa);
        return sa;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String arrayString = "";
        for (String as : array) {
            arrayString += as;
        }
        ArrayList<String> na = new ArrayList();
        for

        String[] sa = new String[na.size()];
        sa = na.toArray(sa);
        for (String s : sa) {
            System.out.print(s+" ");
        }
        return sa;
    }


}
