package ca.qc.cgmatane.exoplanetes.modele;

public class Exoplanete {
    protected String planete,
                     etoile,
                     typeEtoile,
                     masse,
                     rayon,
                     flux,
                     temperature,
                     periode,
                     distance,
                     zone;

    protected float ist,
                    sph;

    protected String hzd,
                    hzc,
                    hza,
                    pClasse,
                    hClasse;

    protected float phi;

    protected String distance2,
                    status,
                    decouverte;

    public Exoplanete(String planete, String etoile, String typeEtoile, String masse, String rayon, String flux, String temperature, String periode, String distance, String zone, float ist, float sph, String hzd, String hzc, String hza, String pClasse, String hClasse, float phi, String distance2, String status, String decouverte) {
        this.planete = planete;
        this.etoile = etoile;
        this.typeEtoile = typeEtoile;
        this.masse = masse;
        this.rayon = rayon;
        this.flux = flux;
        this.temperature = temperature;
        this.periode = periode;
        this.distance = distance;
        this.zone = zone;
        this.ist = ist;
        this.sph = sph;
        this.hzd = hzd;
        this.hzc = hzc;
        this.hza = hza;
        this.pClasse = pClasse;
        this.hClasse = hClasse;
        this.phi = phi;
        this.distance2 = distance2;
        this.status = status;
        this.decouverte = decouverte;
    }

    public String getPlanete() {
        return planete;
    }

    public String getEtoile() {
        return etoile;
    }

    public String getTypeEtoile() {
        return typeEtoile;
    }

    public String getMasse() {
        return masse;
    }

    public String getRayon() {
        return rayon;
    }

    public String getFlux() {
        return flux;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPeriode() {
        return periode;
    }

    public String getDistance() {
        return distance;
    }

    public String getZone() {
        return zone;
    }

    public float getIst() {
        return ist;
    }

    public float getSph() {
        return sph;
    }

    public String getHzd() {
        return hzd;
    }

    public String getHzc() {
        return hzc;
    }

    public String getHza() {
        return hza;
    }

    public String getpClasse() {
        return pClasse;
    }

    public String gethClasse() {
        return hClasse;
    }

    public float getPhi() {
        return phi;
    }

    public String getDistance2() {
        return distance2;
    }

    public String getStatus() {
        return status;
    }

    public String getDecouverte() {
        return decouverte;
    }
}
