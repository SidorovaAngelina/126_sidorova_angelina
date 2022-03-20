public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        // Вычислить и вернуть минимальный из трех полученных аргументов (first, second, third)
        // ------------------------------------------------------------------------------------
        int minim = first;
        if (second < minim) {
            minim = second;
        }
        if (third < minim) {
            minim = third;
        }
        return minim;
    }

    @Override
    public boolean subtask_2_if(int year) {
        // Проверить, является ли год, переданный в параметре year, високосным.
        // Високосный год - это год, кратный четырем, но не кратный 100, либо кратный 400
        // ------------------------------------------------------------------------------------
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else return false;
    }

    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        // Проверить, лежит ли точка с координатами (x, y) внутри невырожденного квадрата
        // со сторонами, параллельными осям координат, левый верхний угол которого имеет
        // координаты (left_up_x, left_up_y), ширина которого width, высота height.
        // Точка на границе считается не лежащей внутри.
        // В качестве результата вернуть:
        // 0 - не лежит
        // 1 - лежит
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------

        if ((width < .000001) || (height < .000001)) {
            return 2;
        }

        if (((Math.abs(left_up_x - x) < .000001) || (left_up_x > x)) || ((Math.abs(x - (left_up_x + width)) < .000001) || ((left_up_x + width) < x)) || ((Math.abs(left_up_y - y) < .000001) || (left_up_y < y)) || ((Math.abs(y - (left_up_y - height)) < .000001) || ((left_up_y - height) > y))) {
            return 0;
        } else return 1;
    }


    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {
        // Проверить, как расположена точка с координатами (x0, y0)
        // относительно прямой y = kx + b
        // В качестве результата вернуть:
        // 0 - лежит выше прямой
        // 1 - лежит ниже прямой
        // 2 - лежит на прямой
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        double n = k * x0 + b;
        if (Math.abs(n - y0) < .000001) {
            return 2;
        } else if (y0 < n) {
            return 1;
        } else return 0;
    }


    @Override
    public String subtask_5_switch(int day_of_week) {
        // По номеру дня недели day_of_week вернуть его название на русском языке, записанное
        // с большой буквы. Дни недели отсчитываются с единицы. Если номер задан некорректно,
        // вернуть строку "Ошибка"
        // -----------------------------------------------------------------------------------
        String result;
        switch (day_of_week) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            default:
                result = "Ошибка";
        }
        return result;
    }


    @Override
    public String subtask_6_switch(int direction) {
        // По заданному направлению direction вернуть его название:
        // 1 - север
        // 2 - юг
        // 3 - запад
        // 4 - восток
        // Во всех остальных случаях вернуть пустую строку
        // ------------------------------------------------------------------------------------
        String result = "";
        switch (direction) {
            case 1:
                result = "север";
                break;
            case 2:
                result = "юг";
                break;
            case 3:
                result = "запад";
                break;
            case 4:
                result = "восток";
                break;
        }
        return result;


        // Замените данный оператор кодом, решающим поставленную задачу.
    }


    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        // Проверить, достигнет ли снаряд, летящий из точки (0, 0, 0)
        // в направлении (vx, vy, vz) со скоростью speed стены, параллельной плоскости OYZ,
        // имеющей координату x равной wall, за время time
        // 0 - не достигнет
        // 1 - достигнет
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        if (((Math.abs(vx) < .000001) && (Math.abs(vy) < .000001) && (Math.abs(vz) < .000001)) || (Math.abs(wall) < .000001) || (time < .000001) || (speed < .000001)) {
            return 2;
        }

        double length = Math.sqrt(vx * vx + vy * vy + vz * vz);
        double nx = vx / length;
        double vsx = nx * speed;
        double sx = vsx * time;

        if ((sx*wall) <= 0) return 0;
        if (Math.abs(sx - wall) < .000001) {
            return 1;
        } else if (Math.abs(sx) < Math.abs(wall)) {
            return 0;
        } else return 1;
    }


    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        // Проверить, как друг относительно друга располагаются прямые y = k1*x + b1 и
        // y = k2*x + b2. Вернуть
        // 1 - если параллельны
        // 2 - если пересекаются
        // 3 - если совпадают
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        if (Math.abs(k1 - k2) >= .000001) {
            return 2;
        } else {
            if (Math.abs(b1 - b2) < .000001) {
                return 3;
            } else return 1;
        }
    }

}