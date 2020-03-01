package com.jiker.keju;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TaixTest {
    @Test
    public void get_count_by_dis_and_time(){
        Charge charge = new Charge();
        assertEquals(charge.getCountByDisAndTime(2,0),6);
        assertEquals(charge.getCountByDisAndTime(3,0),7);
        assertEquals(charge.getCountByDisAndTime(10,0),13);
        assertEquals(charge.getCountByDisAndTime(2,3),7);
    }

    @Test
    public void get_distance_and_time(){
        ReadData readData = new ReadData("testData.txt");
        List<String> lists = new ArrayList<>();
        lists.add("1公里,等待0分钟");
        lists.add("2公里,等待3分钟");
        int [][] arr = {{1,0},{2,3}};
        assertEquals(readData.getDistanceAndTime(lists),arr);
    }

    @Test
    public void get_data() throws IOException {
        ReadData readData = new ReadData("testData.txt");
        List<String> lists = new ArrayList<>();
        lists.add("1公里,等待0分钟\\n");
        lists.add("3公里,等待0分钟\\n");
        lists.add("10公里,等待0分钟\\n");
        lists.add("2公里,等待3分钟\\n");
        assertEquals(readData.getData(),lists);
    }
}
