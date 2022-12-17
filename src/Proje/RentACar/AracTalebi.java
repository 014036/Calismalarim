package Proje.RentACar;


    public class AracTalebi {
        //pojo class

        //Kiralama Bilgileri
        private String alinacakSehir;
        private String alinacakGün;
        private double alisSaati;
        private String teslimGünü;
        private double teslimSaati;

        //Arac bilgileri
        private String marka;
        private String model;
        private String yakitTipi;
        private String vites;
        private double günlükÜcret;

        public AracTalebi(){
        }

        public AracTalebi(String marka, String model, String yakitTipi, String vites, double günlükÜcret) {
            this.marka = marka;
            this.model = model;
            this.yakitTipi = yakitTipi;
            this.vites = vites;
            this.günlükÜcret = günlükÜcret;
        }

        public AracTalebi(String alinacakSehir, String alinacakGün, double alisSaati, String teslimGünü, double teslimSaati) {
            this.alinacakSehir = alinacakSehir;
            this.alinacakGün = alinacakGün;
            this.alisSaati = alisSaati;
            this.teslimGünü = teslimGünü;
            this.teslimSaati = teslimSaati;
        }

        @Override
        public String toString() {
            return "AracTalebi{" +
                    "marka='" + marka + '\'' +
                    ", model='" + model + '\'' +
                    ", yakitTipi='" + yakitTipi + '\'' +
                    ", vites='" + vites + '\'' +
                    ", günlükÜcret=" + günlükÜcret +
                    '}';
        }

        public String getAlinacakSehir() {
            return alinacakSehir;
        }

        public void setAlinacakSehir(String alinacakSehir) {
            this.alinacakSehir = alinacakSehir;
        }

        public String getAlinacakGün() {
            return alinacakGün;
        }

        public void setAlinacakGün(String alinacakGün) {
            this.alinacakGün = alinacakGün;
        }

        public double getAlisSaati() {
            return alisSaati;
        }

        public void setAlisSaati(double alisSaati) {
            this.alisSaati = alisSaati;
        }

        public String getTeslimGünü() {
            return teslimGünü;
        }

        public void setTeslimGünü(String teslimGünü) {
            this.teslimGünü = teslimGünü;
        }

        public double getTeslimSaati() {
            return teslimSaati;
        }

        public void setTeslimSaati(double teslimSaati) {
            this.teslimSaati = teslimSaati;
        }

        public String getMarka() {
            return marka;
        }

        public void setMarka(String marka) {
            this.marka = marka;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getYakitTipi() {
            return yakitTipi;
        }

        public void setYakitTipi(String yakitTipi) {
            this.yakitTipi = yakitTipi;
        }

        public String getVites() {
            return vites;
        }

        public void setVites(String vites) {
            this.vites = vites;
        }

        public double getGünlükÜcret() {
            return günlükÜcret;
        }

        public void setGünlükÜcret(double günlükÜcret) {
            this.günlükÜcret = günlükÜcret;
        }
}
