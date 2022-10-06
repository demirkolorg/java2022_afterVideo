public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManagers=new  BaseKrediManager[]{new IhtiyacKrediManager(),new TasitKrediManager(),new KonutKrediManager()};
        for (BaseKrediManager baseKrediManager: baseKrediManagers){
           System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}