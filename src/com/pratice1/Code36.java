package com.pratice1;

import java.util.Arrays;

/**
 * @author: wyh
 * @Date: 2019/9/16 17:00
 */
public class Code36 {
    public int GetNumberOfK(int [] array , int k) {
        return (int) Arrays.stream(array).filter(num->num==k).count();
    }
}
