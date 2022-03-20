public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        if (size<=0){
            return null;
        }
        int [] array;
        array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=a0+d*i;
        }
        return array;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        if (size <= 0)
            return null;
        int [] array;
        array = new int[size];
        array[0] = 1;
        for(int i = 0; i < size; ++i)
        {
            int predSum = 0;
            for (int j = 0; j < i; ++j)
                predSum += array[j];
            array[i] += predSum;
        }
        return array;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        if (size <= 0)
            return null;
        int [] array = new int[size];
        array[0] = 0;
        if(size == 1)
            return array;
        array[1] = 1;
        for(int i = 2; i < size; ++i)
            array[i] = array[i - 2] + array[i - 1];
        return array;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int maximum;
        maximum=data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]>maximum){
                maximum=data[i];
            }
        }
        return maximum;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int maximum=-100000000;
        for(int i=1;i<data.length;i++){
            if((data[i]>maximum)&&(data[i]%k==0)){
                maximum=data[i];
            }
        }
        return maximum;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        if(arr1 == null || arr2 == null)
            return null;
        int size = arr1.length + arr2.length;
        int arr[] = new int[size];
        int i = 0;

        for(; i < arr1.length; ++i)
            arr[i] = arr1[i];
        for (int j = 0; j < arr2.length; ++j)
            arr[i + j] = arr2[j];

        for(i = 0; i < size; ++i)
        {
            for (int j = 0; j < size - i - 1; ++j)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        if(arr1 == null || arr2 == null)
            return null;
        int size = arr1.length + arr2.length;
        int arr[] = new int[size];
        int main = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length || j < arr2.length) {
            if(i < arr1.length)
            {
                if(j < arr2.length)
                {
                    if (arr1[i] > arr2[j] || j + 1 == arr2.length) {
                        arr[main] = arr1[i];
                        ++main;
                        ++i;
                    }
                }
                else
                {
                    arr[main] = arr1[i];
                    ++main;
                    ++i;
                }
            }
            else if (j < arr2.length)
            {
                arr[main] = arr2[j];
                ++main;
                ++j;
            }
        }

        return arr;
    }
}
