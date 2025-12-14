package util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

    public static boolean isMovable(){
        if(Randoms.pickNumberInRange(0, 9)>4){
            return true;
        }
        return false;
    }
}
