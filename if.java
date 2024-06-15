class If {
    public static void main(String[] args){
        int age = 25;//ここを18とかにすると何も表示されない


        if (age >= 20){
            System.out.println("大人");
        }

        int age2 = 18;

        if (age2 >=20){
            System.out.println("大人");
        } else {
            System.out.println("未成年");
        }

        int age3 = 0;

        if (age3 >=20){
            System.out.println("大人");
        } else if (age3==0) {
            System.out.println("赤ちゃん");
        } else {
            System.out.println("未成年");
        }  
    }
}
//大人　　　　　　　age
//未成年    age2
// 赤ちゃん　　　　age3