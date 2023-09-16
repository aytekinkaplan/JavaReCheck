package Java001_Scanner.CallingFromClass009;

import java.util.Scanner;

public class Class01 {
    /*
     * TASK->
     *
     * Kullaniciya gunde kac saat uyudugunu sorun,
     * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
     *
     * Ornek : Input : 8
     *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
     */

    double sleepingHours = 0;
    public void caculatingSleepingTime(double sleepingHours)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir günde kaç saat uyuduğunuzu girin");
        sleepingHours = scanner.nextDouble();
        double monthly = sleepingHours*30/24;
        double year = sleepingHours*365/24;
        System.out.println("Ayda: "+monthly+" gün");
        System.out.println("Yılda: "+year+" gün");
        System.out.println("Uykuda geçiyor");
    }
}
