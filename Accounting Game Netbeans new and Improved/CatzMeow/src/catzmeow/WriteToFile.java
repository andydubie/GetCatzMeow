/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catzmeow;

import static catzmeow.Cats.CompanyName;
import static catzmeow.Cats.txtTeachersEmailEnter;
import static catzmeow.Cats.txtNameEnter;
import static catzmeow.GameBoard.lblScore;
import static catzmeow.GameBoard.lblMoney;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adubiel
 */
public class WriteToFile {

    void Excecute() {
        String company = Cats.getCompany(CompanyName);
        String email = Cats.getTeachersEmailEnter(txtTeachersEmailEnter);
        String name = Cats.gettxtNameEnter(txtNameEnter);
        
        String money = GameBoard.getMoney(lblMoney);
        String score = GameBoard.getScore(lblScore);
        
        String userHomeFolder = System.getProperty("user.home");
        File textFile = new File(userHomeFolder, "Accounting Game.txt");
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter(textFile));
        } catch (IOException ex) {
            Logger.getLogger(WriteToFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        try {
            FileWriter writer = new FileWriter(textFile);
            writer.write(name + "\r\n" + company + "\r\n" + email);
            writer.write("\r\n" + "\r\n");   // write new line
            writer.write("Your ending cash balance was " + money + "\r\n");
            writer.write("Your ending score was " + score + "\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
