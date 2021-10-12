public class main {

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Система расчёта штрафов в Германии");

        int carSpeed = 120;
        boolean isTown = false;


            int townSpeed = 100;
            int fineFor1to10 = 10;
            int fineFor11to15 = 20;
            int fineFor16to20 = 30;
            int fineFor21to25 = 70;
            int fineFor26to30 = 80;
            int fineFor31to40 = 120;
            int fineFor41to50 = 160;
            int fineFor51to60 = 240;
            int fineFor61to70 = 440;
            int fineFor70andMore = 600;

        if (isTown == true){
            townSpeed = 50;
            fineFor1to10 = 15;
            fineFor11to15 = 25;
            fineFor16to20 = 35;
            fineFor21to25 = 80;
            fineFor26to30 = 100;
            fineFor31to40 = 160;
            fineFor41to50 = 200;
            fineFor51to60 = 280;
            fineFor61to70 = 480;
            fineFor70andMore = 680;
        }


        int overSpeed = carSpeed - townSpeed;

        if(overSpeed < 1) {
            System.out.println("Скорость не превышена или превышена незначительно");
        }
        else if(overSpeed >= 1 && overSpeed <= 10) {
            System.out.println("Штраф: " + fineFor1to10 + " евро");
        }
        else if(overSpeed >10 && overSpeed <= 15) {
            System.out.println("Штраф: " + fineFor11to15 + " евро");
        }
        else if(overSpeed >15 && overSpeed <= 20) {
            System.out.println("Штраф: " + fineFor16to20 + " евро");
        }

        else if(overSpeed >20 && overSpeed <= 25) {
            System.out.println("Штраф: " + fineFor21to25 + " евро");
        }
        else if(overSpeed >25 && overSpeed <= 30) {
            System.out.println("Штраф: " + fineFor26to30 + " евро");
        }
        else if(overSpeed >30 && overSpeed <= 40) {
            System.out.println("Штраф: " + fineFor31to40 + " евро");
        }
        else if(overSpeed >40 && overSpeed <= 50) {
            System.out.println("Штраф: " + fineFor41to50 + " евро");
        }
        else if(overSpeed > 50 && overSpeed <= 60) {
            System.out.println("Штраф: " + fineFor51to60 + " евро");
        }
        else if(overSpeed > 60 && overSpeed <= 70) {
            System.out.println("Штраф: " + fineFor61to70 + " евро");
        }
        else if(overSpeed > 70) {
            System.out.println("Штраф: " + fineFor70andMore + " евро");
        }
    }

}
