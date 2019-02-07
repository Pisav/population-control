public class Person {

        private String oogkleur;
        public void Setoogkleur(String eenKleur) {

            oogkleur = eenKleur;
        }
        public String Geteenkleur(){
            return oogkleur;
        }

        private int lengte;
        public void Setlengte(int cm) {
            if (cm<0) {
                System.out.println("dit is een verkeerde lengte vul het correct in");
            }
            if (cm>240) {
                System.out.println("dit is een verkeerde lengte vul het correct in");
            }
            lengte = cm;
        }
        public int Getlengte(){
            return lengte;
        }

        private int bsn;
        public void Setbsn(int nummer) {
            String str = String.valueOf(nummer);
            str.
            if (nummer<0){
                System.out.println("dit is een fout bsn nummer vul het correct in");
            }
            if (nummer>9){
                System.out.println("dit is een fout bsn nummer vul het correct in");
            }
            bsn = nummer;
        }
        public int Getbsn(){
            return bsn;
        }

        private String geboorteland;
        public void Setgeboorteland(String land) {
            geboorteland = land;
        }
        public String Getgeboorteland(){
            return geboorteland;
        }

        private int leeftijd;
        public void Setleeftijd(int nummer) {
            if (leeftijd<0){
                System.out.println("dit is een verkeerde leeftijd vul het correct in");
            }
            if (leeftijd>120){
                System.out.println("dit is een fout bsn nummer vul het correct in");
            }
            leeftijd = nummer;
        }
        public int Getleeftijd(){
            return leeftijd;
        }


}
