package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        String strLineOne;
        String strLine2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку 1");
        strLineOne = br.readLine();
        System.out.println("Введите строку 2");
        strLine2 = br.readLine();

        if (strLineOne.contains(strLine2)) {
            System.out.println("Строка 1 содержит в себе строку 2");
        }
        else {
            String strReSymbol = repeatSymbol(strLineOne, strLine2);
            if (!strReSymbol.isEmpty()) {
                System.out.println("Строка 1 содержит в себе следующие символы из строки 2: ");
                for (int i = 0; i < strReSymbol.length(); i++) {
                    System.out.print("\"" + strReSymbol.charAt(i) + "\" ");
                }
            }
            else {
                System.out.println("Строка 1 не содержит в себе символы из строки 2");
            }
        }
    }

    static String repeatSymbol (String strOne, String str2) {
        String strTemp = "";

        for (int i = 0; i < str2.length(); i++){
            if ( (strOne.contains(""+str2.charAt(i))) && !(strTemp.contains(""+str2.charAt(i))) ) {
                strTemp += str2.charAt(i);
            }
        }
        return strTemp;
    }
}
