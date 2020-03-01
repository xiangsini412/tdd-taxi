package com.jiker.keju;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {

    String path = "";

    public ReadData(String filePath) {
        path = "src/main/resources/" + filePath;
    }

    public int[][] getDistanceAndTime(List<String> datas) {
        int[][] disAndTime = new int[datas.size()][2];
        for (int i = 0; i < datas.size(); i++) {
            disAndTime[i][0] = Integer.parseInt(datas.get(i).substring(0, datas.get(i).indexOf("公里")));
            disAndTime[i][1] = Integer.parseInt(datas.get(i).substring(datas.get(i).indexOf("等待") + 2, datas.get(i).indexOf("分钟")));
        }
        return disAndTime;
    }

    public List<String> getData() throws IOException {
        List lists = new ArrayList();String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
        while ((line = bufferedReader.readLine()) != null) {
            if (!line.trim().equals("")){
                lists.add(line.trim());
            }
        }
        return lists;
    }
}
