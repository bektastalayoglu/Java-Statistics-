import java.util.Arrays;

public class DataSet {
    private double[] set;

    public DataSet(double[] set){
        this.set = set;
    }

    public double getAverage(){
        double avarage = 0;
        double total = 0;
        for(double i : this.set){
            total = total + i;
        }
        avarage = total / this.set.length;
        return avarage;
    }

    public double getSmallest(){
        double min = this.set[0];
        for(int i = 1 ; i < this.set.length ; i++){
            if(this.set[i] < min){
                min = this.set[i];
            }
        }
        return min;
    }

    public double getLargest(){
        double max = this.set[0];
        for(int i = 1 ; i < this.set.length ; i++){
            if(this.set[i] > max){
                max = this.set[i];
            }
        }
        return max;
    }

    public double getRange(){
        double range = this.getLargest() - this.getSmallest();
        return range;
    }

    public double[] add(double value){
        int oldLength = this.set.length;
        double[] newSet  = new double[oldLength + 1];

        for(int i = 0 ; i < oldLength ; ++i){
            newSet[i] = this.set[i];
        }

        newSet[oldLength] = value;
        this.set = newSet;

        return this.set;
    }

    public static void main(String[] args) {
        double[] asett = {5, 7, 1, 9.5, 13};
        DataSet sett = new DataSet(asett);
        System.out.println(Arrays.toString(sett.add(8)));
        System.out.println(Arrays.toString(sett.add(15)));
        System.out.println(sett.getLargest());
        System.out.println(sett.getSmallest());
        System.out.println(sett.getRange());
        System.out.println(sett.getAverage());

    }

}