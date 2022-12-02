import java.util.Scanner;

public class ChiniseeZone {
    public static void main(String[] args) {
        int bornYear;
        double sum;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Doğum Yılınızı Giriniz");
        bornYear=input.nextInt();
        sum=bornYear%12;
        switch ((int) sum)
        {
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 3:
                System.out.println("Köpek");
                break;
            case 4:
                System.out.println("Domuz");
                break;
            case 5:
                System.out.println("Fare");
                break;
            case 6:
                System.out.println("Öküz");
                break;
            case 7:
                System.out.println("Kaplan");
                break;
            case 8:
                System.out.println("Tavşan");
                break;
            case 9:
                System.out.println("Ejderha");
                break;
            case 10:
                System.out.println("Yılan");
                break;
            case 11:
                System.out.println("At");
                break;
            case 12:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Lütfen Doğum Yılınızı Doğru girdinizden Emin olun ");
                break;



        }



    }
}
