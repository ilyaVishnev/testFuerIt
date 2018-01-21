package ru;

import java.util.Arrays;
import java.util.*;


public class MyPyramid {
    public String pyramidBuild(List<Integer> array) throws Exception {
        int h = 1;
        int k = array.size();
        while (k > 0) {
            k -= h++;
        }
        if (k < 0) {
            throw new Exception("CannotBuildPyramidException");
        }
        h--;
        int widthPir = 2 * h - 1;
        StringBuilder stringbuilder = new StringBuilder();
        int index = 0;
        Collections.sort(array);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < widthPir; j++) {
                if (j >= widthPir / 2 - i && j <= widthPir / 2 + i && (j - (widthPir / 2 - i)) % 2 == 0) {
                    stringbuilder.append(array.get(index++));
                } else {
                    stringbuilder.append(0);
                }
            }
            stringbuilder.append("\n");
        }
        return stringbuilder.toString();
    }
}
