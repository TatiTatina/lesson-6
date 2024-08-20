public class Line {
    Tochka start;
    Tochka end;

    public Line(Tochka start, Tochka end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1,int y1, int x2, int y2){
        this(new Tochka(x1,y1),new Tochka(x2,y2));
    }

    public double length(){
        int cat1=start.x-end.x;
        int cat2=start.y-end.y;
        return Math.sqrt(cat1*cat1+cat2*cat2);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}

class Task3 {
    public static void main(String[] args) {
        Line line1=new Line(1,3, 5,8);
        Line line2=new Line(10,11, 15,19);
        Line line3=new Line(line1.end, line2.start);
        System.out.println(line3);
        line3.start.x=99;
        line3.end.x=99;
        System.out.println(line3);
        System.out.println(line1.length()+line2.length()+line3.length());
    }
}

