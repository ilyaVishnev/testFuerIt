package ru;

import java.util.*;

public class MySubsequence {
    public boolean find(List<Object> x, List<Object> y) {
        int indexX = 0;
        int indexY = 0;
        while (indexX != x.size() && indexY != y.size()) {
            indexX = y.get(indexY++).equals(x.get(indexX)) ? ++indexX : indexX;
        }
        if (indexX == x.size()) {
            return true;
        }
        return false;
    }
}
