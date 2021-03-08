public class Punkt {

  int x;
  int y;
  String n;


  Punkt ()
  {

  }

  Punkt (String n ,int x , int y)
  {
      this.x = x;
      this.y = y;
      this.n = n;

  }

  public int getX(){
      return x;
  }


    public int getY() {
        return y;
    }

    public String getNamn() {
        return n;
    }

    double avstand ()
    {
        return Math.sqrt((x * x )+ (y * y));
    }

    double avstand (Punkt p)
    {
        double d = 0;
        d = Math.sqrt((p.x-this.x)*(p.x-this.x)+ (p.y-this.y)*(p.y-this.y));
        return d;
    }

    public void setX (int x ){
      this.x = x;
    }

    public void setY (int y ){
        this.y = y;
    }

    Punkt (Punkt p )
    {
      this.x = p.x;
      this.y = p.y;
      this.n = p.n;
    }

    public String toString() {
      String s = "";
      s = "(" + x + ", " + y + " )";
      return s;
    }


}

