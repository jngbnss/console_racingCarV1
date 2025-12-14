package validate;

public class Validator {
    public static void inputValidate(String input){

        //공백 먼저 확인해보자
        if(input==null||input.isBlank()){
            throw new IllegalArgumentException("공백을 입력하시면 안됩니다.");
        }
        // 일단 구분자 잘 있는지
        if(!input.contains(",")){
            throw new IllegalArgumentException("콤마를 넣어주세요");
        }
    }
    public static void carNameValidator(String name){
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("자동차 이름은 공백이면 안됩니다.");
        }
        if(name.length()>5) {
            throw new IllegalArgumentException("이름은 5글자를 초과하면 안됩니다.");
        }

    }
    public static int countValidate(String input){
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("시도 횟수를 입력해주세요.");
        }

        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("숫자만 입력해야 합니다.");
        }

        int count = Integer.parseInt(input);

        if (count < 1) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 자연수여야 합니다.");
        }

        return count;
    }


}
