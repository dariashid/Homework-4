public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        byte age = 18;
        if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
    } else {
        System.out.println("Если возраст человека не равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature <= 5) {
        System.out.println("На улице холодно, " + temperature + " градусов, нужно надеть шапку.");
    } else {
        System.out.println("Сегодня тепло, " + temperature + " градуса, можно идти без шапки.");
        }

        System.out.println(" Задача 3");
        int speed = 60;
        if (speed >= 60) {
        System.out.println("Если скорость больше " + speed + ", то придется заплатить штраф.");
    } else {
        System.out.println("Если скорость меньше " + speed + ", то можно ездить спокойно.");
        }

        System.out.println("Задача 4");
        byte ageHuman = 67;
        if (ageHuman >= 2 && ageHuman <= 6) {
        System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
    } else {
        if (ageHuman >= 7 && ageHuman <= 17) {
        System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
    } else {
        if (ageHuman >= 18 && ageHuman <= 24) {
        System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет.");
    } else {
        if (ageHuman >= 25) {
        System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу.");
    } else {
        System.out.println("тевирп");
                    }
                }
            }
        }
        System.out.println("Задача 5");
        byte childAge = 15;
        if (childAge <= 5){
        System.out.println("Если возраст ребенка равен "+ childAge +", то ему нельзя кататься на аттракционе.");
    }else {
        if (childAge > 5 && childAge <= 14) {
        System.out.println("Если возраст ребенка равен "+ childAge +", то ему можно кататься на аттракционе в сопровождении взрослого." );
    }else {
        if (childAge > 14){
        System.out.println("Если возраст ребенка равен "+ childAge +", то ему можно кататься на аттракционе без сопровождения взрослого.");
    }else {
        System.out.println("низя!.");
                }
            }
        }
        System.out.println("Задача 6");
        int carriageCapacity = 102;
        int seatingPositions = 60;
        int peopleInTheCarriage = 33;
        if (peopleInTheCarriage >= carriageCapacity) {
            System.out.println("Вагон уже полностью забит.");
    } else {
        if ( peopleInTheCarriage < carriageCapacity && peopleInTheCarriage > seatingPositions) {
        System.out.println("Сидячих мест нет, но есть стоячие места.");
    }else {
        System.out.println("В вагоне есть сидячие и стоячие места.");
        }
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if ( one > two && one > three) {
            System.out.println("one больше всех." );
    } else {
        if (two > one && two > three) {
        System.out.println( "two больше всех.");
    } else {
        if ( three > one && three > two) {
        System.out.println("three больше всех.");
    } else {
        if (one == two && one > three){
        System.out.println(" one и two больше three");
    } else {
        if (two == three && two > one) {
        System.out.println("two и three больше one.");
    } else {
        if (three == one && three > two) {
        System.out.println("three и one больше two.");
    } else {
        System.out.println("ура, вот это да, все значения равны! ");
                            }
                        }
                    }

                }
            }
        }


    }
}