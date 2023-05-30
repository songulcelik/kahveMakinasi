import java.util.Scanner;

public class KahveMakinasi {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Lutfen kahve secimini yapiniz" +
                "\nTurk Kahvesi ---> 1" +
                "\nFiltre Kahve ---> 2" +
                "\nEspresso     ---> 3" +
                "\nLatte        ---> 4");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                turkKahvesi();
                break;
            case 2:
                filtreKahve();
                break;
            case 3:
                espresso();
                break;
            case 4:
                latte();
            default:
                System.out.println("Hata!... Lutfen kahve secimini sayi ile yapiniz.");
        }
    }


    public static void turkKahvesi() {
        System.out.println("Turk kahvesi hazirlaniyor...");
        System.out.println("---");
        int sut = 0;
        do {
            System.out.println("Kahvenize sut eklemek ister misiniz?" +
                    "\n Evet  ---> 1" +
                    "\n Hayir ---> 2");
            int sutTercihi = input.nextInt();
            if (sutTercihi == 1) {
                System.out.println("Sut ekleniyor...");
            } else if (sutTercihi == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            sut++;
        } while (sut < 2);

        System.out.println("---");
        int sekerr = 0;
        do {
            System.out.println("Kahvenize seker ister misiniz?" +
                    "\n Evet  --->1" +
                    "\n Hayir --->2");
            int seker = input.nextInt();
            if (seker == 1) {
                System.out.println("Kac seker olsun? Lutfen sayi giriniz");
                int sekerTercih = input.nextInt();
                System.out.println("Kahvenize seker ekleniyor...");
            } else if (seker == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            sekerr++;

        } while (sekerr < 2);

        System.out.println("---");
        int boyut = 0;
        do {
            System.out.println("Kahveniz hangi boyutta olsun" +
                    "\n Buyuk Boy ---> 1" +
                    "\n Orta Boy  ---> 2" +
                    "\n Kucuk Boy ---> 3");
            int boy = input.nextInt();
            System.out.println("---");
            if (boy == 1) {
                System.out.println("Kahveniz buyuk boy olarak hazirlaniyor.");
            } else if (boy == 2) {
                System.out.println("Kahveniz orta boy olarak hazirlaniyor.");
            } else if (boy == 3) {
                System.out.println("Kahveniz kucuk boy olarak hazirlaniyor.");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            boyut++;
        } while (boyut < 2);
        System.out.println("---");

        System.out.println("Turk kahveniz hazir! Afiyet olsun :)");
    }

    public static void filtreKahve() {
        System.out.println("Filtre kahve hazirlaniyor...");
        System.out.println("---");
        int sut = 0;
        do {
            System.out.println("Kahvenize sut eklemek ister misiniz?" +
                    "\n Evet  ---> 1" +
                    "\n Hayir ---> 2");
            int sutTercihi = input.nextInt();
            if (sutTercihi == 1) {
                System.out.println("Sut ekleniyor...");
            } else if (sutTercihi == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            sut++;
        } while (sut < 2);

        System.out.println("---");
        int sekerr = 0;
        do {
            System.out.println("Kahvenize seker ister misiniz?" +
                    "\n Evet  --->1" +
                    "\n Hayir --->2");
            int seker = input.nextInt();
            if (seker == 1) {
                System.out.println("Kac seker olsun? Lutfen sayi giriniz");
                int sekerTercih = input.nextInt();
                System.out.println("Kahvenize seker ekleniyor...");
            } else if (seker == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            sekerr++;

        } while (sekerr < 2);

        System.out.println("---");
        int boyut = 0;
        do {
            System.out.println("Kahveniz hangi boyutta olsun" +
                    "\n Buyuk Boy ---> 1" +
                    "\n Orta Boy  ---> 2" +
                    "\n Kucuk Boy ---> 3");
            int boy = input.nextInt();
            System.out.println("---");
            if (boy == 1) {
                System.out.println("Kahveniz buyuk boy olarak hazirlaniyor.");
            } else if (boy == 2) {
                System.out.println("Kahveniz orta boy olarak hazirlaniyor.");
            } else if (boy == 3) {
                System.out.println("Kahveniz kucuk boy olarak hazirlaniyor.");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            boyut++;
        } while (boyut < 2);
        System.out.println("---");

        System.out.println("Filtre kahveniz hazir! Afiyet olsun :)");
    }

    public static void latte() {
        System.out.println("Latte hazirlaniyor...");
        System.out.println("---");
        int sut = 0;
        do {
            System.out.println("Kahvenize sut eklemek ister misiniz?" +
                    "\n Evet  ---> 1" +
                    "\n Hayir ---> 2");
            int sutTercihi = input.nextInt();
            if (sutTercihi == 1) {
                System.out.println("Sut ekleniyor...");
            } else if (sutTercihi == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            sut++;
        } while (sut < 2);

        System.out.println("---");
        int sekerr = 0;
        do {
            System.out.println("Kahvenize seker ister misiniz?" +
                    "\n Evet  --->1" +
                    "\n Hayir --->2");
            int seker = input.nextInt();
            if (seker == 1) {
                System.out.println("Kac seker olsun? Lutfen sayi giriniz");
                int sekerTercih = input.nextInt();
                System.out.println("Kahvenize seker ekleniyor...");
            } else if (seker == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            sekerr++;

        } while (sekerr < 2);

        System.out.println("---");
        int boyut = 0;
        do {
            System.out.println("Kahveniz hangi boyutta olsun" +
                    "\n Buyuk Boy ---> 1" +
                    "\n Orta Boy  ---> 2" +
                    "\n Kucuk Boy ---> 3");
            int boy = input.nextInt();
            System.out.println("---");
            if (boy == 1) {
                System.out.println("Kahveniz buyuk boy olarak hazirlaniyor.");
            } else if (boy == 2) {
                System.out.println("Kahveniz orta boy olarak hazirlaniyor.");
            } else if (boy == 3) {
                System.out.println("Kahveniz kucuk boy olarak hazirlaniyor.");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            boyut++;
        } while (boyut < 2);
        System.out.println("---");

        System.out.println("Latteniz hazir! Afiyet olsun :)");
    }

    public static void espresso() {
        System.out.println("Espresso hazirlaniyor...");
        System.out.println("---");
        int sut = 0;
        do {
            System.out.println("Kahvenize sut eklemek ister misiniz?" +
                    "\n Evet  ---> 1" +
                    "\n Hayir ---> 2");
            int sutTercihi = input.nextInt();
            if (sutTercihi == 1) {
                System.out.println("Sut ekleniyor...");
            } else if (sutTercihi == 2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }  sut++;
        }while (sut<2);

        System.out.println("---");
        int sekerr =0;
        do {
            System.out.println("Kahvenize seker ister misiniz?" +
                    "\n Evet  --->1" +
                    "\n Hayir --->2");
            int seker = input.nextInt();
            if (seker==1){
                System.out.println("Kac seker olsun? Lutfen sayi giriniz");
                int sekerTercih = input.nextInt();
                System.out.println("Kahvenize seker ekleniyor...");}
            else if (seker==2) {
                System.out.println("Kahveniz hazirlaniyor");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            } sekerr++;

        }while (sekerr<2);

        System.out.println("---");
        int boyut=0;
        do {
            System.out.println("Kahveniz hangi boyutta olsun" +
                    "\n Buyuk Boy ---> 1" +
                    "\n Orta Boy  ---> 2" +
                    "\n Kucuk Boy ---> 3");
            int boy = input.nextInt();
            System.out.println("---");
            if (boy == 1) {
                System.out.println("Kahveniz buyuk boy olarak hazirlaniyor.");
            } else if (boy == 2) {
                System.out.println("Kahveniz orta boy olarak hazirlaniyor.");
            } else if (boy == 3) {
                System.out.println("Kahveniz kucuk boy olarak hazirlaniyor.");
            } else {
                System.out.println("Hatali giris yaptiniz.");
            }
            boyut++;
        } while (boyut<2);
        System.out.println("---");

        System.out.println("Espressonuz hazir! Afiyet olsun :)");
    }
}