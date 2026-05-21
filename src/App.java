import java.util.Scanner;

import Services.UserService;

public class App {
    public static void main(String[] args) throws Exception {
        UserService us = new UserService();
        Scanner sc = new Scanner(System.in);
        us.start(sc);
    }
}
