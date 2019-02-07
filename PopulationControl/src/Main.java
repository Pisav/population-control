public class Main {

    public static void main(String[] args) {


        //person 1
        System.out.println("persoon 1");
        Person Vadim = new Person();
        Vadim.Setoogkleur("blauw");
        Vadim.Geteenkleur();
        System.out.println(  "kleur van ogen: " + Vadim.Geteenkleur());



        Vadim.Setlengte(180);
        Vadim.Getlengte();
        System.out.println(  "lengte: " + Vadim.Getlengte()+"cm");


        Vadim.Setbsn(834578951);
        Vadim.Getbsn();
        System.out.println(  "bsn nummer: " + Vadim.Getbsn());


        Vadim.Setgeboorteland("nederland");
        Vadim.Getgeboorteland();
        System.out.println(  "geboorte land: " + Vadim.Getgeboorteland());

        Vadim.Setleeftijd(16);
        Vadim.Getleeftijd();
        System.out.println(  "leeftijd: " + Vadim.Getleeftijd()+ "\n" + "\n");



        //person 2
        System.out.println("persoon 2");
        Person Regilio = new Person();
        Regilio.Setoogkleur("bruin");
        Regilio.Geteenkleur();
        System.out.println(  "kleur van ogen: " + Regilio.Geteenkleur());



        Regilio.Setlengte(178);
        Regilio.Getlengte();
        System.out.println(  "lengte: " + Regilio.Getlengte()+"cm");


        Regilio.Setbsn(293886387);
        Regilio.Getbsn();
        System.out.println(  "bsn nummer: " + Regilio.Getbsn());


        Regilio.Setgeboorteland("indonesie");
        Regilio.Getgeboorteland();
        System.out.println(  "geboorte land: " + Regilio.Getgeboorteland());

        Regilio.Setleeftijd(16);
        Regilio.Getleeftijd();
        System.out.println(  "leeftijd: " + Regilio.Getleeftijd());

    }
}
