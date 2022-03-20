import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> l=new ArrayList<>();
        if (data==null){
            return null;
        }
        for(int i=0; i<data.size();i++){
            if((data.get(i)%k==0) && (data.get(i)%n!=0)){
                l.add(data.get(i));
            }
        }
        return l;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList <Integer> l=new ArrayList<>();
        int o=1;
        l.add(o);
        if(size==1){
            return l;
        }
        for(int i=2;i<=size;i++){
            for(int j=1;j<=i;j++){
                o+=1;
                l.add(i);
                if(o==size){
                    return l;
                }
            }
        }
        return l;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        HashSet<Integer> per=new HashSet();
        if(s1==null || s2==null){
            return null;
        }
        for(int i:s1){
            for(int j:s2){
                if(i==j){
                    per.add(i);
                }
            }
        }
        return per;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        HashSet<Integer> ob=new HashSet();
        if(s1==null || s2==null){
            return null;
        }
        ob.addAll(s1);
        ob.addAll(s2);
        return ob;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> dop = new HashSet();
            for (int j : s2) {
                if (!s1.contains(j)) {
                    dop.add(j);
                }
            }
        return dop;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> isk=new HashSet<>();
        for(int i:s1){
            if(!s2.contains(i)){
                isk.add(i);
            }
        }
        for(int j:s2){
            if(!s1.contains(j)){
                isk.add(j);
            }
        }
        return isk;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        HashMap<String, Double> list=new HashMap<>();
        double a;
        for(int i=0;i<data.size();i++){
            a=0;
            for(int j=0; j<data.size();j++){
                if(data.get(i)==data.get(j)){
                    a++;
                }
            }
            list.put(data.get(i),a/data.size()*100);
        }
        return list;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        HashMap<String, Double> list=new HashMap<>();
        double mean=0, max=-10000000, min = 10000000;
        for(int i=0;i<data.size();i++){
            if(data.get(i)<min){
                min=data.get(i);
            }
            if(data.get(i)>max){
                max=data.get(i);
            }
            mean+=data.get(i)/data.size();
        }
        list.put("mean", mean);
        list.put("max", max);
        list.put("min", min);
        return list;
    }
}
