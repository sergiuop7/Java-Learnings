package Lab3;

import static java.lang.Math.sqrt;

class MyPoint
{
	int x,y;
	MyPoint(){x=0;y=0;}
	MyPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void setx(int x) {this.x=x;}
    int getx() {return x;}
	void sety(int y) {this.y=y;}
	int gety() {return y;}
	void setXY() {x=1;y=2;}
	@Override
	public String toString() 
	{
		return "("+x+","+y+")";
	}
	double distance(int x, int y)
	{
		double dist;
		dist=sqrt((this.x-x)^2+(this.y-y)^2);
		return dist;
	}
	double distance(MyPoint another) 
	{
		double dist;
		dist=sqrt((another.x-x)^2+(another.y-y)^2);
		return dist;
	}
	
}