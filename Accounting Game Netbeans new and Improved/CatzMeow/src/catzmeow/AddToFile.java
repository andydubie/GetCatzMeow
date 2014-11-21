/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catzmeow;

import static catzmeow.GameBoard.lblScore;
import static catzmeow.GameBoard.lblMoney;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author adubiel
 */
public class AddToFile {
        void CashBalanceScore() {
            
            String money = GameBoard.getMoney(lblMoney);
            String score = GameBoard.getScore(lblScore);
         // variable for this class = Class where variable is .what method it is(what the name for component you want to use)
         // - Andrew Dubiel
            
        try {
            FileWriter writer = new FileWriter("C:\\Users\\adubiel\\Desktop\\chinese.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Your ending cash balance was " + money + "\r\n");
            bufferedWriter.newLine();
            bufferedWriter.write("Your ending score was " + score + "\r\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
