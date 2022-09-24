public class Main {
    public static void main(String[] args) {
        IhtiyacKrediManager ihtiyacKrediManager = new IhtiyacKrediManager();
        TasitKrediManager tasitKrediManager = new TasitKrediManager();
        KonutKrediManager konutKrediManager = new KonutKrediManager();
        TarimKrediManager tarimKrediManager = new TarimKrediManager();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(ihtiyacKrediManager);
        krediUI.KrediHesapla(tasitKrediManager);
        krediUI.KrediHesapla(konutKrediManager);
        krediUI.KrediHesapla(tarimKrediManager);
    }
}