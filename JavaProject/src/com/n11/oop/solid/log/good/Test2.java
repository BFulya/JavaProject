package com.n11.oop.solid.log.good;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int choose = 0;

        while (choose != 1) {

            System.out.print("Enter Log Type : ");
            // String reading
            String logType = scanner.nextLine();

            System.out.print("Enter your message : ");
            // String reading
            String message = scanner.nextLine();
            ILog iLogType = null;
            Logger logger = null;

            try {
                LogFactory factory = new LogFactory();
                iLogType = factory.create(logType);
                logger = new Logger(iLogType);
                String comingmessage = logger.WriteLog(message);
                System.out.println(comingmessage);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }
}