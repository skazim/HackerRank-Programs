package org.example;

public class RotationString {
    public static boolean isNonTrivialRotation(String s1, String s2) {

        return !s1.equals(s2) && (s1 + s1).contains(s2);
    }
}
