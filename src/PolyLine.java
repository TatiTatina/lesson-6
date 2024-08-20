import java.util.Arrays;

public class PolyLine {
    Tochka[]tochkas;

    public PolyLine(Tochka...tochkas) {
        this.tochkas = tochkas;
    }

    public Line[] toLineArray(){
        Line []arr=new Line[tochkas.length-1];
        for(int i=1;i<tochkas.length;i++){
            arr[i-1]=new Line(tochkas[i-1],tochkas[i]);
        }
        return arr;
    }

    public double length(){
        Line[] lines=toLineArray();
        double sum=0;
        for(int i=0;i<lines.length;i++){
            sum+=lines[i].length();
        }
        return sum;
    }

    public String toString() {
        return "Линия{" + Arrays.toString(tochkas) + '}';
    }
}
class Start {
    public static void main(String[] args) {
        PolyLine poly= new PolyLine(new Tochka(1,5),new Tochka(2,8),
                new Tochka(5,3),new Tochka(8,9));
        double polyLenght= poly.length();
        Line[]lines=poly.toLineArray();
        double linesLenght=0;
        for(int i=0;i<lines.length;i++){
            linesLenght+=lines[i].length();
        }
        System.out.println(polyLenght==linesLenght);
        poly.tochkas[1].x=12;
    }
}
