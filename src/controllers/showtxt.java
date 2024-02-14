package controllers;
import java.io.IOException;

import models.person2;
import services.*;
public class showtxt {
    public void showFiles () throws IOException {
        person2 person2 = new person2();
        ejc ejc = new ejc();
        ejc.readtxt2("C:\\Users\\sala310\\Documents\\vscode manuel\\person2.txt");
    }
}
