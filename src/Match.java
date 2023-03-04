import java.util.Random;

public class Match {
    Fighter firstFighter;
    Fighter secondFighter;
    int minWeight;
    int maxWeight;


    Match(Fighter firstFighter, Fighter secondFighter, int minWeight, int maxWeight) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.firstFighter.health > 0 && this.secondFighter.health > 0) {
                Random randomNum= new Random();
                int number=randomNum.nextInt(2);
                System.out.println("==== Yeni Round ====");
                System.out.println();
                if (number==0){
                    this.secondFighter.health = this.firstFighter.hit(this.secondFighter);
                    System.out.println();
                    if (isWin())
                    {
                        break;
                    }
                }
                else if(number==1){
                    this.firstFighter.health = this.secondFighter.hit(this.firstFighter);
                    System.out.println();
                    if (isWin()){
                        break;
                    }
                }
                System.out.println(this.firstFighter.name+" sporcusunun sağlığı: "+ this.firstFighter.health);
                System.out.println(this.secondFighter.name+" sporcusunun sağlığı: "+this.secondFighter.health);
                System.out.println();
            }
        } else {
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }

    boolean isCheck() {
        return ((this.firstFighter.weight >= minWeight && this.firstFighter.weight <= maxWeight) && (this.secondFighter.weight >= minWeight && this.secondFighter.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.firstFighter.health == 0) {
            System.out.println(this.secondFighter.name+" kazandı !");
            return true;
        }
        if (this.secondFighter.health==0){
            System.out.println(this.firstFighter.name+" kazandı !");
            return  true;
        }
        return false;
    }

}
