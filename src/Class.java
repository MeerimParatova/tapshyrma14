public class Class {

      private int nomer; //бутун сан
      private String soz;
      private double[] masiv;


public Class(){

}
public Class (int nomer, String soz, double[] masiv){
this.nomer=nomer;
this.soz=soz;
this.masiv=masiv;

}

      public int getNomer() {
            return nomer;
      }

      public void setNomer(int nomer) {
            this.nomer = nomer;
      }

      public String getSoz() {
            return soz;
      }

      public void setSoz(String soz) {
            this.soz = soz;
      }

      public double[] getMasiv() {
            return masiv;
      }

      public void setMasiv(double[] masiv) {
            this.masiv = masiv;
      }
//Class деген класс тузунуз
//ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар
//конструктор жазыныз
//мейн методтон Classтын объектисин тузунуз
//объекттин полелерине конструктор аркылуу маани бериниз
//ошол объекттин полелерин консольго чыгарыныз.
}
