package com.company;

public class Point3D extends Point2D {
    private double zCoord;

    public Point3D(double x, double y,double z) {
        zCoord = z;
    }

    public Point3D () {
        this(0, 0,0);
    }
    public double getZ(){
        return zCoord;
    }

    public void setZ (double val){
        zCoord = val;
    }


    public boolean equalCoords1(Point3D point){
        return (point.getX()==this.getX() & (point.getY()==this.getY()) & (point.getZ()==this.getZ()));
    }
        public double distanceTo(Point3D point) {
            return Math.sqrt(Math.pow(this.getX() - point.getX(), 2)
                    + Math.pow(this.getY() - point.getY(), 2) + Math.pow(this.getZ() - point.getZ(), 2));
        }

    public double[] distanceTo1(Point3D Point){
        double[] delt = new double[3];
        double[] fir = new double[3];
        double[] sec = new double[3];
        fir[0]=getX();
        fir[1]=getY();
        fir[2]=getY();
        sec[0]=Point.getX();
        sec[1]=Point.getY();
        sec[2]=Point.getZ();
        for (int i=0; i<delt.length;i++){
            delt[i]=fir[i]-sec[i];
        }
        return delt;
        }
    public boolean equalCoords(Point3D point1, Point3D point2){
        return (point1.getX()== point2.getX())
                & (point1.getY()==point2.getY()) & (point1.getZ()==point2.getZ());
    }
    public String compare(Point3D first,Point3D second){
        return "Координаты первой точки:"+first.getX()+" "+first.getY()+first.getZ()+" Координаты второй точки:"+second.getX()
                +" "+second.getY() +" "+second.getZ();
    }
}
