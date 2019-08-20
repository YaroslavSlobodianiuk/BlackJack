import java.util.Random;

class RandomClass {
    Random random = new Random();
    int randomArray[] = {1,2,3,4,5,6,7,8,9,10,11};
    public int getRandArrayElement() {

        int result = (int) (Math.random()*11) + 1;
        return result;
    }
}
