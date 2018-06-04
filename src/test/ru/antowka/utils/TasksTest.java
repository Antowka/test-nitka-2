package ru.antowka.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TasksTest {

    ArrayList<Integer> task1DataSet =  new ArrayList<>(Arrays.asList(1,7,2,2,2,8,13,21,1,2,18,2,8,21,9,8,1,1,1));
    ArrayList<Integer> task2DataSet =   new ArrayList<>(Arrays.asList(1,7,2,15,2,8,13,21,1,2,18,2,8,21,9,8,1));

    /**
     * Удалить из List числа, повторяющиеся три и больше раз подряд
     */
    @Test
    public void task1() {
        List result = removeDuplicate(task1DataSet);
        System.out.println(result);
        assertThat(result, is(Arrays.asList(1, 7, 8, 13, 21, 1, 2, 18, 2, 8, 21, 9, 8)));
    }

    /**
     * Удалить из List числа, повторяющиеся три и больше раз не обязательно подряд
     */
    @Test
    public void task2() {
        task2DataSet.sort(Integer::compareTo);
        List result = removeDuplicate(task2DataSet);
        System.out.println(result);
        assertThat(result, is(Arrays.asList(2, 7, 9, 13, 15, 18, 21, 21)));
    }

    private List removeDuplicate(List<Integer> list) {

        if (list.size() < 3) {
            return list;
        }

        for (int i = 0;list.size() - 1 > i; i++) {
            Integer firstElement = list.get(i);
            if (list.size() >= i + 3 && firstElement.equals(list.get(i + 1)) && firstElement.equals(list.get(i + 2))) {
                list.subList(i, i + 3).clear();
                return removeDuplicate(list);
            }
        }

        return list;
    }
}