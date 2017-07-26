package org.prince.java.passwordapp.helper;


import model.data.PasswordDAO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by davidprince on 7/24/17.
 */
public class PasswordsPersistent {

    private PasswordDAO passwordDAO;

    private List loadData(){
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get("/Users/davidprince/Desktop/Password Security WebApp/Password Security WebApp/src/main/java/helper/passwords.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();

        }

        return list;
    }

    private void exportsToDB() {
        passwordDAO.save(loadData());
    }

    public static void main (String[] args){
        PasswordsPersistent pp = new PasswordsPersistent();
        pp.exportsToDB();
    }
}
