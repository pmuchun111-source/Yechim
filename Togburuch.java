public class Togburuch {
    private double  tomon1, tomon2;
    public Togburuch (double t1, double t2) {
        this.tomon1=t1;
        this.tomon2=t2;
    }
    public double getTomon1 (){
        return tomon1;
    }
    public double getTomon2 (){
        return tomon2;
    }
    public double Yuz () {
        return tomon1*tomon2/2;
    }
    public double Perimetr () {
        return tomon1+tomon2+Math.sqrt(Math.pow(tomon1, 2)+Math.pow(tomon2, 2));
    }

}

