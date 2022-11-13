package Dto;

public class Money {
    private final int money;

    public Money(String money){
        validValue(money);
        this.money = Integer.valueOf(money) ;
    }

    public int getMoney() {
        return money;
    }

    private void validValue(String money){
        String pattern = ".*[A-Za-zㄱ-ㅎ].*$";
        if(money.matches(pattern)){
            throw new IllegalArgumentException("[ERROR] 숫자만을 입력하시오");
        }
    }
}
