package com.jiker.keju;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException {
        String testDataFile = args[0];
        String receipt = "";
        ReadData readData = new ReadData(testDataFile);
        receipt = getReceipt(readData.getDistanceAndTime(readData.getData()));
        System.out.println(receipt);
    }

    public static String getReceipt(int[][] datas) {
        String receipt = "";
        Charge charge = new Charge();
        for (int i = 0; i < datas.length; i++) {
            int count = charge.getCountByDisAndTime(datas[i][0], datas[i][1]);
            receipt += "收费" + count + "元" + '\n';
        }

        return receipt;
    }
}
