package sekil;

    public class Sekil {
        // instance variableler
        double uzunKenar;
        int kenar;
        double yariCap;
        // constractor olusturuldu parametreli ve parametresi her bir sekil icin
        // her bir sekil icin parametreli cont olusturuldu
        // Cons olusturma sebebimiz Runner de obj olusturmak
        public Sekil() {
        }
        public Sekil(double yariCap) {
            this.yariCap = yariCap;
        }
        public Sekil(double uzunKenar, int kenar) {
            this.uzunKenar = uzunKenar;
            this.kenar = kenar;
        }
        //public Sekil(int kenar) { //Kare class i dikdörtgene child oldugu icin bunu yazmaya gerek yok
        //  this.kenar = kenar;
        //}
        public  double cevreHesaplama() { // karenin ve dikdörtgenin cevre hesaplama methodu
            return (uzunKenar+kenar)*2;
        }
        public double alanHesaplama(){ // karenin ve dikdörtgenin alan hesaplama methodu
            return (uzunKenar*kenar);
        }
        public void cemberAlanHesaplama(){ // cember alan hesaplama methodu
            System.out.println("Cemberin alani = " + (yariCap*yariCap*3.14));
        }
        public void cemberCevreHesaplama(){ // cember cevre hesaplama methodu
            System.out.println("Cemberin cevresi = " + (yariCap*2*3.14));
        }
    }

