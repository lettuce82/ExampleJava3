package OOP;
/*
    getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오.
    이 문제는 클래스의 상속을 구현시 getter, setter의 개념과 용도를 알고 있는지를 묻는 문제이다.
    부모 클래스 --> Person, 자식 클래스 --> Villain, Hero
 */

class Person {
    //멤버변수
    private String name;
    private int age;
    private int height;
    private int weight;

    //getter&setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //생성자
    /* 생성자로 만들면 더 편할텐데
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
     */
}

class Villain extends Person {
    //멤버변수
    int number;
    String weapon;
    double power;

    //생성자 오버라이딩
    /* 생성자로 만들면 더 편할텐데
    public Villain(String name, int age, int height, int weight, int number, String weapon, double power) {
        super(name, age, height, weight);
        this.number = number;
        //weapon 값이 비어있다면 아래의 값을 입력
        if (weapon.isEmpty()) {
            this.weapon = "---";
        } else {
            this.weapon = weapon;
        }
        this.power = power;
    }
     */

    //getter&setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        if (weapon.isEmpty()) {
            this.weapon = "---";
        } else {
            this.weapon = weapon;
        }
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


}

class Hero extends Person {

    /* 생성자로 만들면 더 편할텐데...
    public Hero(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
     */
}
public class Java100_oop_InheritanceSample5 {
    public static void main(String[] args) {
        /* 생성자로 만들면 더 편할텐데...
        Villain villain1 = new Villain("좀비", 20, 180, 80, 15001231, "창", 99.5);
        Villain villain2 = new Villain("도깨비", 30, 175, 70, 11001121, "방패", 140.5);
        Villain villain3 = new Villain("몽달귀신", 40, 150, 40, 14001011, "", 11.5);
         */

        //Villain 객체 생성
        Villain villain1 = new Villain();
        Villain villain2 = new Villain();
        Villain villain3 = new Villain();

        //setter로 값 지정
        villain1.setName("좀비");
        villain1.setAge(20);
        villain1.setHeight(180);
        villain1.setWeight(80);
        villain1.setNumber(15001231);
        villain1.setWeapon("");
        villain1.setPower(99.5);

        //getter로 값 출력
        System.out.println("----------------------------------");
        System.out.println("악당 이름 : " + villain1.getName());
        System.out.println("악당 나이 : " + villain1.getAge());
        System.out.println("악당의 키 : " + villain1.getHeight());
        System.out.println("악당 체중 : " + villain1.getWeight());
        System.out.println("악당 넘버 : " + villain1.getNumber());
        System.out.println("악당 무기 : " + villain1.getWeapon());
        System.out.println("악당 파워 : " + villain1.getPower());
        System.out.println("----------------------------------");
        System.out.println(villain1.getName() + " 이동중..");
    }
}
